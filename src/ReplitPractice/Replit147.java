package ReplitPractice;

public class Replit147 {
    public static void main(String[] args) {
        CarObject car1 = new CarObject("Toyota 2019", 25000, 100);
        car1.carStockValue();

        CarObject car2 = new CarObject("BMW 2019", 65298, 10);
        car2.carStockValue();
    }
}

class CarObject {
    String model;
    double price;
    int quantity;

    public CarObject(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public void carStockValue() {
        double stockValue = price * quantity;
        System.out.println(model + " Stock Value " + stockValue);
    }
}