package Oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Task1_25102024_Left_Triangle_Star_Pattern {

//    ✅ Left Triangle Star Pattern
//        *****
//
//        ****
//
//        ***
//
//        **
//
//        *

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bum n=5");
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
