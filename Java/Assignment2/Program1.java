import java.util.Scanner;

public class Program1 {

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
		
		int oddSum=0,evenSum=0;
		for(int i:arr){
            if(i%2==0) {
            	evenSum += i;
            }
            if(i%2!=0) {
            	oddSum += i;
            }
        }
		
		if(oddSum>=evenSum) {
			System.out.println(oddSum);
		}else {
			System.out.println(evenSum);
		}

	}

}
