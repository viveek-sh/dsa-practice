//https://leetcode.com/problems/split-array-largest-sum/description/
//Split Array Largest Sum
package searching;

public class SplitArrayLargestSum {
    static void main() {
        int arr[] = {7,2,5,10,8};
        int m = 2;
        System.out.println(SplitArrayLargestSum(arr,2));



    }
    static int SplitArrayLargestSum(int[] nums, int m){
        int start = 0;
        int end = 0;

        //Calculate Min and Max Limit of Sum
        for (int element : nums){
            end += element;
            if (element > start){
                start = element;
            }
        }

        while (start < end){
            int mid = start + (end - start) / 2;
            int blocks = 1;
            int sum = 0;
            // Fill the elements in blocks with max sum as mid
            for (int num : nums){
                if (sum + num > mid){
                    sum = num;
                    blocks++;
                } else {
                    sum += num;
                }
            }
            if (blocks <= m){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
