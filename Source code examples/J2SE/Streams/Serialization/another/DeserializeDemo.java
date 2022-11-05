import java.io.*;

class DeserializeDemo {
  public static void main(String[] args) {
    Employee e = null;
    try {
      FileInputStream fileIn = new FileInputStream("employee.txt");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      e = (Employee) in.readObject();
      in.close();
      fileIn.close();
    } catch (Exception i) {
      i.printStackTrace();
    } 

    System.out.println("Name: " + e.name);
    System.out.println("Address: " + e.address);
    System.out.println("SSN: " + e.SSN);
    System.out.println("Number: " + e.number);
  }
}
