package Challenges.src;

import java.util.Scanner;

class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to grades calculator ! \n");

        System.out.print("enter your marks in percentage : ");
        float marks = input.nextFloat();

        if ( marks >= 90 ) {
            System.out.println("Grade A");
        } else if ( marks >= 75 ) {
            System.out.println("Grade B");
        } else if ( marks >= 60) {
            System.out.println("Grade C");
        } else if ( marks >= 30 ) {
            System.out.println("Grade D");
        } else if ( marks < 30 ) {
            System.out.println("Fail");
        }
    }
}
