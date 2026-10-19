package Challenges.src;

import java.util.Scanner;

class NotOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Showcasing the bitwise NOT opereator.");

        System.out.print("Enter the yout number : ");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Your result is : " + result );
    }
}
