package ArrayLevel_2;
import java.util.*;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int[] digits=new int[10];
        int index=0;

        while(n!=0&&index<10){
            digits[index]=n%10;
            n=n/10;
            index++;
        }

        int largest=0,second=0;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                second=largest;
                largest=digits[i];
            }else if(digits[i]>second&&digits[i]!=largest){
                second=digits[i];
            }
        }

        System.out.println("Largest = "+largest);
        System.out.println("Second Largest = "+second);
    }
}