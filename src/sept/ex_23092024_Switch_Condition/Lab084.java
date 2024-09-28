package sept.ex_23092024_Switch_Condition;

public class Lab084 {
    public static void main(String[] args) {
        int itemcode = 001; // JDK -> 13

        switch (itemcode){
            case 001 -> System.out.println("its a laptop");
            case 002 -> System.out.println("its a PC ");
            case 003 -> System.out.println("Its a mobile phone");
            default -> System.out.println("Hello!");
        }
    }
}
