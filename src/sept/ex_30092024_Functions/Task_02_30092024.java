package sept.ex_30092024_Functions;

public class Task_02_30092024 {
    public static void main(String[] args) {
        // Prime Number from 1 to 100. (for loop)

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;  // Assume i is prime

            // Check if i is divisible by any number from 2 to i-1
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {  // If i is divisible by j, it's not a prime number
                    isPrime = false;
                    break;  // No need to check further
                }
            }

            // If isPrime is still true, then i is a prime number
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
