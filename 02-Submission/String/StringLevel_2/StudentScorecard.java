package StringLevel_2;
import java.util.Scanner;

public class StudentScorecard {

    // Generate random marks for Physics, Chemistry and Maths
    static int[][] generateMarks(int n) {

        int[][] marks = new int[n][3];

        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 41) + 60;
            marks[i][1] = (int)(Math.random() * 41) + 60;
            marks[i][2] = (int)(Math.random() * 41) + 60;
        }

        return marks;
    }

    // Calculate total, average and percentage
    static double[][] calculate(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100) / 100.0;
            percentage = Math.round(percentage * 100) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    // Calculate grade
    static String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 80)
                grade[i] = "A";
            else if (percentage >= 70)
                grade[i] = "B";
            else if (percentage >= 60)
                grade[i] = "C";
            else if (percentage >= 50)
                grade[i] = "D";
            else if (percentage >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        return grade;
    }

    // Display scorecard
    static void display(int[][] marks, double[][] result, String[] grade) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "%\t\t" +
                            grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);

        double[][] result = calculate(marks);

        String[] grade = calculateGrade(result);

        display(marks, result, grade);
    }
}