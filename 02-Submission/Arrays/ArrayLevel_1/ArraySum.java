package ArrayLevel_1;
import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double[] num=new double[10];
        double total=0.0;
        int index=0;

        while(true){
            double n=sc.nextDouble();

            if(n<=0||index==10)
                break;

            num[index]=n;
            index++;
        }

        System.out.println("Numbers:");
        for(int i=0;i<index;i++){
            System.out.println(num[i]);
            total+=num[i];
        }

        System.out.println("Sum = "+total);
    }
}