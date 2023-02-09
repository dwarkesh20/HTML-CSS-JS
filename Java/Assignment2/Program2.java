import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        if(n<0) {
        	System.out.println("Invalid array size");
        	return;
        }
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0) {
            	System.out.println("Invalid input");
            	return;
            }
        }
		
		int score = sc.nextInt();
		if(score<0) {
			System.out.println("Invalid score");
        	return;
		}
		
		for (int i = 1; i < arr.length; i+=2) {
			if(arr[i]>score) {
				System.out.println(arr[i-1]);
			}
			
		}

	}

}
