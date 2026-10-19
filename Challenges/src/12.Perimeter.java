package Challenges.src;

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to perimeter calculator");
        System.out.println("Enter the value of 4 sides of the rectangle in cm : ");

        float s1 = input.nextFloat();
        float s2 = input.nextFloat();
        float s3 = input.nextFloat();
        float s4 = input.nextFloat();

        float perimeter = s1 + s2 + s3+ s4;

        System.out.println("Peremitere of the Rectangle is = " + perimeter + "cms");
    }
}
