import java.util.Scanner;

public class Poweof2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("enter num: ");
        int num = sc.nextInt();

        if(num<=0){
        System.out.println("Number too small");
        }
        else if(num>32767){
        System.out.println("Number too large");
        }
        else {
			while(num%2==0){
				num /= 2;
			}
			if(num==1) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}

	}

}
