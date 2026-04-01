//https://leetcode.com/problems/find-the-duplicate-number/
//Find the Duplicate Number

package sorting;

public class DuplicateNum {
    static void main() {
        int nums[] = {3,1,3,4,2};
        int ans = soloution(nums);
        System.out.println(ans);

    }
    static int soloution(int[] nums){
         int i = 0;
         while(i < nums.length){
             int correctIndex = nums[i] - 1;
             if(nums[i] != nums[correctIndex]){
                 swap(nums, i, correctIndex);
             }else {
                 i++;
             }
         }
         for(int index = 0; index < nums.length; index++){
             if(nums[index] != index+1){
                 return nums[index];
             }
         }
         return nums.length;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
