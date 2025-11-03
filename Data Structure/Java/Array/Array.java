package Array;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        // This line of code is declaration and Initialization of Array
        int[] numbers = {1,10,100,1000,10000}; // Here : int[] is a data type and numbers is the name of the array
        
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // How to acces an element from the array
        System.out.println("Acess first element fron the array:" + numbers[0]);
        // System.out.println("Acess last element fron the array:" + numbers[4]);
        System.out.println("Access last element: " + numbers[numbers.length - 1]);


        // Number of elements in the array 
        System.out.println("Number of elements in  the array: " +numbers.length);

        // Update the elements in the array 
        System.out.println("\nBefore updating: " + Arrays.toString(numbers));
        numbers[2] = 101;
        System.out.println("\nAfter updating: " + Arrays.toString(numbers));

        
    }

}

