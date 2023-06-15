//17. Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = scanner.next();
        System.out.println("Input String: " + str);

        //string reverse
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }

        System.out.println("Reverse string: " + rev);


        //check if the reverse string match with the original string
        if (rev.equals(str)) {
            System.out.print("This string is palindrome");
        } else {
            System.out.print("This string is not palindrome");
        }
    }
}


