package sept.ex_20092024_Conditions_Loops;

public class Task_05_20092024 {
    public static void main(String[] args) {
// Write a program that prints numbers from 1 to 100. However, for multiples of 3,
// print "Fizz" instead of the number, and for multiples of 5, print "Buzz.
// " For numbers that are multiples of both 3 and 5, print "FizzBuzz."

        int num = 21;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");

        } else if (num % 5 == 0) {
            System.out.println("Buzz");

        } else {
            System.out.println("Nothing");
        }
    }
}
