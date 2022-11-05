package MyPack;

public class aBean implements java.io.Serializable{
  
	private String message;

 public aBean(){}
    
  public String getMessage() {
    return(message);
  }

  public void setMessage(String message) {
    this.message = message;
  }
}

