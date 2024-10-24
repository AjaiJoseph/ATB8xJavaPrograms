package Oct.ex_14102024_Abstraction.Task;

public class Runner {
    public static void main(String[] args) {
        // Create a PrintMyBook object
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);

        // Print the details of the book using getDetails() method
        System.out.println(myBook.getDetails());
    }
}
