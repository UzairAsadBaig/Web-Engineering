class B extends A{
    int d;

   B(int l, int m, int n, int o){
      super(l,m,n);
      d=o;
      }

   void Show(){
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      System.out.println("c = " + c);
      System.out.println("d = " + d);
    }

    public static void main(String args[]){
      B b = new B(4,3,8,7);
      b.Show();
		
    }
  }