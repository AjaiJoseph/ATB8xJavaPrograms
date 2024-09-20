package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
        // GST = 18.45;
        int course = 100;
        float GST = 18.45f;
       // int total_price = course+GST; // Narrowing - Implicit - JVM dedects - Invalid
        // float total_price = course+GST; // Narrowing - Implicit - JVM dedects - Invalid

        int total_price = course+(int)GST; // Narrowing - Explicit - Loss of data
        System.out.println(total_price);
    }
}
