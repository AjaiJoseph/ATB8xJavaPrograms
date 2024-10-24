package Oct.ex_14102024_Abstraction.Task;

// Subclass that extends the Book class and implements the abstract method
class PrintMyBook extends Book {

    // Constructor that calls the parent (Book) class's constructor
    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);  // Use the parent class constructor to set values
    }

    // Implementing the abstract getDetails() method from the Book class
    @Override
    String getDetails() {
        // Return the name, author, and a hard-coded price of 100
        return name + ", " + author + ", " + 100;
    }
}