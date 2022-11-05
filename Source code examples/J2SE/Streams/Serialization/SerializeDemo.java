import java.io.*;

 class SerializeDemo {

  public static void main(String[] args) {

    Employee e = new Employee();
    e.name = "Ahmed";
    e.address = "Lahore";
    e.SSN = 11111;
    e.number = 101;

    try {
      FileOutputStream fileOut = new FileOutputStream("employee.txt");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);

      out.writeObject(e);

      out.close();
      fileOut.close();
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
