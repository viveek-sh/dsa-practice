package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class FactorsofN {
    static void main() {
        bruteForce(20);
        printFactors(20);

    }
    //O(n)
    static void bruteForce(int n){
        System.out.println("Brute Force Approach: ");
        for (int i = 1; i <= n; i++) {
            if((n % i) == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
    static void printFactors(int n) {
        System.out.println("Optimized Soloution : ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                }
                System.out.print(i + " ");
                list.add(n / i);
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
