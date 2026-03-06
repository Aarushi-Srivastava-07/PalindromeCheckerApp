import java.util.*;
public class PalindromeCheckerApp {
// / **

// *

// * MAIN CLASS - UseCase8PalindromeCheckerApp

// *

// * Use Case 8: Linked List Based Palindrome Checker
// *

// * Description:
// * This class checks whether a string is a palindrome
// * using a LinkedList.
// *

// * Characters are added to the list and then compared
// * by removing elements from both ends:
// *

// * - removeFirst()
// * - removeLast()
// *

// * This demonstrates how LinkedList supports
// * double-ended operations for symmetric validation.

// * @author Developer
// * @version 8.0
// */
// public class UseCase8PalindromeCheckerApp {

// / **
// * Application entry point for UC8.

// * @param args Command-line arguments
// */
// public static void main(String[] args)

// *

// *

// }
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    static Node reverse(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args){
        String input = "level";

        Node head = null, tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = checkPalindrome(head);
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);
    }
}

