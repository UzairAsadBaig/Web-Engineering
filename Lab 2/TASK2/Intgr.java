class Intgr{
    
    private int integer;
	
	void setInt(int integer){
		this.integer=integer;
	}
	
	int getInt(){
		return this.integer;
	}
	Intgr(){
		this.integer=0;
	}
	Intgr(int integer){
		this.integer=integer;
	}
	Intgr(Intgr integer){
		this.integer=integer.getInt();
	}

    Intgr sum(Intgr num1){
		return new Intgr(this.getInt()+num1.getInt());
	}
	public static void main(String[] args){
	 Intgr a=new Intgr(2);
	 Intgr b=new Intgr(a);
	 Intgr c;
     c=a.sum(b);
     System.out.println(c.getInt());	 
	}
}