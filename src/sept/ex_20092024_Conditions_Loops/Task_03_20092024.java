package sept.ex_20092024_Conditions_Loops;

public class Task_03_20092024 {
    public static void main(String[] args) {

        // Ternary Operators to handle multiple conditions.

        char Grade = 'A';
        int score = 95;
        if (score >= 90 && score <= 100) {
            Grade = 'A';
        } else if (score >= 80 && score <= 89) {
            Grade = 'B';
        } else if (score >= 70 && score <= 79) {
            Grade = 'C';
        } else if (score >= 60 && score <= 69) {
            Grade = 'D';
        } else if (score < 0 || score > 100) {
            Grade = 'O';
            System.out.println("You are Amazing");
        }else{
            Grade = 'F';
        }
        System.out.println("Your Grade is " + Grade);
    }
}
