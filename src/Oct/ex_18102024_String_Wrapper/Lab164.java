package Oct.ex_18102024_String_Wrapper;

public class Lab164 {
    public static void main(String[] args) {
        String str1 = "Hello";
        str1.concat(" World");
        System.out.println(str1); // Hello
        // There will be a new String Hello World also (in SCP - String constant pool)
        // str1 = str1.concat(" World"); // - Hello World



    }
}
