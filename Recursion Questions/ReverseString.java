import java.util.Scanner;

public class ReverseString {

    // Method to remove occurrences of 'a'
    static String removeOccurrences(String s, int idx) {
        if (idx == s.length()) return "";

        String smallAns = removeOccurrences(s, idx + 1);
        char currChar = s.charAt(idx);

        if (currChar != 'a') {
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    // Method to reverse a string
    static String reverse(String s, int idx) {
        if (idx == s.length()) return "";
        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    // Method to check if a string is a palindrome
    static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Reversing the string
        String rev = reverse(s, 0);
        System.out.println("Reversed String: " + rev);

        // Checking if the string is a palindrome
        boolean isPalin = isPalindrome(s, 0, s.length() - 1);
        System.out.println("Is Palindrome: " + isPalin);

        // Removing occurrences of 'a' from the string
        String modifiedString = removeOccurrences(s, 0);
        System.out.println("String after removing 'a': " + modifiedString);

        sc.close();
    }
}
