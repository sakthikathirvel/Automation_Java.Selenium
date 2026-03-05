package week2.day1;

public class fibonnaciSeries {
    
    public static void main(String[] args) {
        int n = 8;
        int a = 0, b = 1, c;
        System.out.print(a + " " + b);
        for (int i = 0; i < n; i++) {
            c = a + b;//1,2
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}



