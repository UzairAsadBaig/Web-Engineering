
public class Static_method{

    public static void main(String[] args) {
       
	int no1 = 50;
        int no2 = 150;
      
        int add=addition(no1,no2);

        System.out.println("Your Result is:" + add);
    }

    public static int addition(int n1,int n2)
	{
		return n1+n2;
	}

}
