import java.util.*;
public class PalindromeCheckerApp {
// / **

// * MAIN CLASS - UseCase11PalindroneCheckerApp

// * Use Case 11: Object-Oriented Patindrome Service

// * Description:
// * This class demonstrates palindrome validation using
// * object-oriented design.

// * The patindrome Logic is encapsutated inside a
// * PalindromeService class.

// * This improves:

// * - Reusobitity
// * - Readability
// * - Separation of concerns

// * Douthor Developer
// * Oversion 11.0
// +/
// public class UseCasellPalindromeCheckerApp {

// / **
// * Application entry point for UC11.

// * Øparan args Command-Line anguments
// */
// pubtic static void main(String[] args) { ... }

// / **
// * Service class that contains patindrome Logic.
// */
// class PatindroneService { 2 uages

// * Checks whether the input string is a palindrome.

// * Mpara input Input string
// * Øreturn true if patindrone, fatse otherwise
// */
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        PalindromeCheckerApp checker = new PalindromeCheckerApp();
        String input = "radar";

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + checker.checkPalindrome(input));

    }
}

