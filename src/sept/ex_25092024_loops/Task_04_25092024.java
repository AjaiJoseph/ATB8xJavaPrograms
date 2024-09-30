package sept.ex_25092024_loops;

public class Task_04_25092024 {
    public static void main(String[] args) {
//        Prime Number from 1 to 100. (for loop)

        int vcount =0;
        int consCount =0;
        String str ="Ajai";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                vcount++;

            else
                consCount++;

        }
        System.out.println("Count of vowels in Ajai is :" +vcount);
        System.out.println("Count of vowels in Ajai is :" +consCount);
    }
}
