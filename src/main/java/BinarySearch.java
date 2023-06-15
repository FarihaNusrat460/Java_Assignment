//4. Write a program that will find your key is found in the given array using binary search method
//numbers=[1,6,9,3,5,4,7]


import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = {1, 6, 9, 3, 5, 4, 7};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value that you want to search: ");
        int search = scanner.nextInt();

        // sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // print the sorted array
        System.out.println("After sorting the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("Search key: " + search);

        //perform binary search
        int l = 0;
        int h = arr.length - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if (search > arr[mid]) {
                l = mid + 1;
            } else if (search < arr[mid]) {
                h = mid - 1;
            }

            else {

                System.out.println("Key is found at index: " + mid);
                return;
            }
        }

        System.out.println("The key is not present in the array.");
    }
}




