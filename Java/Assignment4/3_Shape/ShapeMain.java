package shape;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Circle\r\n"
				+ "Square\r\n"
				+ "Enter the shape: ");

		
		String shape = sc.next();
		int value = 0;
		if(shape.equalsIgnoreCase("circle")) {
			System.out.println("Enter the radius: ");
			value = sc.nextInt();
			
			Circle cr1 = new Circle();
			cr1.calculateArea(value);
		}
		else if(shape.equalsIgnoreCase("square")) {
			System.out.println("Enter the radius: ");
			value = sc.nextInt();
			
			Square sq1 = new Square();
			sq1.calculateArea(value);
		}
		else {
			System.out.println("Invalid Input.");
		}
		
	}

}
