import java.util.*;

public class demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter salary: ");
        double salary = sc.nextInt();
        System.out.println("enter shifts: ");
        double shifts = sc.nextInt();

        if(salary>8000){
        System.out.println("salary too large");
        }
        else if(salary<0){
        System.out.println("salary too small");
        }
        else if(shifts<0){
        System.out.println("shifts too small");
        }
        else{
            double food = salary*0.2;
            double travel = salary*0.3;
            double extra = salary*0.02*shifts;

            double saving = salary - food - travel + extra;
    
            System.out.println(saving);


        }

    }
}