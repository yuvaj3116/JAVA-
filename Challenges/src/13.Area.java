package Challenges.src;

import java.util.Scanner;

class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to area calculator");
        System.out.println("Enter the value of base of the triangle in cm : ");
        double base = input.nextDouble();

        System.out.println("Enter the value of height of the triangle in cm : ");
        double height = input.nextDouble();

        double area = (0.5f * base * height);

        System.out.println("Area of the triangle is = " + area + "cm2");
    }
}
