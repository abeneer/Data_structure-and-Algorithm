package Array;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args){
        int[] numbers = {11, 12, 14, 18, 4, 89,89 };
        System.out.println("before swap:" + Arrays.toString(numbers));
        swap(numbers, 2, 5);
        System.out.println("After swap:" + Arrays.toString(numbers));


    }
    static void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    
}

