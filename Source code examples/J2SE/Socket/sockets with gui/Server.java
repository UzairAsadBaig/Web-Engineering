//Set up a Server that will recieve a connection from a client,
//Send a string to the client, and close the connection.

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Server implements ActionListener {
        private JTextField enter;
        private JTextArea tx;
        ObjectOutputStream output;
        ObjectInputStream input;

        public Server()
        {
                JFrame jf=new JFrame( "Server" );

                Container c = jf.getContentPane();

                enter = new JTextField();
                enter.setEnabled( false );
                enter.addActionListener(this);

              c.add( enter, BorderLayout.NORTH );

              tx = new JTextArea();
              c.add(new JScrollPane( tx ),
                        BorderLayout.CENTER );

              jf.setBounds(0,0,300,150 );
              jf.setVisible(true);
        }

public void actionPerformed( ActionEvent e )
                      {
						  if(e.getSource()==enter)
                                sendData( e.getActionCommand() );
                      }

        public void runServer()
        {
          ServerSocket server;
          Socket connection;
          int counter = 1;

          try {
                //Step 1: Create a ServerSocket.
                server = new ServerSocket( 1000, 100 );

                while( true ) {
                //Step 2: Wait for a connection.
                tx.setText( "Waiting for connection\n" );
                connection = server.accept();

                tx.append( "Connection " + counter +
                   "recieved from: " +
                   connection.getInetAddress().getHostName() );

                //Step 3: Get input and output streams.
                output = new ObjectOutputStream(
                                   connection.getOutputStream() );
                output.flush();
                input = new ObjectInputStream(
                                connection.getInputStream() );
                tx.append( "\nGot I/O streams\n" );

                //Step 4: Process connection.
                String message =
                     "SERVER >>> Connection successful";
                output.writeObject( message );
                output.flush();
                enter.setEnabled( true );

                do {
                     try {
                           message = (String) input.readObject();
                           tx.append( "\n" + message );
                           tx.setCaretPosition(
                              tx.getText().length() );
                          }
                          catch( ClassNotFoundException cnfex ) {
                             tx.append(
                                "\nUnknown object type recieved" );
                          }
                    } while (!message.equals( "CLIENT >>> BYE" ) );

                    //Step 5: Close connection.
                    tx.append("\nUser terminated connection" );
                    enter.setEnabled( false );
                    output.close();
                    input.close();
                    connection.close();
                    ++counter;
               }
           }
           catch ( EOFException eof ) {
               System.out.println( "Client terminated connection" );
           }
           catch( IOException io ) {
              io.printStackTrace();
           }
     }

     private void sendData( String s )
     {
       try {
         output.writeObject( "SERVER >>> " + s );
         output.flush();
         tx.append(  "\nSERVER >>>" + s );
          }
          catch( IOException cnfex ) {
            tx.append(
              "\nError writing object" );
         }
     }

     public static void main( String args[] )
     {
       Server app = new Server();
       app.runServer();

     }
}
