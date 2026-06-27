package Maths;

public class CheckPrime {
    static void main() {
        int num =   11;
        System.out.printf("Is %d prime : %s",num,isPrime(num));

    }
    static  boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
//        for (int i = 2; i < Math.sqrt(n) ; i++) {
//            if (n % i == 0 ) {
//                return false;
//            }
//        }
        int a = 2;
        while ( a * a <= n){
            if (n % a == 0){
                return false;
            }
            a++;
        }
        return true;
    }
}
