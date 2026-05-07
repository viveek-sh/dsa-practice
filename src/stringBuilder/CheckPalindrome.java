package stringBuilder;

public class CheckPalindrome {
    static void main() {
        String str = "abdcdba";
        if (checkPalindrome(str) == 1) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }

    }
    static int checkPalindrome(String str) {
        String[] strArr = str.split("");
        int start = 0;
        int end = strArr.length - 1;
        while (start < end) {
            if (strArr[start].equals(strArr[end])) {
                start++;
                end--;
            }else  {
                return -1;
            }
        }
        return 1;
    }
}
