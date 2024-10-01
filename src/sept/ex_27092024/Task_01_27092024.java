package sept.ex_27092024;

public class Task_01_27092024 {
    public static void main(String[] args) {
//        Give me example of while vs do while loop in Lab ex.

        int i=1;
        while (i<1)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("while loop=>1 is not less than 1 , its equal to 1");

        do
        {
            System.out.println("do while loop, value is =>"+i);
            i++;
        }while(i<1);
    }
}
