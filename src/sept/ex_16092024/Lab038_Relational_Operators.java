package sept.ex_16092024;

public class Lab038_Relational_Operators {
    public static void main(String[] args) {
//        Relational Operators = boolean
//        > < , >= <= , !=, ! -> true or false
        int a =10;
        int b = 30;
        boolean c = a>b;
        System.out.println(c);

        int age_ajai = 24;
        int age_joseph = 24;
//        boolean result = age_ajai > age_joseph; //false
        boolean result = age_ajai >= age_joseph; //false // age_ajai > age_joseph or age_ajai = age_joseph
        System.out.println(result);
    }
}
