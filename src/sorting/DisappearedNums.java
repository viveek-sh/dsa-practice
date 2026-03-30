//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//Find All Numbers Disappeared in an Array
package sorting;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNums {
    static void main() {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(solution(arr));


    }
    static List<Integer> solution(int[] nums){
        int i = 0;
        while (i < nums.length){
            int cIndex = nums[i] - 1;
            if(nums[i] != nums[cIndex]){
                swap(nums,i, cIndex);
            }else {
                i++;
            }
        }
        List<Integer> disappeared = new ArrayList<>();
        for(int x = 0; x < nums.length; x++){
            if(nums[x] != x+1){
                disappeared.add(x+1);
            }
        }
        return disappeared;

    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
