package StringLevel_3;
import java.util.Scanner;

public class Palindrome {

    static boolean palindromeLoop(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {

            if (text.charAt(start) != text.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    static boolean palindromeRecursion(
            String text, int start, int end) {

        if (start >= end)
            return true;

        if (text.charAt(start) != text.charAt(end))
            return false;

        return palindromeRecursion(text, start + 1, end - 1);
    }

    static char[] reverse(String text) {

        char[] reverse = new char[text.length()];

        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    static boolean palindromeArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverse(text);

        for (int i = 0; i < original.length; i++) {

            if (original[i] != reverse[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.println(
                "Using Loop: " + palindromeLoop(text)
        );

        System.out.println(
                "Using Recursion: "
                        + palindromeRecursion(
                        text, 0, text.length() - 1)
        );

        System.out.println(
                "Using Character Array: "
                        + palindromeArray(text)
        );
    }
}