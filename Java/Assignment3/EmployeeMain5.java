import java.util.Scanner;

public class EmployeeMain5 {

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
		
		System.out.println("Verify and Update the details:");
		int temp=0;
		while(temp!=4) {
			System.out.println("Manu \n1. Update Employee name\r\n"
					+ "\r\n"
					+ "2. Update Employee Address\r\n"
					+ "\r\n"
					+ "3. Update Employee mobile\r\n"
					+ "\r\n"
					+ "4. All information correct/Exit");
			
			temp = sc.nextInt();
			sc.nextLine();
				switch (temp) {
				case 1: {
					System.out.println("Current name is: "+ e1.getName());
					System.out.println("Enter the name: ");
					name = sc.nextLine();
					e1.setName(name);
					break;
				}
				case 2: {
					System.out.println("Current address is: "+ e1.getAddress());
					System.out.println("Enter the address: ");
					adress = sc.nextLine();
					e1.setAddress(adress);
					break;
				}
				case 3: {
					System.out.println("Current mobile is: "+ e1.getMobile());
					System.out.println("Enter the mobile number: ");
					mobile = sc.nextLine();
					e1.setMobile(mobile);
					break;
				}
				case 4: {
					System.out.println("Name: "+e1.getName());
					System.out.println("Address: "+e1.getAddress());
					System.out.println("Mobile: "+e1.getMobile());
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + temp);
				}
		}
		

	}

}
