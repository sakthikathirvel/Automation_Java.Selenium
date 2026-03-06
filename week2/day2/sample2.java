package week2.day2;
import java.util.Scanner;

public class sample2 {
    public static void main( String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num=scan.nextInt();

        if( num%3==0 && num%5==0){
            System.out.println( "yes !"+ num  +" is divisible by 3 and 5 ");
        }
        else
        {
            System.out.println(" no !"+num+" is not divisible by 3 and 5 ");
        }

    }
}
