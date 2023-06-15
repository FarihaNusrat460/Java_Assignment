//5. Write a program that will find your key is found in the given array using linear search method
//numbers=[1,6,9,3,5,4,7]


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {1, 6, 9, 3, 5, 4, 7};

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value that you want to search: ");
        int search=scanner.nextInt();

        int i;

        System.out.println("Search key: " + search);
        boolean isExists = false;

        for (i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                isExists = true;
                break;
            }

        }

        if (isExists) {
            System.out.println("Search key is found in the array index number: " + i);
        } else {
            System.out.println("Search key is not present in the array");
        }
    }
}
