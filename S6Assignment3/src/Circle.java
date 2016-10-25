public class Circle implements Shape {
private double radius;		
public Circle(){		
radius = 1;	
}		
public Circle(double radius){		
this.radius = radius;	
}	
//override method	
public double getPerimeter() {		
return 2 * Math.PI * radius; 	
}
	//override method	
public double getArea() {		
return Math.PI * radius * radius;	
}
}
