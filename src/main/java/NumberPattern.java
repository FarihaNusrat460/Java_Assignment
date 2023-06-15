//9. Write a program that will give following output:
//1
//12
//123
//1234
//12345

public class NumberPattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {  // for row
            for (j = 1; j <= i; j++) {  // for colum
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}
