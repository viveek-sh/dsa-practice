package sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
         int[] arr = {3,45,25,2,65,1};
         sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int maxIndex = 0;
            for(int j = 0; j < arr.length - i; j++){
                if(arr[j] > arr[maxIndex]){
                    // Store the maxIndex of Max Element
                    maxIndex = j;
                }
            }

            // Swap max element with last unsorted position
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }
}
