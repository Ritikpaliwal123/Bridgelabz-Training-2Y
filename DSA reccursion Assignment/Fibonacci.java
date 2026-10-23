package com.gla.recursion;
import java.util.*;
public class Fibonacci {
        static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of terms: ");
            int n = sc.nextInt();
            if (n < 0 || n > 40) {
                System.out.println("Enter a number from 0 to 40.");
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
            }
        }
}
