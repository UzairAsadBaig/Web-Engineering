import java.util.*;
import java.sql.*;


class Student {
	
	String studentName;
	String rollNo;
	String address;
	String city;
	int phone;
	Double CGPA;
	
	Student(){
		this.studentName=null;
		this.rollNo=null;
		this.address=null;
		this.city=null;
		this.phone=0;
		this.CGPA=0.0;
	}
	
	Student(String studentName,String rollNo,String address,String city,int phone,double CGPA){
		this.studentName=studentName;
		this.rollNo=rollNo;
		this.address=address;
		this.city=city;
		this.phone=phone;	
		this.CGPA=CGPA;
	}
	
	void setstudentName(String studentName){
		this.studentName=studentName;
	}
	
	String getstudentName(){
		return this.studentName;
	}
	
	void setRoll(String rollNo){
		this.rollNo=rollNo;
	}
	String getRoll(){
		return this.rollNo;
	}
	
	void setAddress(String address){
		this.address=address;
	}
	String getAddress(){
		return this.address;
	}
	
	void setCity(String city){
		this.city=city;
	}
	String getCity(){
		return this.city;
	}
	
	void setPhone(int phone){
		this.phone=phone;
	}
	int getPhone(){
		return this.phone;
	}
	
	void setCGPA(double CGPA){
		this.CGPA=CGPA;
	}
	double getCGPA(){
		return this.CGPA;
	}
		
	public String toString(){
		return "\n\nStudent Name : "+ this.studentName+"\nRoll no. : "+this.rollNo+"\nCity : "+this.city+"\nAddress : "+this.address+"\nPhone : "+this.phone+"\nCGPA : "+this.CGPA;
	}
}

class  ProgramCoorinator{
	
	ArrayList<Student> students;
	
	ProgramCoorinator(){
		students=new ArrayList<Student>();
	}
	
	void InsertRecord(String studentName,String rollNo,String address,String city,int phone,double CGPA)throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/university";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();
	Student temp=new Student(studentName,rollNo,address,city,phone,CGPA);
	String query="insert into profile(rollNo, studentName, address, city,phone,CGPA) values('"+temp.rollNo+"', '"+temp.studentName+"', '"+temp.address+"','"+temp.city+"',"+temp.phone+","+temp.CGPA+")";
		
     int status = st.executeUpdate( query );

   
     if(status > 0){
	    System.out.println("Student inserted successfully into the database.");
	  }
     
     else{
    	 System.out.println("Student could not be inserted into the database.");
         }
	}
	
	void find(String studentName) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/university";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();
	String query="Select * from profile where studentName='"+studentName+"'";
		
    try{
		 ResultSet ret = st.executeQuery( query );
	
	Student temp=new Student();
	ret.next();
	temp.setstudentName(ret.getString("studentName"));
	temp.setRoll(ret.getString("rollNo"));
	temp.setAddress(ret.getString("address"));
	temp.setCity(ret.getString("city"));
	temp.setPhone(ret.getInt("phone"));
	temp.setCGPA(ret.getDouble("CGPA"));
     System.out.print(temp);
	 }
	catch(Exception e){
		System.out.print("\nStudent not found\n");
	}
	}
	
	void loadRecords() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://127.0.0.1/university";
    Connection con=DriverManager.getConnection(url,"root","root");
    Statement st=con.createStatement();
	String query="Select * from profile";
		
     ResultSet ret = st.executeQuery( query );
	Student temp=new Student();
	System.out.print("\n-----------------------------\n");
	
	try{
		while(true){
			ret.next();
			temp.setstudentName(ret.getString("studentName"));
			temp.setRoll(ret.getString("rollNo"));
			temp.setAddress(ret.getString("address"));
			temp.setCity(ret.getString("city"));
			temp.setPhone(ret.getInt("phone"));
			temp.setCGPA(ret.getDouble("CGPA"));
			 System.out.print(temp);
	}
	}
	catch(Exception err){
		
		System.out.print("\n-----------------------------\n");
		
	}
	}
	
	// int getIndex(String rollNo){
		// int index=-1;
		// for(int i=0;i<students.size();i++){
			// if(students.get(i).rollNo.equals(rollNo)){
				
				// index=i;
			// }
				
		// }
		// return index;
	// }
	
	// void assignAcity(String city){
		// for(int i=0;i<students.size();i++){
		// students.get(i).setcity(city)	;	
		// }
		
	// }
	
	
	// void removeCourse(String rollNo){
		// int index=this.getIndex(rollNo);
		// students.get(index).phone=students.get(index).phone-3;	
	// }
	
	// void  removeAStudent(String rollNo){
		// int index=this.getIndex(rollNo);
		// students.remove(index);	
	// }
	
	// void  displayAStudent(String rollNo){
		
		// int index=this.getIndex(rollNo);
		// if(index==-1){
			// System.out.print("\nStudent with roll number "+ rollNo+" is not available.\n");
			// return;
		// }
			
		// System.out.print(students.get(index));	
	// }
	
	
	
    	
	
}


class Driver{
	
	public static void main(String args[]){
	
	/*
	ProgramCoorinator sirIdrees=new ProgramCoorinator();
    sirIdrees.registerNewStudent("Uzair","Bsef19m540","123","Morning");	
    sirIdrees.registerNewStudent("Uzair","Bsef19m539","123","Morning");	
    
    sirIdrees.removeCourse("Bsef19m540");
	
	sirIdrees.assignAcity("Super");

    sirIdrees.removeAStudent("Bsef19m540");
    sirIdrees.displayAStudent("Bsef19m539");	
	 */
	 
     ProgramCoorinator cord=new ProgramCoorinator();
	 while(true){
		 int sel;
		 Scanner in=new Scanner(System.in);
		 System.out.println("\n\n1) Add a new student into the datatbase\n2)Find a student\n3)Load all students from database\n4)Exit\n");
		 sel=in.nextInt();
		 in.nextLine();
		 String studentName,rollNo,city,address;
		 int phone;
		 double CGPA;
		 try{
		 switch(sel){
			 
			 case 1:
			 System.out.println("Enter Student Name");
			 studentName=in.nextLine();
			 System.out.println("Enter Roll No");
			 rollNo=in.nextLine();
			 System.out.println("Enter Address");
			 address=in.nextLine();
			 System.out.println("Enter City");
			 city=in.nextLine();
			 System.out.println("Enter Phone");
			 phone=in.nextInt();
			 in.nextLine();
			 System.out.println("Enter CGPA");
			 CGPA=in.nextDouble();
			 
				 
			 cord.InsertRecord(studentName,rollNo,address,city,phone,CGPA);
			 
			
			 break;
			 case 2:
			 System.out.println("Enter name");
			 studentName=in.nextLine();
			 cord.find(studentName);
			 break;
			 case 3:
			 cord.loadRecords();
			 break;
			 case 4:
			 System.exit(0);
			 break;
			 }
			  
		 }
		 catch(Exception e){
				 System.out.print(e);
			 }
		 
		 
		 
		 
		 
		 
	 }
	
	} 
	
	
}