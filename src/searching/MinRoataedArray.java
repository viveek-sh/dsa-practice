//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//Find Minimum in Rotated Sorted Array
package searching;

public class MinRoataedArray {
    static void main() {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println("Min Element in the Rotated Sorted Array : "+findMin(nums));
        int rotation = FindPivot(nums)+1;
        System.out.println("Number of Times Array is Rotated : "+rotation);
    }
    static int findMin(int[] nums) {
        int pivot = FindPivot(nums);
        return nums[pivot+1];
    }
    static int FindPivot(int[] arr){
        int start = 0;
        int end  = arr.length-1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(end > mid && arr[mid] > arr[mid+1]){
                return mid;
            }if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if( arr[start] >= arr[mid]){
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
