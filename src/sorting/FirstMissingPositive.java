//https://leetcode.com/problems/first-missing-positive/
//First Missing Positive
package sorting;

import java.util.Arrays;

public class FirstMissingPositive {
    static void main() {
        int[] arr = {7,11,9,8,12};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIn = nums[i] - 1 ;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIn]){
                swap(nums, i, correctIn);
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int x = 0; x < nums.length; x++ ){
            if(nums[x] != x+1){
                return x+1;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int a, int b){
        int temp =  arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
