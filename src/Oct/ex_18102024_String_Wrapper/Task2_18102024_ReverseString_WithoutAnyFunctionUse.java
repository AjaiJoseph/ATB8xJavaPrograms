package Oct.ex_18102024_String_Wrapper;

public class Task2_18102024_ReverseString_WithoutAnyFunctionUse {

    //Reverse the String without using  any functions. (for loop)
    public static void main(String[] args) {
        String name = "suraj";
        String reverse = "";
        char ch;

        for (int i = 0; i < name.length(); i++) {

            ch = name.charAt(i);
            reverse = ch + reverse;
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
