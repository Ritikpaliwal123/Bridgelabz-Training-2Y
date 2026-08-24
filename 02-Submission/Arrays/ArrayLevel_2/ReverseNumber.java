package ArrayLevel_2;
import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int temp=n,count=0;
        while(temp!=0){
            count++;
            temp=temp/10;
        }

        int[] digits=new int[count];
        for(int i=0;i<count;i++){
            digits[i]=n%10;
            n=n/10;
        }

        System.out.print("Reverse = ");
        for(int i=0;i<count;i++)
            System.out.print(digits[i]);
    }
}
