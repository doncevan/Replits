package ReplitPractice;

public class Replit148 {
    public static void main(String[] args) {
        ShoppingStore obj1 = new ShoppingStore("Blanket", 49.99, 2);
        double returnedValue1 = obj1.itemTotalPrice();

        ShoppingStore obj2 = new ShoppingStore("Mattress", 219.59, 2);
        double returnedValue2 = obj2.itemTotalPrice();

        double sum = returnedValue1 + returnedValue2;
        System.out.println("You purchased " + sum + " Today");
    }
}

class ShoppingStore {
    String item;
    double price;
    int quantity;

    public ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    public double itemTotalPrice() {
        double totalValue = price * quantity;
        System.out.println(item + " Total Value " + totalValue);
        return totalValue;

    }
}