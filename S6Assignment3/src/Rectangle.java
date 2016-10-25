public class Rectangle implements Shape{
private double length, breadth;	
	//default constructor	
public Rectangle(){		
length = 1;		
breadth = 1;	
}		
public Rectangle(double length, double breadth){		
this.breadth = breadth;		
this.length = length;	
}	
	//override method	
public double getPerimeter() {		
return 2 * (length + breadth); 	
}
	//override method	
public double getArea() {		
return length * breadth;	
}
}
