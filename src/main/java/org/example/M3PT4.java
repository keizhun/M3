package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class M3PT4 {
    public static void main(String[] args) {

        // TASK 1
        System.out.println("\nTask 1: ");
        String[] names = {"David", "Ronald", "Donald", "John", "Lucy"};
        for (String name : names) {
            System.out.print(name + " ");
        }

        // TASK 2
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nTask 2: ");
        int[] numbers = {43, 68, 12, 76, 23};
        System.out.println("Original Integer Array");
        System.out.println(Arrays.toString(numbers));

        System.out.print("\nEnter Second Integer: ");
        int secondInt = scanner.nextInt();
        numbers[1] = secondInt;

        System.out.println("\nModified Integer Array");
        System.out.print(Arrays.toString(numbers));


        //TASK 3
        System.out.println("\n\nTask 3: ");
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value in array: " + max);

    }
}
