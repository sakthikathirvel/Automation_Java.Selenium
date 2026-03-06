package week2.day2;
import java.util.Scanner;

public class sample1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter whether rcb win or lose");
        String rcb= scan.nextLine();
        
        if( rcb.equals("win")){
            System.out.println("rcb is the winner");
        } 
        else
            {
            System.out.println("rcb is not the winner");
        }

    }

}

