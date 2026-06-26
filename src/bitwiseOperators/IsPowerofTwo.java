//https://leetcode.com/problems/power-of-two/
//231. Power of Two

package bitwiseOperators;

public class IsPowerofTwo {
    static void main() {
        int a = 1;
        if(check(a)){
            System.out.printf("The %d is power of 2",a);
        }else{
            System.out.printf("The %d is not power of 2",a);
        }

    }
    static boolean check(int n){
        return n > 0 && (n & (n - 1)) == 0;
    }
}
