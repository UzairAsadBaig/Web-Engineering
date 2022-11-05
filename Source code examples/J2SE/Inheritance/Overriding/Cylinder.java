import java.util.*;

public class Cylinder extends Circle {


protected double length;


public Cylinder(double radius, double length)
{
	super(radius);
	this.length = length;
}


 // method overriden here
public double getArea()
	{ return 2*super.getArea()+2*Math.PI*radius*length; }


}
