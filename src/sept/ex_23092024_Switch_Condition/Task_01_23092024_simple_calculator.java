package sept.ex_23092024_Switch_Condition;

public class Task_01_23092024_simple_calculator {
    public static void main(String[] args) {
        //Create a simple calculator that performs addition, subtraction, multiplication,
        // and division, modulus based on user input using switch statements.
        //Inputs : num 1, num 2, +
        //Output : num1+num2 → print information.

        int num1 =10;
        int num2 = 9;
        char ch = '%';
        switch (ch){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Please Check and Try again");

        }
        }
    }

