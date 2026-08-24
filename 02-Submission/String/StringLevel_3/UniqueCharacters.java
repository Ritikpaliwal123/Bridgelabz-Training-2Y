package StringLevel_3;
import java.util.Scanner;

public class UniqueCharacters {

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

    static char[] uniqueCharacters(String text) {

        int length = findLength(text);

        char[] temp = new char[length];
        int count = 0;

        for (int i = 0; i < length; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {

                if (temp[j] == text.charAt(i)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                temp[count] = text.charAt(i);
                count++;
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] result = uniqueCharacters(text);

        System.out.print("Unique characters: ");

        for (char c : result) {
            System.out.print(c + " ");
        }
    }
}