package ReplitPractice;

/*
Create a Class Main
In this class, you should specify the following attributes: breed, name, color, and
following behaviors: bark(), run(), play().
Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes
and behaviors.
The output of the program should be as following:
Husky can bark
Husky can run
Husky can play
Bulldog can bark
Bulldog can run
Bulldog can play
Labrador can bark
Labrador can run
Labrador can play
*/
public class R088_ClassObject {
    String breed, name, color;

    void bark() {
        System.out.println(breed + " can bark");
    }

    void run() {
        System.out.println(breed + " can run");
    }

    void play() {
        System.out.println(breed + " can play");
    }

    public static void main(String[] args) {
        R088_ClassObject husky = new R088_ClassObject();
        husky.breed = "Husky";
        husky.bark();
        husky.run();
        husky.play();

        R088_ClassObject bulldog = new R088_ClassObject();
        husky.breed = "Bulldog";
        husky.bark();
        husky.run();
        husky.play();

        R088_ClassObject labrador = new R088_ClassObject();
        husky.breed = "Labrador";
        husky.bark();
        husky.run();
        husky.play();
    }
}
