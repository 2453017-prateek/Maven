
package com.calculator;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {

            System.out.println("\n===== JAVA CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you!");
                break;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            try {

                double result;

                switch (choice) {

                    case 1:
                        result = calc.add(num1, num2);
                        break;

                    case 2:
                        result = calc.subtract(num1, num2);
                        break;

                    case 3:
                        result = calc.multiply(num1, num2);
                        break;

                    case 4:
                        result = calc.divide(num1, num2);
                        break;

                    default:
                        continue;
                }

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        sc.close();
    }
}
