/*Find Numbers with Even Number of Digits
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
Given an array nums of integers, return how many of them contain an even number of digits.

Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
*/

package searching;
public class findNumsWithEvenDigits {
    static void main() {
        int[] nums = {12,345,2,6,7896, 233,2342, -28};
        int res = findNumbers(nums);
        System.out.println(res);

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(containEvenDigits(num)){
                count++;
            }
        }
        return count;
    }
    static boolean containEvenDigits(int num){
//        int digit = 0;
//        while(num >  0){
//            num /= 10;
//            digit++;
//        }
        int digit = (int)(Math.log10(num))+1;
        if ((digit % 2) == 0){
            return true;
        }
        // Slower Approach
//        String numString = String.valueOf(num);
//        if ((numString.length()%2) == 0){
//            return true;
//        }
        return false;
    }
}
