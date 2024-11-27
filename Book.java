public class Book {
    String title;
    String author;
    double price;
    double applyDiscount;
    double updatePrice;

    Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.applyDiscount = 0.0;
    }
    public Book(String title, String author,double applyDiscount, double price) {
        this.title = title;
        this.author = author;

        if (price < 0) {
            System.out.println("Price cannot be negative");
            this.price = price*-1;
        } else {
            this.price = price;
        }
        if (applyDiscount < 1 || applyDiscount > 99) {
            System.out.println("Discount must be between 1% and 99%. So setting discount to 0%.");
            this.applyDiscount = 0;
        } else {
            this.applyDiscount = applyDiscount;
        }

    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + applyDiscount + "%");
        System.out.println("New Price (after discount): " + calDiscount());


    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Price cannot be negative. Price update ignored.");
        } else {
            this.price = newPrice;
        }
    }

    private double calDiscount() {
        return price - (price * applyDiscount / 100.0);
    }
}

