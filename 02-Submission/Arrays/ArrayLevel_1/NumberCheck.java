package ArrayLevel_1;
import java.util.Scanner;
public class NumberCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num=new int[5];

        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<num.length;i++){
            if(num[i]>0){
                System.out.println(num[i]+" is positive");
                if(num[i]%2==0)
                    System.out.println(num[i]+" is even");
                else
                    System.out.println(num[i]+" is odd");
            }else if(num[i]<0){
                System.out.println(num[i]+" is negative");
            }else{
                System.out.println(num[i]+" is zero");
            }
        }

        if(num[0]==num[4])
            System.out.println("First and last elements are equal");
        else if(num[0]>num[4])
            System.out.println("First element is greater than last element");
        else
            System.out.println("First element is less than last element");
    }
}