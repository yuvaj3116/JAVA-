package Challenges.src;

import java.util.Scanner;

class Swap2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Swapping station");

        System.out.print("Enter value of A: ");
        int a = input.nextInt();

        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a; //swapping algorithm.
        a = b;
        b = c;

        System.out.println("Swapping is Done...");

        System.out.println("Value of A is : " + a);
        System.out.println("Value of B is : " + b);

    }
}
