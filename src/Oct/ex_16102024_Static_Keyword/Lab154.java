package Oct.ex_16102024_Static_Keyword;

public class Lab154 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        new A();
        A a2;
    }
}

class A{
    {
        System.out.println("IIB"); // Instance Initialization Block
    }
    static {
        System.out.println("SIB"); // Static Initialization Block
    }

}