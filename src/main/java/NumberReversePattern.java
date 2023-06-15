//10. Write a program that will give following output:
//12345
//2345
//345
//45
//5

public class NumberReversePattern {

    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {  // for row
            for (j = i; j <= 5; j++) {  // for colum
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
}


