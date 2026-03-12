//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.


package searching;
import java.util.Arrays;

public class firstLastPosition {
    static void main() {
        int[] arr = {4,6,7,7,7,7,8,8,10};
        int[] pos = searchRange(arr, 7);
        System.out.println(Arrays.toString(pos));

    }
    static int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        range[0] = findIndex(nums,target, true);
        if(range[0] != -1)
            range[1] = findIndex(nums,target,false);
        return range;
    }
    static int findIndex(int[] nums, int target, boolean first){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid + 1;
            } else if(nums[mid] > target){
                end = mid - 1;
            } else{
//                potential element found
                ans = mid;
                if(first){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
