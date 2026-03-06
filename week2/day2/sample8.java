package week2.day2;
import java.util.Scanner;
public class sample8 {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    System.out.println("enter num1 :");
     int num1=scan.nextInt();

        System.out.println("enter num2 :");
     int num2=scan.nextInt();

        int compare =num1>num2? num1 : num2;
        System.out.println("the greater number is :"+compare);






}
}
