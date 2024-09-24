package sept.ex_20092024_Conditions_Loops;

public class Task_04_20092024 {
    public static void main(String[] args) {
        // Leap Year Program - Find 2024

        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year."); // 2024 is a leap year
        } else {
            System.out.println(year + " is not a leap year.");


        }
    }
}
