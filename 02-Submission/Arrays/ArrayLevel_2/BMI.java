package ArrayLevel_2;
import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n=sc.nextInt();

        double[] weight=new double[n];
        double[] height=new double[n];
        double[] bmi=new double[n];
        String[] status=new String[n];

        for(int i=0;i<n;i++){
            do{
                System.out.print("Enter weight (kg): ");
                weight[i]=sc.nextDouble();
                if(weight[i]<=0)
                    System.out.println("Enter positive value");
            }while(weight[i]<=0);

            do{
                System.out.print("Enter height (m): ");
                height[i]=sc.nextDouble();
                if(height[i]<=0)
                    System.out.println("Enter positive value");
            }while(height[i]<=0);

            bmi[i]=weight[i]/(height[i]*height[i]);

            if(bmi[i]<18.5)
                status[i]="Underweight";
            else if(bmi[i]<25)
                status[i]="Normal";
            else if(bmi[i]<30)
                status[i]="Overweight";
            else
                status[i]="Obese";
        }

        for(int i=0;i<n;i++){
            System.out.println("Person "+(i+1));
            System.out.println("Height = "+height[i]+" m");
            System.out.println("Weight = "+weight[i]+" kg");
            System.out.println("BMI = "+bmi[i]);
            System.out.println("Status = "+status[i]);
        }
    }
}