package sept.ex_25092024_loops;

import java.util.Scanner;

public class Task_03_23092024 {
    public static void main(String[] args) {
//        Prime Number from 1 to 100. (for loop)
        for(int i=2;i<=100;i++)
        {
            int count=0;
            for(int num=i;num>=1;num--)
            {

                if(i%num==0)
                {
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
            }
        }
    }
}
