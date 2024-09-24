package sept.ex_20092024_Conditions_Loops;

public class Task_01_20_09_2024 {
    public static void main(String[] args) {
        //✅ By using Ternary Operators max between 3 numbers.
        //
        //// Input int - a,b,c - a = 10, b = 20, c = 45
        //
        //// Max → a,b,c → c
        int a = 10;
        int b = 20;
        int c = 45;
        int max = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("The maximum value is: " + max); // Output - 45
    }
}
