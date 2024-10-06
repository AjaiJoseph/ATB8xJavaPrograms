package Oct.ex_04102024.Constructos.PC;

public class Lab125 {
    public static void main(String[] args) {
        AHuman amit = new AHuman();
        AHuman ajai = new AHuman("Ajai");
        AHuman jospeh = new AHuman("Joseph");
        System.out.println(amit.planet);
        System.out.println(jospeh.planet);



        System.out.println(amit.name);
        System.out.println(ajai.name); // Ajai
        System.out.println(jospeh.name); // Joseph


    }
}
