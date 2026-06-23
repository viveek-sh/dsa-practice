package recursion;
import java.util.Scanner;

public class fibonacci {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digits : ");
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));


    }
    static int Fibonacci(int n){
        if(n < 2){
            return n;
        }
        return  Fibonacci(n-1)+Fibonacci(n-2);
    }
}
