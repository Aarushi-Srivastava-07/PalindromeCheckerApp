import java.util.Scanner;
public class PalindromeCheckerApp {
//    / *
//            *
//            * MAIN CLASS - UseCase2PalindromeCheckerApp
//
//*
//        * Use Case 2: Hardcoded Palindrome Validation
//
//* Description:
//            * This class demonstrates basic palindrome validation
//* using a hardcoded string value.
//*
//        * At this stage, the application:
//            * - Stores a predefined string
//* - Compares characters from both ends
//* - Determines whether the string is a palindrome
//* - Displays the result on the console
//*
//        * This use case introduces fundamental comparison logic
//* before using advanced data structures.
//*
//
//        * @author Developer
//* @version 2.0
//            */
//    oublic class UseCase2PalindromeCheckerApp {
/// **
//        * Application entry point for UC2.
//*
//
//        * @param args Command-line arguments
//*/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        String str = input.next();
        Boolean check = true;
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(str + " is a palindrome");
        } else{
            System.out.println(str + " is not a palindrome");
        }

    }
}
