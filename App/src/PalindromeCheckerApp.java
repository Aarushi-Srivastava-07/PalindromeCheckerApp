import java.util.*;
public class PalindromeCheckerApp {
    /*/ **

* MAIN CLASS - UseCase3PalindromeCheckerApp

Use Case 3: Reverse String Based Palindrome Check

* Description:
* This class checks whether a string is a palindrome
* by reversing the string and comparing it with
* the original value.

* At this stage, the application:
* - Iterates the string in reverse order
* - Builds a reversed version
* - Compares original and reversed strings
* - Displays the validation result
*
* This introduces transformation-based validation.

* @author Developer
* @version 3.0
*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String str = input.next();;
        for(int i = str.length()-1; i >= 0; i--){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.println(str + " is not a palindrome");
                return;
            }
        }
        System.out.println(str + " is a palindrome");
    }
}

