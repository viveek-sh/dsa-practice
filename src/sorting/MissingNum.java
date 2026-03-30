//https://leetcode.com/problems/missing-number/
//Missing Number : Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
package sorting;

import java.util.Arrays;

public class MissingNum {
    static void main() {
        int[] arr = {0,3,1,4};
        int missing = findNum(arr);
        System.out.println(missing);

    }
    static int findNum(int[] arr){
        int i = 0;
        while (i < arr.length){
            if(arr[i] < arr.length && arr[i] != arr[arr[i]]){
                swap(arr, i, arr[i]);
            }else {
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int  x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
