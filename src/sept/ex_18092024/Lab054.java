package sept.ex_18092024;

public class Lab054 {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // Line no |       Exp        | a
        //    5    |                  | 10
        //    6    |   result - 11    | 10
        //    7    |   result - 11    | 10
    }
}