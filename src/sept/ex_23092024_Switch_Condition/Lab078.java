package sept.ex_23092024_Switch_Condition;

public class Lab078 {
    public static void main(String[] args) {
        // Days - 1 to 7 - 1 monday, 2 tues,... 7 - sunday
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesdya");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("No idea, What day its");

        }
        System.out.println("End of the loop");
    }
}
