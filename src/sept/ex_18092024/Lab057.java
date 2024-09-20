package sept.ex_18092024;

public class Lab057 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        // A -> a++ -> 10. a = 11;\
        // +
        // B -> ++a -> a = 12 B = 12

        // Line no |       a        |   Exp
        //    5    |        10      |   NA
        //    6    |        12      |   10 = 12


    }
}
