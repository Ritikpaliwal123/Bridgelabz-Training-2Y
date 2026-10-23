package com.gla.recursion;
import java.util.*;
public class sumofarray {
        static int sumArray(int[] arr, int index) {
            if (index == arr.length) {
                return 0;
            }
            return arr[index] + sumArray(arr, index + 1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Invalid array size.");
            } else {
                int[] arr = new int[n];
                System.out.println("Enter array elements:");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("Sum = " + sumArray(arr, 0));
            }
        }
}
