package sept.ex_18092024;

public class Lab058 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // A -> ++a -> Exp 1 -> 11 , a =11
        // +
        // B -> ++a -> a = 12, Exp2 = 12
        // so (++a + ++a) = 23 . (a) = 12
    }
}
