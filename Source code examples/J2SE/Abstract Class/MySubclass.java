public class MySubclass extends Myclass{

        public void displaySomething()
        { System.out.println("This method is 'displaySomething' and declared in abstract class");}

        public void display()
        { System.out.println("This method is 'display' and declared in abstract class");}


public static void main(String args[]){
      MySubclass b = new MySubclass();
      b.display();
      b.show();

  }

}

