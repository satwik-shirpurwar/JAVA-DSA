package Functions;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        System.out.println("Please Enter a number :");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        
        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number; // Copy the number to another variable
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        // Check if the original number and the reversed number are equal
        return originalNumber == reverse;
    }
}
