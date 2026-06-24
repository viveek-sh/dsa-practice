package recursion;

public class binSearch {
    static void main() {
        int[] arr = {10, 20 ,30 , 33, 34, 37};
        int index = BinSearch(arr, 30, 0, arr.length-1);
        System.out.println(index);
    }
    static int BinSearch(int [] arr, int target, int start, int end){
        int mid = start + ( end - start) / 2;
        if(start > end) {
            return -1;
        }
        if(target == arr[mid]){
            return mid;
        }
        if (target > arr[mid]){
            return BinSearch(arr, target, mid+1, end);
        }
        return BinSearch(arr, target, start, mid-1);

    }
}
