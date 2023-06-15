//11. Find out the second largest element of the given array numbers=[5,3,9,7,4,1,8]

public class SecondMax {
    public static void main(String[] args) {

        int arr[] = {5, 3, 9, 7, 4, 1, 8};
        int max1 = arr[0];
        int max2 = arr[0];


        //find 1st max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];

            }
        }

        // find 2nd max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max2) {
                if (arr[i] != max1) {
                    max2 = arr[i];
                }
            }

        }
        System.out.println("The second largest element of the given array: "+max2);
    }
}

