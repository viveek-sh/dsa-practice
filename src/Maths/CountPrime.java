package Maths;

public class CountPrime {
    static void main() {
        int n = 50;
        boolean[] composite = new boolean[n+1];
        int count = sieve(n,composite);
        System.out.println("No of Prime : "+count);


    }
    static int sieve(int  n, boolean[] composite ){
        for (int i = 2; i * i <= n ; i++) {
            if(!composite[i]){
                for (int j = i*i; j <=n ; j+=i) {
                    composite[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n ; i++) {
            if(!composite[i]) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        return count;
    }
}
