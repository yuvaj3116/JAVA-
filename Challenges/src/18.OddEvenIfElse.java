package Challenges.src;

import java.util.Scanner;

class OddEvenIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to odd even checker ! ");

        System.out.print("Enter a value : ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your value is even");
        } else {
            System.out.println("Your value is odd");
        }
    }
}
