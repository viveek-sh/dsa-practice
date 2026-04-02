//https://leetcode.com/problems/set-mismatch/description/
//Set Mismatch
package sorting;

import java.util.Arrays;

public class SetMismatch {
    static void main() {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIn = nums[i] - 1;
            if(nums[i] != nums[correctIn]){
                swap(nums, i, correctIn);
            }else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return new int[] {nums[j], j  + 1};
            }
        }
        return new  int[] {-1-1};
    }
    static void swap(int[] arr, int a, int b){
        int temp =  arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
