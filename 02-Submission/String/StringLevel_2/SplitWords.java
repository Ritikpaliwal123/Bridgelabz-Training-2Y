package StringLevel_2;
import java.util.Scanner;

public class SplitWords {

    static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    static String[] splitWords(String text) {
        int length = findLength(text);
        int wordsCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ')
                wordsCount++;
        }

        String[] words = new String[wordsCount];
        int start = 0;
        int word = 0;

        for (int i = 0; i <= length; i++) {

            if (i == length || text.charAt(i) == ' ') {

                String temp = "";

                for (int j = start; j < i; j++) {
                    temp = temp + text.charAt(j);
                }

                words[word] = temp;
                word++;
                start = i + 1;
            }
        }

        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Words:");

        for (String word : userWords) {
            System.out.println(word);
        }

        System.out.println("Both results are same: "
                + compare(userWords, builtInWords));
    }
}