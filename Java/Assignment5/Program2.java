import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the number of overs: ");
		int n = sc.nextInt();
		
		int runs[] = new int[n];
		
		System.out.println("Enter the number of runs for each over: ");;
		for(int i=0; i<n; i++) {
			runs[i] = sc.nextInt();
		}
		
		System.out.println("Enter the over number: ");
		int choice = sc.nextInt();
		
		System.out.println("Runs scored in this over : "+runs[choice-1]);
		
		}
		catch(ArrayIndexOutOfBoundsException arrExc) {
			System.out.println(arrExc);
		}
		catch(NegativeArraySizeException negArrSizeExc) {
			System.out.println(negArrSizeExc);
		}
	}

}
