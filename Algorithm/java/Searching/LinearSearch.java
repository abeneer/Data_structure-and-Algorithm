package Algorithm.java.Searching;

public class LinearSearch {
    public static void main(String[] args){
        int[] nums = {23, 45,1, 2, 7, 69, 88, 12};
        int target = 7;
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        System.out.println(ans);
        System.out.println(ans2);

        
    }


    // Search the tergrt and return the element

    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element : arr){
            if(element == target){
                return element;
            }
        }
        return -1;
    }

    // return the index if found else -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        return -1;
    }
}
