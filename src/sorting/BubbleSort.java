package sorting;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {25,27,43,3,38,4,10,12};
        sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));


    }
    static void sort(int[] arr){
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                }
            }
            // If no swaps happened in first pass, already sorted
            if (!swap) break;
        }
    }
}
