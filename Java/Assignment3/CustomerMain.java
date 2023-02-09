import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Company name: ");
		String name = sc.nextLine();
		System.out.println("Enter employees: ");
		String employees = sc.nextLine();
		System.out.println("Enter Teamlead: ");
		String teamlead = sc.nextLine();
		
		Company c1 = new Company();
		
		c1.setName(name);
		c1.setEmployees(employees.split(","));
		c1.setTeamlead(teamlead);
		
		System.out.println("Name: "+name);
		System.out.println("Employee: "+employees);
		if(employees.contains(teamlead)) {
			System.out.println("Lead: "+teamlead);
		}else {
			System.out.println("Invalid input.");
		}
		
		
	}

}
