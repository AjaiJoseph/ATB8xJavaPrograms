package sept.ex_27092024;

public class Task_02_27092024 {
    public static void main(String[] args) {
        // Create a Java program that prints the first 5 even numbers using a do-while loop.

        int num = 2;  // Starting from the first even number
        int count = 0;  // To keep track of how many even numbers are printed

        do {
            System.out.println(num);  // Print the current even number
            num += 2;  // Move to the next even number
            count++;  // Increment the count
        } while (count < 5);  // Repeat until 5 even numbers are printed
    }
}
