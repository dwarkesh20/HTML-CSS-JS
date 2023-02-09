import java.util.Scanner;

public class SumOfOddDgit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("enter num: ");
        String num = sc.next();
        
        char arr[] = num.toCharArray();
        int sum = 0;
        
        for (int i = 0; i < num.length(); i++) {
			int n = arr[i]- '0';
			if(n%2!=0) {
				sum+=n;
			}
		}
        System.out.println(sum);
	}
}
