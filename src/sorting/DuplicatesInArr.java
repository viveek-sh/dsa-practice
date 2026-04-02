//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Find All Duplicates in an Array

package sorting;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArr {
    static void main() {
        int[] arr = {1,1,2};
        List duplicates = findDuplicates(arr);
        System.out.println(duplicates);
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while ( i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }else {
                i++;
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index+1){
                duplicates.add(nums[index]);
            }
        }
        return duplicates;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
