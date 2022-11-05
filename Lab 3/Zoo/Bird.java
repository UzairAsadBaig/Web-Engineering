
package Zoo;

public class Bird{
	
	int id;
	String name;
	String color;
	String voice;
	
	public Bird(){
		this.id=0;
		this.name=null;
		this.color=null;
		this.voice=null;
	}
	
	public Bird(int id,String name,String color,String voice){
		this.id=id;
		this.name=name;
		this.color=color;
		this.voice=voice;
	}
	
	public Bird(Bird other){
		this.id=other.id;
		this.name=other.name;
		this.color=other.color;
		this.voice=other.voice;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getName(){
		return this.name;
	} 
	public void setName(String name){
		this.name=name;
	}
	
	public String getColor(){
		return this.color;
	} 
	public void setColor(String color){
		this.color=color;
	}
	
	public String getVoice(){
		return this.voice;
	} 
	public void setVoice(String voice){
		this.voice=voice;
	}
	
	public String toString(){
		return "ID: "+this.id+"\nName: "+this.name+"\nColor: "+this.color+"\nVoice: "+this.voice+"\n\n\n";
	}
	
}