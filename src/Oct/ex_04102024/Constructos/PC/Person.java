package Oct.ex_04102024.Constructos.PC;

public class Person {

    //10 Attribute
    String name;
    int age;
    String gender;
    String qualification;
    String occupation;
    String nationality;
    String address;
    String hobby;
    String phoneNumber;
    String email;

    // Default Constructor
    public Person() {
      this.name = "Ajai Joseph";
      this.age = 24;
      this.gender = "Male";
      this.qualification = "B.Com";
      this.occupation = "Curently Unemployed";
      this.nationality = "Indian";
      this.address = "Chennai";
      this.hobby = "Music Composing";
      this.phoneNumber = "1234567890";
      this.email = "ajaijoseph9882@gmail.com";

    }

    // Parameterized Constructor
    public Person(String name, int age, String gender, String qualification, String occupation,
                  String nationality, String address, String hobby, String phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.qualification = qualification;
        this.occupation = occupation;
        this.nationality = nationality;
        this.address = address;
        this.hobby = hobby;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Behavior 1: Display Details (Instance Method)
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Qualification: " + qualification);
        System.out.println("Occupation: " + occupation);
        System.out.println("Nationality: " + nationality);
        System.out.println("Address: " + address);
        System.out.println("Hobby: " + hobby);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }

    // Behavior 2: Update Phone Number
    public void updatePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
        System.out.println("Phone number updated to: " + newPhoneNumber);
    }

    // Behavior 3: Change Occupation
    public void changeOccupation(String newOccupation) {
        this.occupation = newOccupation;
        System.out.println("Occupation changed to: " + newOccupation);
    }

    // Behavior 4: Update Address
    public void updateAddress(String newAddress) {
        this.address = newAddress;
        System.out.println("Address updated to: " + newAddress);
    }

    // Behavior 5: Print Hobby
    public void printHobby() {
        System.out.println("Hobby: " + hobby);

    }
    public static void main(String[] args) {

        // Object creation using Default Constructor
        Person person1 = new Person();
        person1.displayDetails();  // Displaying default details
        System.out.println();

        // Object creation using Parameterized Constructor
        Person person2 = new Person("John", 30, "Male", "MBA", "Human resource", "American",
                "123 Street", "Gaming", "9876543210", "john@example.com");
        person2.displayDetails();  // Displaying customized details
        System.out.println();

        // Modifying attributes using methods
        person1.updatePhoneNumber("0987654321");
        person1.changeOccupation("Data Analyst");
        person1.updateAddress("Bangalore");
        person1.printHobby();  // Prints hobby

        // Creating additional objects
        Person person3 = new Person("Alice ", 28, "Female", "M.Sc", "Scientist", "British",
                "5th Avenue", "Traveling", "5551234567", "alice@example.com");
        person3.displayDetails();
        System.out.println();

        Person person4 = new Person("Watson", 35, "Female", "Ph.D", "Professor", "Canadian",
                "1st Street", "Painting", "3333333333", "watson@example.com");
        person4.displayDetails();
        System.out.println();

        Person person5 = new Person("Jacob", 45, "Male", "B.Tech", "Engineer", "Australian",
                "3rd street", "Gardening", "4444444444", "jacob@example.com");
        person5.displayDetails();
        System.out.println();  // Print a blank line
        System.out.println("Created 5 objects");
    }
}


