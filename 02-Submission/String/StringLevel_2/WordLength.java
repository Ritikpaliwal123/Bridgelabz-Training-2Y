package StringLevel_2;
import java.util.Scanner;

public class WordLength {

    static String[] splitWords(String text) {
        int wordsCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                wordsCount++;
        }

        String[] words = new String[wordsCount];

        int start = 0;
        int word = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                String temp = "";

                for (int j = start; j < i; j++) {
                    temp += text.charAt(j);
                }

                words[word] = temp;
                word++;
                start = i + 1;
            }
        }

        return words;
    }

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

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = getWordLength(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t"
                    + Integer.parseInt(result[i][1]));
        }
    }
}