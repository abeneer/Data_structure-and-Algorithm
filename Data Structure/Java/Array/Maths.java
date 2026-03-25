package Array;
// Example:
// Input:N = 12345
// Output:5
// Explanation:  The number 12345 has 5 digits.


public class Maths {
    //Count All DIgits
    public static int countDigits(int n) {
        int cnt = 0;
        while( n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }

    // Reversae NUmber
    //    Input: N = 12345
    //    Output:54321
    //    Explanation: The reverse of 12345 is 54321.
    public static int reverseNumber(int n) {
        int revNum = 0;
        while ( n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
        }
        return revNum;
    }

    // Check if a number is Palindrome or Not
    // Example 1:
    // Input:N = 4554
    // Output:Palindrome Number
    // Explanation: The reverse of 4554 is 4554 and therefore it is palindrome number

    public static boolean checkPalindrome(int n){
        int revrseNum = 0;
        int dup = 0;

        while(n > 0){
            int ld = n % 10;
            revrseNum = (revrseNum * 10) + ld;
            n = n/10;
        }
        return dup == revrseNum;

    }






    public static void main(String[] args) {
        int N = 12345678;

       // Problem 1: Count Digits
        System.out.println("Count Digits");
        System.out.println("N: " + N);
        int digits = countDigits(N); 
        System.out.println("Number of Digits: " + digits);

        // Problem 2: Reverse Number
        System.out.println("\n Reverse Number");
        System.out.println("N: " + N);
        int reversed = reverseNumber(N);
        System.out.println("Reversed Number: " + reversed);


        // Problem 3: Check Palindrome
        System.out.println("\nCheck Palindrome ");
        System.out.println("N: " + N);
        boolean isPalindrome = checkPalindrome(N);
        if(isPalindrome){
            System.out.println("Palindrome Number");
        }else {
            System.out.println("Not a Palindrome Number");
        }

    }
}