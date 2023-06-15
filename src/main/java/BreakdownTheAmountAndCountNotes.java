//7. Write a program that will breakdown the amount and count notes for any given amount. Here is the notes in the given array:
//notes=[1000,500,200,100,50,20,10,5,2,1]

import java.util.Scanner;

public class BreakdownTheAmountAndCountNotes {
    public static void main(String[] args) {


        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Note breakdown:");

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i]; // it indicates that how many times the note value can be used to reach the total amount

                System.out.println(notes[i] + " " + count);
                amount = amount % notes[i]; // find the remaining amount that needs to be further broken down
            }
        }
    }
}



