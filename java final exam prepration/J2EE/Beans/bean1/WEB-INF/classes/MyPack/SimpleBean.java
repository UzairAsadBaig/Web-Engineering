package MyPack;
import java.io.*;

public class SimpleBean implements java.io.Serializable {

	/* Properties */
	private String name = null;
	private int age = 0;
        private String email=null;

	/* Empty Constructor */
	public SimpleBean() {}

	/* Getter and Setter Methods */
	public String getName() {
		return name;
	}

	public void setName(String s) {
		name = s;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int i) {
		age = i;
	}
       
        public String getEmail() {
		return email;
	}

	public void setEmail(String e) {
		email = e;
	}
}
