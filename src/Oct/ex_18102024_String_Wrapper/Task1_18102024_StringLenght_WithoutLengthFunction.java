package Oct.ex_18102024_String_Wrapper;

public class Task1_18102024_StringLenght_WithoutLengthFunction {
//Calculate the length of the String - without using the length() function. String name =”Pramod”; →  6 , CharArray, for loop

    public static void main(String[] args) {
        String name = "Pramod";
        int length =0;
        for (char c : name.toCharArray()) {
            length++;
        }
        System.out.println("Length of String is: " + length);
    }
}
