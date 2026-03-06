package week2.day2;
import java.util.Scanner;

public class sample4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();

        if(score>35 && score<59){
            System.out.println("i can get video game as a gift");
        }
        else if(score>60 && score<89){
            System.out.println("i can get a bicycle as a gift");
        }
        else if(score>90 && score<100){
            System.out.println("i can get a laptop as a gift");

        }
        else{
            System.out.println(" better luck next time !");
        }
        }
        
       }


