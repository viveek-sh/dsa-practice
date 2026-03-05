package searching;

import java.util.Arrays;

public class search2DArray {
    static void main() {
        int[][] arr= {
            {1, 2, 3, 4},
            {5, 6, 23},
            {7, 8, 9}
        };
        int target = 2;
        int[] exist = searchElement(arr, target);
        System.out.println(exist[0] != -1 ? "Found at index " + Arrays.toString(exist) : "Element not found");
        System.out.println("Max element in arr: "+searchMax(arr));

    }
    //Search for element and return the index else -1
    static int[] searchElement(int[][] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Search the max element from the arr
    static  int searchMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] row : arr){
            for(int element : row){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
