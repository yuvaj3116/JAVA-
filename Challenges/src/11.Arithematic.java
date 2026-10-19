package Challenges.src;

import java.util.Scanner;

class Arithematic {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Q1");

        System.out.println("Enter Value of a: ");
        int a = input.nextInt();

        System.out.println("Enter value of b: ");
        int b = input.nextInt();


        int d = a - b;


        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (d));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("Q2");

        System.out.println("Welcome to Product calculator");
        System.out.println("Enter the value of a");
        float num1 = input.nextFloat();

        System.out.println("Enter the value of b");
        float num2 = input.nextFloat();
        System.out.println("Product of a and b is = " + (num1 * num2));

    }
}