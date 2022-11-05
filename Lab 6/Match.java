import java.util.*;
import java.io.*;

class Words implements Serializable{
	
	//Data Members
	String wordName;
	String meaning;

    //Getters and Setters	
	void setWordName(String wordName){
		this.wordName=wordName;
	}
	
	String getWordName(){
		return this.wordName;
	}
	
	void setMeaning(String meaning){
		this.meaning=meaning;
	}
	
	String getMeaning(){
		return this.meaning;
	}
	
	//Constructors
    Words(){
		this.wordName="";
		this.meaning="";
	}
	
	Words(String wordName,String meaning){
		this.wordName=wordName;
		this.meaning=meaning;
	}
   	
	//To Stirng Override
    @Override
    public String toString(){
		return "Word-name: "+this.wordName+"\nMeaning: "+this.meaning+"\n";
	} 	
}


class Match{
	
	
	
	

	
	
		public static void main(String args[]){
		try{
				Scanner in =new Scanner(System.in);
			String fileOne,fileTwo;
			System.out.println("Enter the value of first file");
			fileOne=in.nextLine();
			System.out.println("Enter the value of second file");
			fileTwo=in.nextLine();
			
			
			//Connection 1
			 // FileReader fs1=new FileReader(fileOne);
			 FileReader fs1=new FileReader("first.txt");
	         BufferedReader br1 = new BufferedReader(fs1);
			
			// Connection 2
			 // FileReader fs2=new FileReader(fileTwo);
			 FileReader fs2=new FileReader("second.txt");
	         BufferedReader br2 = new BufferedReader(fs2);
			 String line1="",line2="";
			
			double total=0,same=0;
			
			String strg1[]=null,strg2[]=null;
			while(((line1 = br1.readLine()) != null) && ((line2 = br2.readLine()) != null)){
				
				strg1=line1.split(" ");
				strg2=line2.split(" ");
				for(int i=0;i<strg1.length;i++){
				    
                  total=total+1;
					if(strg1[i].equals(strg2[i]))
						 same=same+1;
								
				}
				
			}
			double percentage=(same/total)*100;
			System.out.println("\nThe percentage of file match is  "+ percentage);
			   
			
			
		}
		catch(Exception err){
			System.out.print(err);
		}
			
		}
}