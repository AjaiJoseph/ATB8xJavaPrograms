package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        long Phone_no = 8756324224l;
      //  short s = Phone_no; // Invalid implicit Casting - JVM warns about this invalid syntax (because we cant store the long(Large space)value in short(Small space)
        short s1 = (short) Phone_no; // Invalid Explicit Casting - loss of data (The value will be stored until the long is full, and any extra data will be lost due to lack of space)
    }
}
