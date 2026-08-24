package StringLevel_2;
import java.util.Scanner;

public class CustomTrim {

    static int[] findTrimPoints(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compare(String a, String b) {

        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);

        String userTrim = createSubstring(
                text, points[0], points[1]);

        String builtInTrim = text.trim();

        System.out.println("User-defined: [" + userTrim + "]");
        System.out.println("Built-in: [" + builtInTrim + "]");

        System.out.println("Both are same: "
                + compare(userTrim, builtInTrim));
    }
}