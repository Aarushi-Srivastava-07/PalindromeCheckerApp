import java.util.*;
public class PalindromeCheckerApp {
// / **

// * MAIN CLASS - UseCase12Palimdrom=CheckerApp

// * Use Cose 12: Strategy Pattern for Patindrome Atgorithms

// * Description:
// * This class demonstrutes how different palindrome
// * vatidation otgorithms con be setected dynmmicotty
// * at runtime using the Strategy Design Patterm.

// * At this stope, the application:
// * - Defines a common PatindromeStrtegy interfoce
// * - Implements a concrete Stack based strategy
// * - Injects the strategy at runtine
// * - Executes the selected algorithm

// * No performance comparison is done in this use case.
// * The foous is purety on atgorithm interchmngembitity.

// * The gomt is to temch extensibte otgorithm design.

// *

// * Douthor DeveLoper
// * Oversion 12.8
// +/
// public class UseCase12PaLindromeCheckerApp

// * INTERFACE - PalindromeStrutegy

// *

// * This interfoce defines a comtract for att
// * palindrome checking algorithms.

// * Any mew algorithm must implement this interfoce
// * and provide its omn vatidation togic.

// interface PatindromeStrategy { ... }

// * CLASS - StackStrategy

    public static boolean checkPalindrome(String input) {
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
        String input = "level";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);


    }
}

