package sept.ex_20092024_Conditions_Loops;
// QnA
public class Lab071 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        if (2 + 2 < 4){ // this line doest not run because there is no else condition so it will take the last line which will execute
            System.out.println("Inside the loop");
        }
        System.out.println("Outside -> "+ a);
        // Understand with debug -> checking the code line by line
    }
}
