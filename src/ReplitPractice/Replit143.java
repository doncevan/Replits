package ReplitPractice;

/*1. Complete the Car.java class:  Create the following variable (**Choose proper datatype**)
* make  * model  * numberOfDoors  * topSpeed  * price   following the proper naming convention for variables.
    Write four constructors: * The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)
* A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value
* should be assigned to 0 inside constructor)
Create a display method in Cars class to print the class variable value in console.
2. Test your code with the Main.java class:  Create several Car objects using all Constructors.
then call display method with each object. */
public class Replit143 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000);
        car1.display();

        Car car2 = new Car("Toyota", "Prius", 120, 30000);
        car2.display();

        Car car3 = new Car(4, 120, 30000);
        car3.display();

        Car car4 = new Car("Toyota", "Prius", 4);
        car4.display();
    }
}

class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    public Car(String make, String model, int topSpeed, double price) {
        this(make, model, 4, topSpeed, price);
    }

    public Car(int numberOfDoors, int topSpeed, double price) {
        this("unknown", "unknown", numberOfDoors, topSpeed, price);
    }

    public Car(String make, String model, int numberOfDoors) {
        this(make, model, numberOfDoors, 90, 0);
    }

    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}
