public class tryCatch{
	
	
	void m2() throws Exception{
		throw new Exception("Error pharo");
		
		
	}
	
	
	void m1(){
		try{
		this.m2();
		}
		catch(Exception err){
			System.out.println("This message is beinng displayed from m1");
		}
	}
	
	
	public static void main(String args[]){
		
		
		try{
			try{
			throw new Exception("Aye wala pharo");	
			}
			
		}
		catch(Exception err){
			
			System.out.prinln("Error ka message hai : " + err.getMessage());
			
		}
		
	}
	
}