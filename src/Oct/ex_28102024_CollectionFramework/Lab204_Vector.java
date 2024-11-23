package Oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab204_Vector {

    public static void main(String[] args) {
        List mylist1 = new ArrayList(5); // FR - CO
        mylist1.add("Ajai");
        mylist1.add("Joseph");
        mylist1.add("Thomas");
        mylist1.add("Thomas");
        mylist1.add("Thomas");
        mylist1.add("Thomas");
        System.out.println(mylist1);


        Vector v = new Vector();
        v.add("Ajai"); // t1
        v.add("Joseph"); // t1
        v.add("Thomas"); // t1
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Thomas"));
        System.out.println(v.lastIndexOf("Thomas"));
        System.out.println(v.contains("Thomas"));
//        System.out.println(v.replaceAll("Kiran"););



        // Only Problem with the Vector
        // - It is Thread Safe, Synchronised.
        // It will be time consumming
        // One by One - usage
        // Slower








    }
}
