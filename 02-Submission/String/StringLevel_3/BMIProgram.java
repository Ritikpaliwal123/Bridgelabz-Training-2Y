package StringLevel_3;
import java.util.Scanner;

public class BMIProgram {

    static String[][] calculateBMI(double weight, double height) {

        double heightMeter = height / 100;
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        if (bmi < 18.5)
            status = "Underweight";
        else if (bmi < 25)
            status = "Normal";
        else if (bmi < 30)
            status = "Overweight";
        else
            status = "Obese";

        String[][] result = new String[1][4];

        result[0][0] = String.valueOf(height);
        result[0][1] = String.valueOf(weight);
        result[0][2] = String.valueOf(Math.round(bmi * 100) / 100.0);
        result[0][3] = status;

        return result;
    }

    static String[][] getResult(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            double heightMeter = height / 100;
            double bmi = weight / (heightMeter * heightMeter);

            String status;

            if (bmi < 18.5)
                status = "Underweight";
            else if (bmi < 25)
                status = "Normal";
            else if (bmi < 30)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(Math.round(bmi * 100) / 100.0);
            result[i][3] = status;
        }

        return result;
    }

    static void display(String[][] result) {

        System.out.println("Height\tWeight\tBMI\tStatus");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            result[i][3]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height of person " + (i + 1) + " (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] result = getResult(data);

        display(result);
    }
}