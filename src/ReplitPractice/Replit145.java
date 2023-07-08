package ReplitPractice;

public class Replit145 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tarzan", 50);
        dog1.display();

        Dog dog2 = new Dog("Lucy", 10.0);
        dog2.display();
    }
}

class Dog {
    String dogName;
    double dogWeight;
    static String dogBreed = "Mutt";

    public Dog(String dogName, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
    }

    public void display() {
        System.out.println(dogName + " " + dogBreed + " " + dogWeight);
    }
}