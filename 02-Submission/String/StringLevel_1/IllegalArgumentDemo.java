package StringLevel_1;
import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String text) {
        int start = 5;
        int end = 2;

        if (start > end) {
            throw new IllegalArgumentException("Start index is greater than end index");
        }

        System.out.println(text.substring(start, end));
    }

    static void handleException(String text) {
        try {
            int start = 5;
            int end = 2;

            if (start > end) {
                throw new IllegalArgumentException("Start index is greater than end index");
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);
    }
}