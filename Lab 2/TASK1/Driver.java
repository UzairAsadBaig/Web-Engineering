import java.util.*;


class Shape{

}

class TwoDimensionalShape extends Shape{
	double getArea(){
			return 0;			
	}
}

class ThreeDimensionalShape extends Shape{
	
	double getArea(){
		return 0;
	}
	
	double getVolume(){
		return 0;
	}
}
	
class Circle extends TwoDimensionalShape{
	
	double radius;
	
	Circle(double radius){
	  this.radius=radius;	
	}
	
	double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	public String toString(){
		return "\nThe area of Circle is " + this.getArea();
	}
}	

class Square extends TwoDimensionalShape{
	
	double length;
	
	Square(double length){
		this.length=length;
	}
	
	double getArea(){
		return this.length*this.length;
	}

	public String toString(){
		return "\nThe area of Square is " + this.getArea();
	}	
}

class Triangle extends TwoDimensionalShape{
	
	double length;
	double height;
	
	Triangle(double length,double height){
		this.length=length;
		this.height=height;
	}
	
	double getArea(){
		return (0.5)*this.length*this.height;
	}
	
	public String toString(){
	return "\nThe area of Triangle is " + this.getArea();
	}
}

class Sphere extends ThreeDimensionalShape{
	double radius;
	 
	Sphere(double radius){
		this.radius=radius;
	} 
	
	double getArea(){
		return 4*Math.PI*this.radius*this.radius;
	}
	
	double getVolume(){
		return (4.0/3.0)*Math.PI*this.radius*this.radius*this.radius;
	}
	public String toString(){
	return "\nThe area of Sphere is " + this.getArea()+"\n The volume of Sphere is " + this.getVolume()+"\n";
	}	
}

class Cube extends ThreeDimensionalShape{
	double length;
	 
	Cube(double length){
		this.length=length;
	} 
	
	double getArea(){
		return 6*this.length*this.length;
	}
	
	double getVolume(){
		return this.length*this.length*this.length;
	}
	
	public String toString(){
	return "\nThe area of Cube is " + this.getArea()+"\n The volume of Cube is " + this.getVolume()+"\n";
	}		
}

class Tetrahedron extends ThreeDimensionalShape{
	double length;
	 
	Tetrahedron(double length){
		this.length=length;
	} 
	
	double getArea(){
		return Math.sqrt(3)*this.length*this.length;
	}
	
	double getVolume(){
		return (6*this.length*this.length*this.length)/(6*Math.sqrt(2));
	}
	public String toString(){
	return "\nThe area of Tetrahedron is " + this.getArea()+"\n The volume of Tetrahedron is " + this.getVolume()+"\n";
	}		
}

class Driver {
	
	
	public static void main(String[] args){   
	
	double radius,length,height,base;
	
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter the length : ");
	length=in.nextDouble();
	
	System.out.println("Enter the radius : ");
	radius=in.nextDouble();
	
	System.out.println("Enter the height : ");
	height=in.nextDouble();

	System.out.println("Enter the base : ");
	base=in.nextDouble();
	
	TwoDimensionalShape circ=new Circle(radius);
	TwoDimensionalShape sqr=new Square(length);
	TwoDimensionalShape tri =new Triangle(base,height);
	
	ThreeDimensionalShape sph=new Sphere(radius);
	ThreeDimensionalShape cub=new Cube(length);
	ThreeDimensionalShape tet=new Tetrahedron(length);
	
	Shape[] arr={circ , sqr , tri, sph , cub,tet}; 
	   
   
   
	//	Shape[] arr={new Circle(7) , new Square(7) , new Triangle(10,10), new Sphere(3) , new Cube(3),new Tetrahedron(3)}; 
	   
		for(int i=0;i<arr.length;i++){
			/*if(arr[i] instanceof TwoDimensionalShape){
				System.out.println(arr[i]);
			}
			else{
				System.out.println(arr[i]);
			}*/
			
			System.out.println(arr[i]);
		}
	}    
}



