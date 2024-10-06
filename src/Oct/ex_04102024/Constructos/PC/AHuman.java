package Oct.ex_04102024.Constructos.PC;

public class AHuman {
      String eyes_color;
      String planet;
      String name;
      long aadhar_card_number;

      // Default constructor
      AHuman(){
          System.out.println("I will be called when object is created");
          // We can write a Code here which will automatically called when Object is created
          // We can write a Code to Read a File txt
          // We can write a Code to Read a CSV, Excel here. ...

      }
          // Parameterized Constructors
       AHuman(String name) {
        System.out.println("Hi, I am Param Constructors");
        this.name = name;

    }
    // Return - void, data-type
      void walk(){
          System.out.println("No return also no argument");


      }
      int talk(){
          System.out.println("Retuen type with no argument");
          return 10;
      }
      String sleep(String name){
          System.out.println("Sleeping");
          System.out.println("Retuen type with argument");
          return "I am sleeping";
      }

      void eat(String name ){
          System.out.println("No return type but with argument");
          System.out.println("Eating");
      }
}
