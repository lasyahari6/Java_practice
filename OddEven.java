/*Odd or Even*/
import java.util.*;

class OddEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2!=0) System.out.println("Weird");  /*calculate to get number is odd*/
        else
            if(n>=2&&n<=5)System.out.println("Not Weird");
            else if(n>=6 && n<=20) System.out.println("Weird");
            else System.out.println("Not Weird");
        scan.close();
    }
}