package Challenges.src;

import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to compound interest calculator");
        System.out.println("Enter the value of Principal amount in rupees : ");
        double p2 = input.nextDouble();

        System.out.println("Enter the value of Rate of interest : ");
        double r2 = input.nextDouble();

        System.out.println("Enter the value of Time period in years : ");
        double t2 = input.nextDouble();

        double compoundInterest = p2 * Math.pow((1+r2/100),t2);

        System.out.println("Compound Interest is = " + compoundInterest + "rupees.");
        System.out.println("Total amount is = " + (compoundInterest + p2) + "rupees.");

    }
}
