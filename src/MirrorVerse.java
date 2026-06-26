import java.util.Scanner;

public class MirrorVerse {

    public static boolean isPalindrome(String text) {

        // Remove spaces and punctuation, convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker ===");
        System.out.print("Enter a word or phrase: ");

        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        scanner.close();
    }
}