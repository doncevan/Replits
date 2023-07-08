package ReplitPractice;

public class Replit144 {
    public static void main(String[] args) {
        StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
        obj1.display();

        StoreProduct obj2 = new StoreProduct("Paper Towels", 2, 24);
        obj2.display();

        StoreProduct obj3 = new StoreProduct("Paper Towels", 2);
        obj3.display();
    }
}

class StoreProduct {
    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    public StoreProduct(String label, double price, int stock) {
        this(label, price);
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock;
    }

    public StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
        this.stock = 0;

    }

    public void display() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }
}