package searching;

public class cellingFloorNum {
    static void main() {
        int[] arr = {1,2,4,5,8,10,13,15, 23,26,34};
        System.out.print("Celling of the Number : ");
        System.out.println(getCelling(arr,20));
        System.out.print("Floor of the Number : ");
        System.out.println(getFloor(arr,20));


    }
    // Find a No in array >= target else return Integer.MAX_VALUE
    static int getCelling(int[] arr, int target){
        if( target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (arr[mid] < target) {
                 start = mid + 1;
             } else if (arr[mid] > target) {
                 end = mid - 1;
             } else {
                  return mid;
             }
         }
        return start;
    }

    //Find the floor of a Number
    static  int getFloor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
