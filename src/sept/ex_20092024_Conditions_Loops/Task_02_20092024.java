package sept.ex_20092024_Conditions_Loops;

public class Task_02_20092024 {
    public static void main(String[] args) {
        // Input the side lengths
        int side1 = 10;
        int side2 = 10;
        int side3 = 20;

        // Classify the triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }
    }
}
