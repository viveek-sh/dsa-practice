package searching;

public class binarySearch1 {
    static void main() {
        int[] arr = {2,3,5,6,12,15,15,15,19,24,28,47,64};
        int target = 15;
//        System.out.println(arr.length);
        System.out.println("Index of "+target+" in arr: "+binarySearch(arr,target));
        int[] arrDec = {98,91, 88, 76, 65, 54, 43, 21, 15, -1};
        System.out.println("Index of "+target+" in arrDesc: "+enhBinSearch(arrDec, target));

    }
    // find the index of a target element in a sorted array using binary search else return -1
    // Works only for ascending sorted array
    static int binarySearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < target)
                start = mid + 1;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                return mid;
        }

        return -1;
    }

    // OrderAgnostic Binary Search
    static int enhBinSearch(int[] arr, int target){
        int start = 0; int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if(target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
