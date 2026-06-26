package bitwiseOperators;

public class nthMagicNumber {
    static void main() {
        System.out.println("1st Magic Number : "+findNum(1));
        System.out.println("2nd Magic Number : "+findNum(2));
        System.out.println("3rd Magic Number : "+findNum(3));

    }
    static int findNum(int n){
        int num = 0;
        int base = 5;
        while(n > 0){
            int last = n & 1;
            num += last * base;
            base = base * 5;
            n = n >> 1;
        }
        // No so  good approach
//        for (int i = 0; i < 8; i++) {
//            if(((n >> i) & 1) == 1){
//                num +=(int) Math.pow(5,i+1);
//            }
//        }
        return num;
    }
}
