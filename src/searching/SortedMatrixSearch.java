package searching;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class SortedMatrixSearch {
    static void main() {
        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        int target = 14;
        int[] index = MatrixBinSearch(matrix1,target);
        System.out.println("Index of "+target+" in the matrix : "+ Arrays.toString(index));

    }
    static int[] MatrixBinSearch(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Edge Case if there is only 1 Row
        if (rows == 1){
            return BinSearch(matrix, target, 0, 0, cols-1);
        }
        // Eliminate the rows till 2 rows are remaining in the matrix
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)){ //Statement true if there are more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        // Now two rows are remaining
        // Check weather the target is in mid Column
        if(matrix[rStart][cMid] == target ){
            return new int[]{rStart,cMid};
        } else if (matrix[rStart+1][cMid]  == target) {
            return new int[]{rStart+1,cMid};
        }
        // Seach in halves of the arrary
        // Search in First Half
        if(target <= matrix[rStart][cMid-1]){
            return BinSearch(matrix, target, rStart,0, cMid-1);
        }
        // second part
        else if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){
            return BinSearch(matrix, target, rStart,cMid+1, cols-1);
        }
        // third part
         else if(target <= matrix[rStart+1][cMid-1]){
            return BinSearch(matrix, target, rStart+1,0, cMid-1);
        }
        // fourth part
        else {
            return BinSearch(matrix, target, rStart+1,cMid+1, cols-1);
        }
    }
    // Search in specified row and between the cols
    static int[] BinSearch(int[][] matrix, int target, int row, int cStart, int cEnd){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            } else if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            }else {
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
