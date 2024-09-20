package sept.ex_18092024;

public class Lab050_Type_Casting {
    public static void main(String[] args) {
        // Type Casting
        // Widening - Implicit , Explicit - lossless
        // Narrowing - Implicit , Explicit (With data type), loss

        //Widening
        byte b = 10;
        int a = b; // Valid - Implicit Casting - JVM does this automatically for us
        int a1 = (int)b; // Valid - Explicit Casting - (int) which JVM does this automatically but its not shown for us
                        // Both are same with or without (int)

        // Narrowing // Adding/trying to add a bigger data value into small space
        int val = 300;
        // byte b1 = val; // Invalid implicit Casting - JVM warns about this invalid syntax (because we cant store the int(Large space)value in byte(Small space)
        byte b2 = (byte) val; // Invalid Explicit Casting - loss of data (The value will be stored until the byte is full, and any extra data will be lost due to lack of space)
        System.out.println(b2); // the result shows 44 (to know about this calculation refer the JAVA Notes DOC - Type casting - Page no: 36)

    }
}
