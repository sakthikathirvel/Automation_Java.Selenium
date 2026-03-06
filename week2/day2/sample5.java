package week2.day2;
import java.util.Scanner;
public class sample5 {

    public static void main(String[] args) {
        
     Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THESUBJECT 1 MARKS");
         int sub1 = scan.nextInt();
       
         System.out.println("ENTER THESUBJECT 2 MARKS");
         int sub2 = scan.nextInt();
        
         System.out.println("ENTER THESUBJECT 3 MARKS");
        int sub3 = scan.nextInt();
       
        System.out.println("ENTER THESUBJECT 4 MARKS");
        int sub4 = scan.nextInt();
       
        System.out.println("ENTER THESUBJECT 5 MARKS");
        int sub5 = scan.nextInt();  
        int total = sub1+sub2+sub3+sub4+sub5;
        System.out.println("TOTAL MARKS :"+total);
      
        Double avrg = total/5d;
        System.out.println("AVERAGE MARKS :"+avrg);
        
        if( avrg <=35){
            System.out.println("YOU NEED SPECIAL ATTENTION");
        }
        else{
            System.out.println("YOU ARE PASSING IN ALL SUBJECTS");
        }

    

}
}

