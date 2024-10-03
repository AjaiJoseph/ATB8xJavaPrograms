package sept.ex_30092024_Functions;

import java.util.Scanner;

public class Task_01_30092024 {
    public static void main(String[] args) {

//        Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
//
//        // n = 1 ->  Fact = 1*1 -> 1
//
//        // n = 3 -> Fact = 3*2*1 -> 6

        Scanner sc = new Scanner(System.in);  // Create a Scanner object to take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();  // Read the input number

        int factorial = 1;  // Variable to store the result, initialized to 1

        for (int i = n; i > 1; i--) {  // Loop from n down to 2
            factorial *= i;  // Multiply factorial by i in each iteration
        }

        System.out.println("Factorial of " + n + " is: " + factorial);  // Output the result
    }
}
