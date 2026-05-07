package stringBuilder;

public class CheckPalindrome {
    static void main() {
        String str = "abdcdba";
        if (checkPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }

    }
    static boolean checkPalindrome(String str) {
        String[] strArr = str.split("");
        int start = 0;
        int end = strArr.length - 1;
        while (start < end) {
            if (strArr[start].equals(strArr[end])) {
                start++;
                end--;
            }else  {
                return false;
            }
        }
        return true;
    }
}
