
//1. Suppose, a=10 and b=20. Now swap the value using a temp variable. Output: a=20, b=10

public class SwapValueWdTemp {
    public static void main(String[] args) {
        System.out.println("Before Swap");


        int a = 10;
        int b = 20;
        int temp;

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: ");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
