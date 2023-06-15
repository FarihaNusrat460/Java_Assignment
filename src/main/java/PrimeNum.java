//8. Print the prime numbers of 2 to 100


public class PrimeNum {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int prime = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {    //check if the value is only divisible by 1 and itself
                    prime++;

                }
            }
            if (prime == 2) {
                System.out.println(i);
            }
        }

    }


}


