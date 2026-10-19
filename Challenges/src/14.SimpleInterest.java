package Challenges.src;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to simple interest calculator");

        System.out.println("Enter the value of Principal amount in rupees : ");
        double p1 = input.nextDouble();

        System.out.println("Enter the value of rate of interest : ");
        double r1 = input.nextDouble();

        System.out.println("Enter the value of time period in years : ");
        double t1 = input.nextDouble();

        double simpleInterest = ((p1 * r1 * t1) /100);

        System.out.println("Simple Interest is = " + simpleInterest + "rupees. ");
        System.out.println("Total amount = " + (simpleInterest + p1) + "rupees. ");

    }
}
