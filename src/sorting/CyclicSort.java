package sorting;

import java.util.Arrays;

public class CyclicSort {
    static void main() {
        int[] arr =  {3,5,2,1,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {3,5,4,0,2,1};
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    // Only work if the array contains number from 1 - N
    static  void cycleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
    // Cyclic sort for array containing 0 to N-1
    static void sort(int[]  arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
