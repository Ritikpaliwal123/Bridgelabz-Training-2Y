package StringLevel_2;
import java.util.Scanner;

public class StudentVoting {

    static int[] getAges(int n, Scanner sc) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student "
                    + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    static String[][] checkVoting(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] >= 18)
                result[i][1] = "true";
            else
                result[i][1] = "false";
        }

        return result;
    }

    static void display(String[][] result) {

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0]
                    + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = getAges(10, sc);

        String[][] result = checkVoting(ages);

        display(result);
    }
}