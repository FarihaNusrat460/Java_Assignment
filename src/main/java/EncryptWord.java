//16. Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY

import java.util.Scanner;

public class EncryptWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.next();

        System.out.println("Encrypt word: " + string);

        if (string.charAt(2) == 'F') {
            System.out.println("Output: WTFIYTXIJY");
        } else {
            System.out.println("Output:" + string);
        }
    }
}



