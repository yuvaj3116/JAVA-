package Challenges.src;

import java.util.Scanner;

class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to age calculator");

        System.out.print("Enter your Age : ");
        int age = input.nextInt();

        if ( age >= 60 ){
            System.out.println("Your are a senior citizen");
        } else if ( age < 60 && age >= 20 ) {
            System.out.println("You are an adult");
        } else if ( age < 20 && age >= 13 ){
            System.out.println("You are a teen");
        } else if ( age < 13 ) {
            System.out.println("You are a child");
        }
    }
}
