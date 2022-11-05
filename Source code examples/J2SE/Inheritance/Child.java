public class Child extends Parent{
  int a;

  Child( int p, float q){
    a = p;
    super.b = q;
    }

    void Show(){
    super.Show();
    System.out.println("b in sub class:  " + super.b);
    System.out.println("a in sub class:    " + a);  
}

  public static void main(String[] args){
    Child subobj = new Child(1, 5);
    subobj.Show();

  }



}