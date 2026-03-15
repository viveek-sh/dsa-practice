//https://leetcode.com/problems/find-in-mountain-array/
package searching;

public class SearchInMountainArr {
    static void main() {
        int[] arr = {0, 2, 4, 6, 7, 9, 5, 3, 2, 1};
        System.out.println(MountainArrPeak(arr));
        System.out.println(MountainArrSearch(arr, 3));

    }
    static int MountainArrSearch(int[] arr, int target) {
        int peak = MountainArrPeak(arr);
        int index = BinSearch(arr, target, 0, peak, true);
        if (index != -1) {
            return index;
        }
        return BinSearch(arr, target, peak + 1, arr.length - 1, false);
    }
    static int MountainArrPeak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int BinSearch(int[] arr, int target, int start, int end, boolean asc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } return -1;
    }
}
