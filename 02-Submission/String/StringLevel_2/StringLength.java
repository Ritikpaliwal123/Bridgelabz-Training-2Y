package StringLevel_2;
import java.util.Scanner;

public class StringLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.println("User-defined length: " + findLength(text));
        System.out.println("Built-in length: " + text.length());
    }
}