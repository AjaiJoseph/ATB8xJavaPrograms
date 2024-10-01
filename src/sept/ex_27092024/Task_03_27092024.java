package sept.ex_27092024;

public class Task_03_27092024 {
    public static void main(String[] args) {
//        Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        int num = 1;  // Start from 1
        int sum = 0;  // Variable to store the sum

        while (num <= 100) {  // Continue until num reaches 100
            sum += num;  // Add the current number to sum
            num++;  // Increment the number
        }

        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}
