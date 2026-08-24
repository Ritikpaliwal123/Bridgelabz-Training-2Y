package StringLevel_2;
import java.util.Scanner;

public class ShortestLongest {

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

    static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    static int[] findShortestLongest(String[][] data) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < data.length; i++) {

            int current = Integer.parseInt(data[i][1]);
            int shortLength = Integer.parseInt(data[shortest][1]);
            int longLength = Integer.parseInt(data[longest][1]);

            if (current < shortLength)
                shortest = i;

            if (current > longLength)
                longest = i;
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] data = getWordLength(words);

        int[] result = findShortestLongest(data);

        System.out.println("Shortest: " + data[result[0]][0]);
        System.out.println("Longest: " + data[result[1]][0]);
    }
}