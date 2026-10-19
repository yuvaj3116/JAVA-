package Challenges.src;

import java.util.Scanner;

public class Add2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our calculator");

        System.out.print("Please enter 1st number : ");
        int num1 = input.nextInt();

        System.out.print("Please enter 2nd number : ");
        int num2 = input.nextInt();

        int num3 = num1 + num2;

        System.out.println("Your answer is : " + num3);
    }
}
