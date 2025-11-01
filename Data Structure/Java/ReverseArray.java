
import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {11, 12, 13, 14, 15};
        System.out.println("Array: " + Arrays.toString(numbers));

        int i = 0;
        int j = numbers.length - 1;

        while ( i  < j){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(numbers));
    }

    public static void printArray(int[] arr){
        for (int num: arr){
            System.out.print(num + "");
        }
        System.out.println();


    }
}
