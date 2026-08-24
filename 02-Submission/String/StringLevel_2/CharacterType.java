package StringLevel_2;
import java.util.Scanner;

public class CharacterType {

    static String checkCharacter(char c) {

        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }

        if (c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u') {
            return "Vowel";
        }

        if (c >= 'a' && c <= 'z') {
            return "Consonant";
        }

        return "Not a Letter";
    }

    static String[][] getCharacterType(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharacter(text.charAt(i));
        }

        return result;
    }

    static void display(String[][] data) {

        System.out.println("Character\tType");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = getCharacterType(text);

        display(result);
    }
}