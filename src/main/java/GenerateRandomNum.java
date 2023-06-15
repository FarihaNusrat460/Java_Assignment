//6. Generate random 10 integer numbers in an array and print out all the numbers from array and also print the
// max and min number from the array


import java.util.Random;

public class GenerateRandomNum {

    public static void main(String[] args) {

        int[] arr = new int[10]; // array size declare
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        //print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int min = arr[0];
        int max = arr[0];

        //find max min
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] < min) {
                min = arr[i];

            }
        }

        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}


