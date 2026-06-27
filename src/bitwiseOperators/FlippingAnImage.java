//https://leetcode.com/problems/flipping-an-image/
//832. Flipping an Image: Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
package bitwiseOperators;

import java.util.Arrays;

public class FlippingAnImage {
    static void main() {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        Flipimage(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

    }
    static int[][] Flipimage(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            reverseArr(arr[i]);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] ^= 1;
            }
        }
        return arr;

    }

    static void reverseArr(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
}
