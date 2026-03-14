// Consider you have been given an infinite array, and you have to return the index of element by searching it in the array
// Constraints : as array is infinite arr.length can't be used as length is unknown
package searching;

public class searchInfiniteArray {
    static void main() {
        int[] arr = {2, 5, 7, 9, 12, 15, 18, 21, 24, 30,32,35,37,39,41,43,44,46,48,51,54,57,59,60,63,65};
        System.out.println(arr.length);
        System.out.println(searchArray(arr, 65));

    }
    // return the index of element from an infinite array
    static int searchArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        int index = -1;

        while (end < arr.length && arr[end] < target) {
            start = end;          // shrink left boundary
            end = end * 2;        // double the window
        }
        try{
            index = binarySearch(arr, target, start, end);
        }catch (ArrayIndexOutOfBoundsException e){}
        return index;
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (arr[mid] == target){
                    return mid;
                }else if (arr[mid] < target) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1;  // mid was out of bounds, so shrink right
            }
        }
        return -1;
    }
}
