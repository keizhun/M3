package org.example;

import java.util.Scanner;

public class M3PT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (A - F):  ");
        char grade = scanner.next().charAt(0);


        switch (grade) {
            case 'A': System.out.println("\nExcellent!"); break;
            case 'B': System.out.println("\nGood!"); break;
            case 'C': System.out.println("\nYou passed."); break;
            case 'D': System.out.println("\nNeeds improvement."); break;
            case 'F': System.out.println("\nFailed."); break;
            default: System.out.println("\nInvalid grade.");
        }
    }
}