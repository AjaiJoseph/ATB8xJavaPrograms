package Oct.ex_16102024_Static_Keyword;

public class Lab156 {
    public static void main(String[] args) {
        // ENUM
        System.out.println(Day.SATURDAY);
        System.out.println(Day.MONDAY);
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}