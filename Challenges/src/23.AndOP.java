package Challenges.src;

import java.util.Scanner;

class AndOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise AND Operator \n");

        System.out.print("Enter your 1st number : ");
        int first = input.nextInt();

        System.out.print("Enter your 2nd number : ");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("Result is : " + result);
    }
}
