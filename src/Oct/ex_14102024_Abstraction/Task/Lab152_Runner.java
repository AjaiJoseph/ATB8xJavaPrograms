package Oct.ex_14102024_Abstraction.Task;

public class Lab152_Runner {
    public static void main(String[] args) {
        // book mybook = new book() -> we cannot create object in abstract class
        // Create a PrintMyBook object
        Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", 120);

        // Print the details of the book using getDetails() method
        System.out.println(myBook.getDetails());
    }
}
