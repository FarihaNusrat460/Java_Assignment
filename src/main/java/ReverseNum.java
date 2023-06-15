//13. Take any number as input and print the reverse of the number

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int input = scanner.nextInt();


        int reminder;
        int reverse = 0;

        while (input != 0) {
            reminder = input % 10;
            reverse = reverse * 10 + reminder;
            input = input / 10;

        }

        System.out.println("Reverse Number: " + reverse);


    }
}
