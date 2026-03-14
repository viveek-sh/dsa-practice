//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//Peak Index in a Mountain Array : You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.

package searching;

public class mountainArrayIndex {
    static void main() {
        int[] arr = {1,3,5,7,9,4,3,2};
        System.out.println(peakIndexInMountainArray(arr));

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end){
             int mid = start + (end - start) / 2;
             if(arr[mid] < arr[mid+1]){
                 start = mid+1;
             } else{
                 end = mid;
             }
        }
        return  start;
    }
}
