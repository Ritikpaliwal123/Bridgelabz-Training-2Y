package com.gla.recursion;
import java.util.*;
public class FactorialCalculation {
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            return n * factorial(n - 1);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (n < 0 || n > 12) {
                System.out.println("Enter a number from 0 to 12.");
            } else {
                System.out.println("Factorial = " + factorial(n));
            }
        }
}
