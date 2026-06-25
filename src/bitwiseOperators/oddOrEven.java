package bitwiseOperators;

public class oddOrEven {
    static void main() {
        checkEven(19);

    }
    static  void checkEven(int n){
        if((n & 1) == 1){
            System.out.println("Odd Number");
            return;
        }
        System.out.println("Even Number");
    }
}
