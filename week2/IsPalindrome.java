package week1.day2;

public class IsPalindrome {
    public static void main(String []args){

        int num=131;
        int org=num;
        int check=0;

        while(num>0){
            int digit=num%10;
            check=check*10+digit;            
            num=num/10;

          
        }
          if(org==check){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not a palindrome");
            }


    }

}
