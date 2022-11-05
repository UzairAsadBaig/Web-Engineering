//Set up a Client that will read information sent from a server
//and tx the information.

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client implements ActionListener{
        private JTextField enter;
        private JTextArea tx;
        ObjectOutputStream output;
        ObjectInputStream input;
        String message = " ";

        public Client()
        {
            JFrame jf=new JFrame("Client");
            Container c = jf.getContentPane();

            enter = new JTextField();
            enter.setEnabled( false );
            enter.addActionListener(this);

            c.add( enter,BorderLayout.NORTH );

             tx = new JTextArea();
             c.add( new JScrollPane( tx ),BorderLayout.CENTER );

             jf.setBounds(300,0,300,150);
             jf.setVisible(true);
 }

 public void actionPerformed( ActionEvent e )
                      {
 						 if(e.getSource()==enter){
                            String s = e.getActionCommand();
                            try {
							  	   output.writeObject("CLIENT >>> " + s );
							       output.flush();
							       tx.append( "\nCLIENT >>> " + s );
							    }
							    catch(IOException c) {
							    tx.append( "\nError writing object" );
           }
	   }
 }

 public void runClient()
 {
     Socket client;

     try {
           // Step 1: Create a Socket to make connection.
           tx.setText("Attempting connection\n" );
           client = new Socket(
              InetAddress.getByName( "127.0.0.1" ), 1000 );
              tx.append( "Connected to: " +
                 client.getInetAddress().getHostName() );

          //Step 2: Get the input and output streams.
          output = new ObjectOutputStream(
                        client.getOutputStream() );
          output.flush();
          input = new ObjectInputStream(
                     client.getInputStream() );
          tx.append( "\nGot I/O streams\n" );

         //Step 3: Process connection.
           enter.setEnabled( true );

          do {
                try {
                    message = (String) input.readObject();
                    tx.append("\n" + message );
                    tx.setCaretPosition(
                       tx.getText().length() );
                 }
                 catch(ClassNotFoundException c) {
                    tx.append("\nUnknown object" );
                 }
             }while (!message.equals( "SERVER >>> BYE" ) );

       //Step 4:Close Connection.
       tx.append( "Closing connection.\n" );
       input.close();
       output.close();
       client.close();
      }
      catch (EOFException eof) {
                System.out.println( "Server terminated connection" );
      }
      catch(IOException e) {
      e.printStackTrace();
     }
  }


    public static void main( String args[] )
    {
       Client app = new Client();
       app.runClient();
    }
    }

