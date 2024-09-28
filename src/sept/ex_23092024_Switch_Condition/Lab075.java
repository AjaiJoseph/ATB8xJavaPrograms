package sept.ex_23092024_Switch_Condition;

public class Lab075 {
    public static void main(String[] args) {
        // Switch Condition
        // Days - 1 to 7 - 1 monday, 2 tues,... 7 - sunday
        int day = 1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break; // this will end the loop
            case 2:
                System.out.println("Tuesdya");
                break;// this will end the loop
            case 3:
                System.out.println("Wednesday");
                break;// this will end the loop
            case 4:
                System.out.println("Thursday");
                break;// this will end the loop
            case 5:
                System.out.println("Friday");
                break;// this will end the loop
            case 6:
                System.out.println("Saturday");
                break;// this will end the loop
            case 7:
                System.out.println("Sunday");
                break;// this will end the loop
            default:
                System.out.println("No idea, What day its");
                break;// this will end the loop
        }
        System.out.println("End of the loop");
    }
}
