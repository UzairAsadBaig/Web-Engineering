import java.util.*;


class Student {
	
	String name;
	String rollNo;
	String password;
	String section;
	int creditHour;
	
	Student(){
		this.name=null;
		this.rollNo=null;
		this.password=null;
		this.section=null;
		this.creditHour=0;
	}
	
	Student(String name,String rollNo,String password,String section,int creditHour){
		this.name=name;
		this.rollNo=rollNo;
		this.password=password;
		this.section=section;
		this.creditHour=creditHour;	
	}
	
	void setName(String name){
		this.name=name;
	}
	
	String getName(){
		return this.name;
	}
	
	void setRoll(String rollNo){
		this.rollNo=rollNo;
	}
	String getRoll(){
		return this.rollNo;
	}
	
	void setPass(String password){
		this.password=password;
	}
	String getPassword(){
		return this.password;
	}
	
	void setSection(String section){
		this.section=section;
	}
	String getSection(){
		return this.section;
	}
	
	void setCreditHours(int creditHour){
		this.creditHour=creditHour;
	}
	int getCreditHours(){
		return this.creditHour;
	}
		
	public String toString(){
		return "\n\nName : "+ this.name+"\nRoll no. : "+this.rollNo+"\nSection : "+this.section+"\nPassword : "+this.password+"\nCredit Hours : "+this.creditHour;
	}
}

class  ProgramCoorinator{
	
	ArrayList<Student> students;
	
	ProgramCoorinator(){
		students=new ArrayList<Student>();
	}
	
	void registerNewStudent(String name,String rollNo,String password,String section){
		students.add(new Student(name,rollNo,password,section,15));
	}
	
	int getIndex(String rollNo){
		int index=-1;
		for(int i=0;i<students.size();i++){
			if(students.get(i).rollNo.equals(rollNo)){
				
				index=i;
			}
				
		}
		return index;
	}
	
	void assignASection(String section){
		for(int i=0;i<students.size();i++){
		students.get(i).setSection(section)	;	
		}
		
	}
	
	
	void removeCourse(String rollNo){
		int index=this.getIndex(rollNo);
		students.get(index).creditHour=students.get(index).creditHour-3;	
	}
	
	void  removeAStudent(String rollNo){
		int index=this.getIndex(rollNo);
		students.remove(index);	
	}
	
	void  displayAStudent(String rollNo){
		
		int index=this.getIndex(rollNo);
		if(index==-1){
			System.out.print("\nStudent with roll number "+ rollNo+" is not available.\n");
			return;
		}
			
		System.out.print(students.get(index));	
	}
	
	
	
    	
	
}


class Driver{
	
	public static void main(String args[]){
	
	/*
	ProgramCoorinator sirIdrees=new ProgramCoorinator();
    sirIdrees.registerNewStudent("Uzair","Bsef19m540","123","Morning");	
    sirIdrees.registerNewStudent("Uzair","Bsef19m539","123","Morning");	
    
    sirIdrees.removeCourse("Bsef19m540");
	
	sirIdrees.assignASection("Super");

    sirIdrees.removeAStudent("Bsef19m540");
    sirIdrees.displayAStudent("Bsef19m539");	
	 */
	 
     ProgramCoorinator cord=new ProgramCoorinator();
	 while(true){
		 int sel;
		 Scanner in=new Scanner(System.in);
		 System.out.println("\n\n1) Add a new student\n2)Assign a section\n3)Remove course of a student\n4)Remove a student\n5)Display a student\n6)Exit\n");
		 sel=in.nextInt();
		 in.nextLine();
		 String name,rollNo,section,password;
		 switch(sel){
			 
			 case 1:
			 System.out.println("Enter name");
			 name=in.nextLine();
			 System.out.println("Enter rollNo");
			 rollNo=in.nextLine();
			 System.out.println("Enter password");
			 password=in.nextLine();
			 System.out.println("Enter section");
			 section=in.nextLine();
			 cord.registerNewStudent(name,rollNo,password,section);
			 break;
			 case 2:
			 System.out.println("Enter section");
			 section=in.nextLine();
			 cord.assignASection(section);
			 break;
			 case 3:
			 System.out.println("Enter rollNo");
			 rollNo=in.nextLine();
			 cord.removeCourse(rollNo);
			 break;
			 case 4:
			 System.out.println("Enter rollNo");
			 rollNo=in.nextLine();
			 cord.removeAStudent(rollNo);
			 break;
			 case 5:
			 System.out.println("Enter rollNo");
			 rollNo=in.nextLine();
			 cord.displayAStudent(rollNo);
			 break;
			 case 6:
			 System.exit(0);
			 break;
			 
		 }
		 
		 
		 
		 
		 
		 
	 }
	
	} 
	
	
}