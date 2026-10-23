package com.gla.recursion;
import java.util.*;

public class powerfunction {
        static double power(double x, long n) {
            if (n == 0) {
                return 1;
            }
            if (n < 0) {
                return 1.0 / power(x, -n);
            }
            double half = power(x, n / 2);
            if (n % 2 == 0) {
                return half * half;
            } else {
                return x * half * half;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter base: ");
            double x = sc.nextDouble();
            System.out.print("Enter exponent: ");
            int n = sc.nextInt();
            if (x == 0 && n < 0) {
                System.out.println("Zero cannot have a negative exponent.");
            } else {
                System.out.println("Answer = " + power(x, (long) n));
            }
        }
}
