package Challenges.src;

import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ODD EVEN Calculator.");

        System.out.println("Enter your number : ");
        int num = input.nextInt();

        if ((num & 1) == 1){
            System.out.println("Your number is odd.");
        } else {
            System.out.println("Your number is even.");
        }
    }
}
