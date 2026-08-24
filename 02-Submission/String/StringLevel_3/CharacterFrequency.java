package StringLevel_3;
import java.util.Scanner;

public class CharacterFrequency {

    static String[][] frequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0)
                count++;
        }

        String[][] result = new String[count][2];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            boolean alreadyAdded = false;

            for (int j = 0; j < index; j++) {

                if (result[j][0].charAt(0) == c) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (!alreadyAdded) {

                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(frequency[c]);

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = frequency(text);

        System.out.println("Character\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }
    }
}