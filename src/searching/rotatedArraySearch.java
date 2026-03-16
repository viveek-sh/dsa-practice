//https://leetcode.com/problems/search-in-rotated-sorted-array/
package searching;

public class rotatedArraySearch {
    static void main() {
        int[] arr = {4 , 5, 6, 7, 9, 11, 0, 1, 2};
        System.out.println("Pivot of the array : "+FindPivot(arr));
        System.out.println("Search in Rotated Sorted Array : "+RotatedSearch(arr,9));
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
}
