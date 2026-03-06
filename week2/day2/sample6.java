package week2.day2;
import java.util.Scanner;
public class sample6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE TRAFFIC LIGHT COLOR:");
        String trafficLight = scan.nextLine();

        if( trafficLight.equals("green")){
            System.out.println("go");

        }
        else if ( trafficLight.equals("yellow"))
        {
            System.out.println("slow down");
        }
        else{
            System.out.println("stop"); 
        }
        

       
    }

}
