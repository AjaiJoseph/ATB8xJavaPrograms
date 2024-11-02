package Oct.ex_18102024_String_Wrapper;

import java.util.Scanner;

public class Task3_18102024_Palindrome {
    //Palindrome Input : str = "abba"
//Output: Yes
//
//Input : str = "pramod"
//Output: No
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Output: Yes");
        } else {
            System.out.println("Output: No");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;

    }
}
