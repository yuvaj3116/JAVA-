package Challenges.src;

import java.util.Scanner;

class FtoC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to F to C convertor");
        System.out.println("Enter the value of Farenheit to convert into Celcious : ");
        double f = input.nextDouble();

        double c = ( f - 32 ) * 5 / 9;

        System.out.println("value of Farenheit after converting to Celcious is = " + c);
    }
}
