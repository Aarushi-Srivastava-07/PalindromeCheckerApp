import java.util.*;
public class PalindromeCheckerApp {
// / **

// * MAIN CLASS - UseCase10PalindromeCheckerApp
// *

// * Use Case 10: Normalized Palindrome Validation

// * Description:
// * This class validates a palindrome after preprocessing
// * the input string.

// * Normalization includes:
// * - Removing spaces and symbols
// * - Converting to lowercase
// *
// * This ensures the palindrome check is logical rather
// * than character-format dependent.
// *
// * Example:
// * "A man a plan a canal Panama"

// * Bauthor Developer
// * @version 10.0
// */
// public class UseCase10PalindromeCheckerApp {

// / **
// * Application entry point for UC10.
// *
// * Bparam args Command-line arguments
// */
// public static void main(String[] args) { ... }

// *
    public static void main(String[] args){
        String input = "Madam In Eden Im Adam";
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Normalized: " + normalized);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

