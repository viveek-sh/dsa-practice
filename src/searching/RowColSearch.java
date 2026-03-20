package searching;

import java.util.Arrays;

public class RowColSearch {
    static void main() {
        int[][] arr2D = {{10,22,31,43}, {13,25,34,46},{17,28,36,49}};
        int[] index = SearchMatrix(arr2D,28);
        System.out.println(Arrays.toString(index));

    }
    // If the Matrix is sored Row and Column wise
    static int[] SearchMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col > 0){
            if( matrix[row][col] == target){
                return new int[] {row,col};
            }else if(matrix[row][col] < target){
                row ++;
            }else {
                col --;
            }
        }
        return new int[] {-1,-1};
    }
}
