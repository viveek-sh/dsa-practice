//https://leetcode.com/problems/number-of-1-bits/
//191. Number of 1 Bits also known as the Hamming weight
package bitwiseOperators;

public class NoOfSetBits {
    static void main() {
        int a = 10;
        System.out.printf("Number of set bits in %d is : %d",a, FindBits(a));
    }
    static int FindBits(int n){
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
