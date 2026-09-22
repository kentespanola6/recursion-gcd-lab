/*
Description: This program calculates the Greatest Common Divisor (GCD) of two
non-negative integers using the recursive Euclidean algorithm and displays
the recursive execution trace.
Programmed by: ESPAÑOLA, Kent Clark I. - CN 48162 - GE 205
Last Modified: September 22, 2026
Version: 1.0
Acknowledgements: OpenAI GPT-5.6 Luna was used for code drafting,
explanation drafting, and checking recursion traces. The submitted code
was reviewed and verified by the student.
*/

import java.util.Scanner;

public class RecursionGCD {

    // Recursive Euclidean algorithm with an execution trace.
    public static long gcd(long a, long b) {
        System.out.println("gcd(" + a + ", " + b + ")");

        if (b == 0) {
            System.out.println("Base case reached: b == 0, return " + a);
            return a;
        }

        long remainder = a % b;
        System.out.println(a + " % " + b + " = " + remainder);

        return gcd(b, remainder);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a;
        long b;

        while (true) {
            System.out.print("Enter first non-negative integer (a): ");
            if (!scanner.hasNextLong()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
                continue;
            }
            a = scanner.nextLong();

            System.out.print("Enter second non-negative integer (b): ");
            if (!scanner.hasNextLong()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
                continue;
            }
            b = scanner.nextLong();

            if (a < 0 || b < 0) {
                System.out.println("Both values must be non-negative.");
            } else if (a == 0 && b == 0) {
                System.out.println("The two values must not both be zero.");
            } else {
                break;
            }
        }

        System.out.println("\nRecursive execution trace:");
        long result = gcd(a, b);

        System.out.println("\nGCD = " + result);

        scanner.close();
    }
}
