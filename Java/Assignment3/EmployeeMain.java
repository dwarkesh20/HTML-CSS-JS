import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee();
		
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter adress: ");
		String adress = sc.nextLine();
		System.out.println("Enter mobile: ");
		String mobile = sc.nextLine();
		
		e1.setName(name);
		e1.setAddress(adress);
		e1.setMobile(mobile);
		
		System.out.println("Employee Details");
		System.out.println("Name: "+e1.getName());
		System.out.println("Address: "+e1.getAddress());
		System.out.println("Mobile: "+e1.getMobile());

	}

}
