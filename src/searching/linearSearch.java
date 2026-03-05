package searching;
public class linearSearch {
    static void main(String[] args) {
        int[] nums = {3, 134, 453, 24, 45, 64, -13};
        int target = 24;
        System.out.println(linearSearch(nums, target));
        System.out.println(target+" exist in array: "+linearSearch2(nums, target));

        //Searching in Range
        int exist = searchInRange(nums, target,0,3);
        if(exist != -1){
            System.out.println(target+" exsist in range 0,3 at index: "+exist);
        }else {
            System.out.println(target+" does not exist in range 0,3");
        }

        // Minimum element from the array
        System.out.println("Minimum element from arr : "+searchMin(nums));

        // Searching in string
        String str = "Hello World";
        System.out.println("W exist in str: "+linearSearchString(str, 'W'));

    }
    //Return index of element if present in the array else return -1
    static int linearSearch(int[] arr, int target){
        // if array is empty
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    //Return true if element exists else false
    static boolean linearSearch2(int[] arr, int target){
        // if array is empty
        if(arr.length == 0){
            return false;
        }
        for (int element: arr){
            if (element == target){
                return true;
            }
        }
        return false;
    }

    // Search in a range and return the index of the element else '-1'
    static int searchInRange(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if( arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Search the min element in the array
    static int searchMin(int[] arr){
        if(arr.length == 0){
            return Integer.MAX_VALUE; //edge case return max int
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    // Linear Search a Char in String
    static  boolean linearSearchString(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (char ch : str.toCharArray()){
            if  (ch == target){
                return true;
            }
        }
        // Traditional for loop
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == target){
//                return  true;
//            }
//        }
        return  false;
    }
}
