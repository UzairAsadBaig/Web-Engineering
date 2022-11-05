
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


class Dictionary{
	
	HashMap<String,Words> list;
	
	Dictionary(){
		this.list = new HashMap<String,Words>();
	}
	
	void addWord(Words word){
		this.list.put(word.wordName,word);
	}
	
    String find(String wordName){
		return this.list.get(wordName).getMeaning();
	}	
	
	void saveRecords(){
	try{
	 FileOutputStream fs=new FileOutputStream("dictionary.txt");
	 ObjectOutputStream os=new ObjectOutputStream(fs);
	 
	 for(String i: list.keySet())
		os.writeObject(list.get(i));
	 os.close();
	}
	catch(Exception e){
		
	}
	}
	
	void loadRecords(){
	try{
	 FileInputStream fs=new FileInputStream("dictionary.txt");
	 ObjectInputStream os=new ObjectInputStream(fs);
	 this.list.clear();
	 Words word;
	 
	 while(true){
		word=(Words)os.readObject();
		if(word==null)
			break;
		this.list.put(word.wordName,word);
	 }
	 
	}
	catch(Exception e){
	}
	}
	
}




public class Driver{
	
	
	
	public static void main(String args[]){
		Dictionary one=new Dictionary();
		Scanner in =new Scanner(System.in);
		Words word=new Words();
		boolean exit=false;
		while(exit==false){
		 
         System.out.print("\nWelcome to the dictionary, what do you want to do?\n1)Save Dictionary\n2)Load Dictionary\n3)Add Word\n4)Find Word\n5)Exit\n");		 
		 int sel=in.nextInt();
		 
		 in.nextLine();
		 
         switch(sel){
			 
			 case 2:
			 System.out.println("Dictionary Loaded\n");
			 one.loadRecords();
			 break;
			 case 1:
			 System.out.println("Dictionary Saved\n");
			 one.saveRecords();
			 break;
			 case 3:
			 System.out.println("Enter a word name");
			 word.wordName=in.nextLine();
			 System.out.println("\nEnter the meaning");
			 word.meaning=in.nextLine();
			 one.addWord(word);
			 break;
			 case 4:
			 System.out.println("Enter word\n");
			 String name=in.nextLine();
			 System.out.print("\n");
			 try{
			System.out.println(one.find(name));	 
			 }
			 catch(Exception err){
				 System.out.println("Word not found :)");
			 }
			 break;
			 case 5:
			 exit=true;
			 break;
			 
		 }		 
			
			
		}
		
	}
}