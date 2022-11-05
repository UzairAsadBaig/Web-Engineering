import java.util.*;

class indexOccupiedException extends Exception{
	
	public String toString(){
		return "This index is already occupied";
	}
	
}
class nonPositiveException extends Exception{
	
	public String toString(){
		return "Value of height and weight cannot be negative";
	}
	
}
class indexException extends Exception{
	
	public String toString(){
		return "This index is empty";
	}
	
}
class NegativeArraySizeException extends Exception{
	
	public String toString(){
		return "The size of array cannot be negative";
	}
	
}


class Health{
	
	String name;
	double height;
	double weight;
	double BMI;
	
	Health(){
		this.name=null;
		this.height=0;
		this.weight=0;
		this.BMI=0;
	}
	
	Health(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.BMI= this.weight/this.height;
	}
	
}



public class Driver{
	
    Health array[];	
	
	void setArray(int sizeOfArray) throws NegativeArraySizeException{
		if(sizeOfArray<0)
			throw new NegativeArraySizeException();
		this.array=new Health[sizeOfArray];
	}
	
	
	void Save(String name,double height,double weight,int index) throws indexOccupiedException,nonPositiveException{
		
		if(this.array[index]!=null)
			throw new indexOccupiedException();
		if(height<0 || weight<0)
			throw new nonPositiveException();
		
		this.array[index]=new Health(name,height,weight);
		
	}
	
	void Retrieve(int index) throws indexException{
		if(this.array[index]==null)
			throw new indexException();
	    
        System.out.print("Name : "+this.array[index].name+"\nHeight : "+this.array[index].height+"\nWeight : "+this.array[index].weight+"\nBMI : "+this.array[index].BMI+"\n\n");		
	}
	
	
	void RetrieveAll()throws indexException{
		
		for(int i=0; i<this.array.length;i++){
			
			if(this.array[i]!=null)
				this.Retrieve(i);
			
		}
		
	}
	
	
	
	
	public static void main(String args[]){
	
	Scanner in =new Scanner(System.in);
    System.out.println("Enter the number of people (size of array)");
    int sizeOfArray= in.nextInt();
    Driver obj=new Driver();
	
	try{
    obj.setArray(sizeOfArray);	
    int a=1;
	while(a==1){
	System.out.println("1. Add value in the array ");
	System.out.println("2. Print the information of specific User at index n");
	System.out.println("3. Print the information of all the users");
	System.out.println("4. Exit\n");
//	in.nextInt();
	int sel= in.nextInt();
	
		if(sel==1){
		String name;
		double height,weight;
		int index;
		
		System.out.println("Enter the name ,height weight and index one by one and press enter");
		
		name =in.next();
		height=in.nextDouble();
		weight=in.nextDouble();
		index= in.nextInt();
	
	    obj.Save(name,height,weight,index);	
	}
	
	if(sel==2){
		int index;
		System.out.println("Enter the index");
		index= in.nextInt();
	    obj.Retrieve(index);
	
	}


    if(sel==3){
		
		obj.RetrieveAll();
		
	}
	
	if(sel==4){
		a=2;
	}
	}
		
	}
	catch(Exception err){
		System.out.print(err);
	}
    
		
	}
	
}









