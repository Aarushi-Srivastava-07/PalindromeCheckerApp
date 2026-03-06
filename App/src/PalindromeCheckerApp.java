import java.util.*;
public class PalindromeCheckerApp {
// /*
// / **

// *

// * MAIN CLASS - UseCase9RecursivePalindrome
// *

// * Use Case 9: Recursive Palindrome Checker

// * Description:
// * This class validates a palindrome using recursion.

// * Characters are compared from the outer positions
// * moving inward using recursive calls.

// * The recursion stops when:
// * - All characters are matched, or
// * - A mismatch is found.
// *
// * This use case demonstrates divide-and-conquer
// * logic using method recursion.

// * Bauthor Developer
// * @version 9.0
// */
// public class UseCase9PalindromeCheckerApp {

// / **
// * Application entry point for UC9.
// *
// * @param args Command-line arguments
// */
// public static void main(String[] args) { ... }

// / **
// * Recursively checks whether a string is palindrome.
// *

// * @param s
// * @param start Starting index
// * @param end Ending index
// * @return true if palindrome, otherwise false
// */
// private static boolean check(String s, int start, int end) { ... }

// *

// Input string
// */
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) return true; // base condition
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome(s, start + 1, end - 1); // recursive call
    }

    public static void main(String[] args){
        String input = "madam";
        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

