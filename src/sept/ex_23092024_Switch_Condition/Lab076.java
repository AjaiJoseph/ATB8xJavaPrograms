package sept.ex_23092024_Switch_Condition;

public class Lab076 {
    public static void main(String[] args) {
// Switch Condition
        // Without using break condition till friday day 5
        // Days - 1 to 7 - 1 monday, 2 tues,... 7 - sunday
        int day = 1;
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
                break;
            case 6:
                System.out.println("Saturday");
               break;
            case 7:
                System.out.println("Sunday");
              break;
            default:
                System.out.println("No idea, What day its");
             break;
        }
        System.out.println("End of the loop");
    }
}
