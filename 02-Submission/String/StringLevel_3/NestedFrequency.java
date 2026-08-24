package StringLevel_3;
import java.util.Scanner;

public class NestedFrequency {

    static String[] frequency(String text) {

        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '0')
                continue;

            frequency[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {

                if (chars[i] == chars[j]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0')
                count++;
        }

        String[] result = new String[count];

        int index = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != '0') {

                result[index] =
                        chars[i] + " = " + frequency[i];

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] result = frequency(text);

        for (String s : result) {
            System.out.println(s);
        }
    }
}