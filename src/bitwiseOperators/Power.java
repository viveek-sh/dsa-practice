package bitwiseOperators;

public class Power {
    static void main() {
        int base = 5;
        int exp = 6;
        System.out.printf("%d ^ %d = %d",base,exp,getPower(base,exp));

    }
    static int getPower(int base, int exp){
        int ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ans *= base;
            }
            base *= base;
            exp >>= 1;
        }
        return ans;
    }
}