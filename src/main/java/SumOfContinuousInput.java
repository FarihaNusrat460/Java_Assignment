//18. Write a program that will take integer numbers as user input continuously and print the sum of numbers until
// user input q from the keyboard. When user input q, program will be quit. If user inputs another character, then the
// program will ask to input the number again.

import java.util.Scanner;

public class SumOfContinuousInput {
    public static void main(String[] args) {

        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Input numbers: ");

        while (true) {

            if (input.hasNextInt()) {
                sum += input.nextInt();
                System.out.println("Sum: " + sum);

                continue; // Restart the loop
            } else {
                System.out.println("Invalid input. Please enter a number or 'q' to quit.");

            }

            char ch;
            ch = input.next().charAt(0);
            if (ch == 'q') {
                break;
            }

        }

        System.out.println("Program Ended");
    }
}



