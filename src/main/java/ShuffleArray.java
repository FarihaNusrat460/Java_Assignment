//12. Write a program that will shuffle (values will randomly change their position) from the given array
//numbers=[1,2,3,4,5,6,7,8,9,0]
//random output: 3 5 0 1 7 9 6 4 2 8

import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randIndex = random.nextInt(arr.length); //a random index within the range of the arr array is generated

            int temp = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = temp;
        }
        System.out.println("Print the shuffle array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}



