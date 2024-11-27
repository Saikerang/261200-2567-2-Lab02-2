public class Main {
    public static void main(String[] args) {
        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 50.00, 2000.00);
        hp1Book.displayDetails();



    }
}