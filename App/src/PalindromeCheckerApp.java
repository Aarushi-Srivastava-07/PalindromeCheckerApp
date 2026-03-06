import java.util.*;
public class PalindromeCheckerApp {
// /++

// * MAIN CLASS - UseCase13PalindroneCheckerApp

// * Use Case 13: Performance Comparison

// * Description:
// * This ctass measures and compares the execution
// * performance of palindrome validation alporithas.

// * At this stape, the application:
// * - Uses a patindrome strategy imptementation
// * - Captures execution start and end time
// * - Caloutates total execution duration
// * - Displays benchmarking resutts

// * This use case focuses purety on performance
// * measurement and algorithm comparison.

// * The goal is to introduce benchmarking concepts.

// +

// * Pouthor DeveLoper
// * gversion 13.0

// +/

// pubtic ctass UseCase13PatindromeCheckerApp {

// * Application entry point for UC13.

// * Øparan angs Command-Line arguments

// pubtic static void main(String[] args) { ... }
    public static boolean checkTwoPointer(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkStack(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) stack.push(c);
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }

    public static void main(String[] args){
        String input = "level";

        // Run and time two different approaches
        long start1 = System.nanoTime();
        boolean result1 = checkTwoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = checkStack(input);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Two-Pointer Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("Stack Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");
    }
}

