package sept.ex_25092024_loops;

public class Task_02_25092024 {
    public static void main(String[] args) {
//        Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
//
//        // n = 1 ->  Fact = 1*1 -> 1
//
//        // n = 3 -> Fact = 3*2*1 -> 6
        int n=5;
        int factorial = 1;
        for(int i=n; i>1; i--){
            factorial*= i;

        }
        System.out.println("factorial of the given no is : " + factorial);

//        Detailed Breakdown of the Loop:
//
//1st iteration (i = 5):
//factorial = 1 * 5 = 5
//2nd iteration (i = 4):
//factorial = 5 * 4 = 20
//3rd iteration (i = 3):
//factorial = 20 * 3 = 60
//4th iteration (i = 2):
//factorial = 60 * 2 = 120
//Loop ends because i is now 1, and the condition i > 1 is no longer true.
    }
}
