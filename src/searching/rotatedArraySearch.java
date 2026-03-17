//https://leetcode.com/problems/search-in-rotated-sorted-array/
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
package searching;

public class rotatedArraySearch {
    static void main() {
        int[] arr = {4 , 5, 6, 7, 9, 11, 0, 1, 2};
        System.out.println("Pivot of the array : "+FindPivot(arr));
        System.out.println("Search in Rotated Sorted Array : "+RotatedSearch(arr,9));
        int[] arr2 = {2,2,2,7,0,1,2};
        System.out.println("Pivot in Array with Duplicate elemenmt : "+FindPivotWithDuplicate(arr2));
        int[] arr3 = {1,2,3,4,5,6};
        System.out.println(search(arr3,1));
    }
    static int RotatedSearch(int[] arr, int target){
        int pivot = FindPivot(arr);
        // If pivot = -1 array is not roated
        if(pivot == -1){
            return BinSearch(arr, target, 0, arr.length-1);
        } else if (arr[pivot] == target) {
            return pivot;
        } else if(target >= arr[0]){
            return BinSearch(arr, target, 0, pivot-1);
        }else {
            return BinSearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static boolean search(int[] nums, int target) {
        int pivot = FindPivotWithDuplicate(nums);
        if (pivot == -1) {
            return BinSearch(nums, target, 0, nums.length - 1) != -1;
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return BinSearch(nums, target, 0, pivot - 1) != -1;
        }
        return BinSearch(nums, target, pivot + 1, nums.length - 1) != -1;
    }
    static int FindPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            } else if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
//        This will not work in case if the element of the array are not distinct
        return -1; // array not rotated
    }
    static int BinSearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) /2;
            if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    // Find pivot in a rotated array with duplicate elements
    static  int FindPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            } else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // Skip the duplicate elements
            else if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // First check if they are pivots
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
                continue;
            }
            // Shift window on condition
            if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return -1; // array not rotated
    }
}
