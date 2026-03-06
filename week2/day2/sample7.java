package week2.day2;
import java.util.Scanner;
public class sample7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("enter salary amount");
        int salary = scan.nextInt();
        

       System.out.println("enter the age ");
       int age = scan.nextInt();

       if(salary>=20000 || age<25){
        int requiredLoanAmount=scan.nextInt();
        if(requiredLoanAmount<=50000){
            System.out.println("loan approved");
        }
        else if (requiredLoanAmount>50000){
            System.out.println("loan not approved");
        }
        else{
            System.out.println("invalid loan amount");
        }
        
        

        
    }

}
}
