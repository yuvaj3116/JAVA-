package Challenges.src;

import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        Scanner welcome = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = welcome.nextLine();

        System.out.println(" Welcome " + name + " to Kg coding");

    }
}
