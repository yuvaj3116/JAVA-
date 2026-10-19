package Challenges.src;

import java.util.Scanner;

class LeftShiftOP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("showcasing the bitwise LEFTSHIFT operator.");

        System.out.print("Enter your number : ");
        int num = input.nextInt();

        int result = num << 4 ; //4 here means kitne baar shift krna hai

        System.out.println("Result is : " + result);
    }
}
