import java.util.*;

abstract class Employee{
	
	int SSN;
	String firstName;
	String lastName;
	
	Employee(String firstName,String lastName,int SSN){
		this.SSN=SSN;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	abstract double earnings();
	
	public String toString(){
		return this.firstName+" "+this.lastName +"\nSocial security number "+this.SSN;
	}
	
}

class SalariedEmployee extends Employee{
	double weeklySalary;
	
	SalariedEmployee(){
		super(null,null,0);
		this.weeklySalary=0;
	}
	
	SalariedEmployee(String firstName,String lastName,int SSN,double weeklySalary){
		super(firstName,lastName,SSN);
		this.weeklySalary=weeklySalary;
	}
	
	double earnings(){
		return this.weeklySalary;
	}
	
	public String toString(){
    return "Salaried Employee: "+this.firstName+" "+this.lastName+"\nSocial security number: "+this.SSN+"\nWeekly Salaray: "+this.weeklySalary;
	
	}
	
}

class HourlyEmployee extends Employee{
	
	double wage,hours;

	
	HourlyEmployee(){
		super(null,null,0);
		this.wage=0;
	    this.hours=0;
	}
	
	HourlyEmployee(String firstName,String lastName,int SSN,double wage,double hours){
	super(firstName,lastName,SSN);
	this.wage=wage;
	this.hours=hours;
	}
	
	double earnings(){
		if(this.hours<=40)
			return this.hours*this.wage;
		else
			return 40*this.wage+(this.hours-40)*wage*1.5;
	}
	
	public String toString(){
    
	return "Hourly Employee: "+this.firstName+" "+this.lastName+"\nSocial security number: "+this.SSN+"\nWage: "+this.wage+" Hours: "+this.hours;
	
	}
	
}


class ComissionEmployee extends Employee{
	
	double comissioRate,grossSales;
	
	ComissionEmployee(){
		super(null,null,0);
		this.grossSales=0;
	    this.comissioRate=0;
	}
	
	ComissionEmployee(String firstName,String lastName,int SSN,double comissioRate,double grossSales){
	super(firstName,lastName,SSN);
	this.grossSales=grossSales;
	this.comissioRate=comissioRate;
	}
	
	double earnings(){
		return this.comissioRate*this.grossSales;
	}
	
	public String toString(){
    
	return "Comission Employee: "+this.firstName+" "+this.lastName+"\nSocial security number: "+this.SSN+"\nGross Sale: "+this.grossSales+"\nComission Rate: "+this.comissioRate;
	
	}
	
}

class BasePlusComissionEmployee extends ComissionEmployee {
	
	double baseSalary;
	
	BasePlusComissionEmployee(){
		super(null,null,0,0,0);
		this.baseSalary=0;
	}
	
	BasePlusComissionEmployee(String firstName,String lastName,int SSN,double comissioRate,double grossSales,double baseSalary){
	super(firstName,lastName,SSN,comissioRate,grossSales);
	this.baseSalary=baseSalary;
	}
	
	double earnings(){
		return super.earnings()+baseSalary;
	}
	
	public String toString(){
    
	return "Base Plus Comission Employee: "+this.firstName+" "+this.lastName+"\nSocial security number: "+this.SSN+"\nGross Sale: "+this.grossSales+"\nComission Rate: "+this.comissioRate+"\nBase Salary: "+this.baseSalary;

	
	}
	
}

public class Driver{
	
	public static void main(String[] args){
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of employees to be created : ");
		int num=in.nextInt();
		Employee[] employees=new Employee[num];
		
       for(int i=0;i<num;i++){
		   
		System.out.println("Select type of employee :\n 1)Salaried Employee \n 2)Hourly Employee \n 3)Comission Employee \n 4)Base Plus Comission Employee");
		int selection=in.nextInt();
		in.nextLine();
		System.out.println("Input Frist Name : ");
		String firstName=in.nextLine();
		
		System.out.println("Input Last Name : ");
		String lastName=in.nextLine();
		
		System.out.println("Input SNN : ");
		int SSN=in.nextInt();
		
		if(selection==1){
			System.out.println("Input Weekly Salary : ");
		    double weeklySalary=in.nextDouble();
			employees[i]=new SalariedEmployee(firstName,lastName,SSN,weeklySalary);
		}
		
		if(selection==2){
		System.out.println("Input Hours : ");
		double hours=in.nextDouble();
		System.out.println("Input Wage : ");
		double wage=in.nextDouble();
		employees[i]=new HourlyEmployee(firstName,lastName,SSN,wage,hours);
     	}
		
		if(selection==3){
		System.out.println("Input comissioRate : ");
		double comissioRate=in.nextDouble();
		System.out.println("Input grossSales : ");
		double grossSales=in.nextDouble();
		employees[i]=new ComissionEmployee(firstName,lastName,SSN,comissioRate,grossSales);
     	}
		
		if(selection==4){
		System.out.println("Input comissioRate : ");
		double comissioRate=in.nextDouble();
		System.out.println("Input grossSales : ");
		double grossSales=in.nextDouble();
		System.out.println("Input baseSalary : ");
		double baseSalary=in.nextDouble();
		employees[i]=new BasePlusComissionEmployee(firstName,lastName,SSN,comissioRate,grossSales,baseSalary);
     	}
		
		System.out.println("\n");
	   }
	   
	   for(int i=0;i<num;i++){
		   System.out.print(employees[i]);
		   System.out.println("\nEarning is "+employees[i].earnings());
		   System.out.println("\n");
	   }
	}
	
}