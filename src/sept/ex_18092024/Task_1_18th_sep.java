package sept.ex_18092024;

public class Task_1_18th_sep {
    public static void main(String[] args) {
//        Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit

        // Widening (Implicit & Explicit)
        byte b = 10;
        int i = b;  // Implicit widening: byte to int
        System.out.println(i); // Output: 10

        byte c = 10;
        int o = (int) c;  // Explicit widening (unnecessary, but allowed)
        System.out.println(o); // Output: 10

        // Narrowing (Implicit and Explicit)
        int u = 100;
        byte a = (byte) u;  // Explicit narrowing: int to byte
        System.out.println(a); // Output: 100

        int y = 130;
        byte w = (byte) y;  // Explicit narrowing: int to byte
        System.out.println(w); // Output: -126 (data loss occurs)

    }
}
