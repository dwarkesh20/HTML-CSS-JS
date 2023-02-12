package shape;
import java.lang.Math;
public class Circle extends Shape {
	
	public void calculateArea(int value) {
		double area = Math.PI*value*value;
		System.out.println("Area of circle is: "+area);
	}
}
