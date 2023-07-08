package ReplitPractice;
    /*Create a class Animal in which define instance variable type, constructor that will initialize instance variable
    and 2 methods eat and sleep.
    Create a subclass Cat in which override method sleep
    Create 3 Kitten subclasses of a Cat class and override method eat
        for 1 kitten - eats milk
        for 2 kitten - eats snack
        for 3 kitten - eats everything
    In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
    **Expected Output:** Cat eats
                            Cat sleeps a lot
                            kitten1 eats milk
                            kitten1 sleeps a lot
                            kitten2 eats snacks
                            kitten2 sleeps a lot
                            kitten3 eats everything
                            kitten3 sleeps a lot*/
public class Replit166 {
    public static void main(String[] args) {
        Animal [] animals={new Cat("Cat"),new Kitten1("kitten1"),new Kitten2("kitten2"),new Kitten3("kitten3")};
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();
        }
    }
}

class Animal {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    void eat() {
        System.out.println(type+" eats");
    }

    void sleep() {
        System.out.println(type+" sleeps");
    }
}

class Cat extends Animal {
    public Cat(String type) {
        super(type);
    }

    @Override
    void sleep() {
        System.out.println(type+" sleeps a lot");
    }
}

class Kitten1 extends Cat {
    public Kitten1(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type+" eats milk");
    }
}

class Kitten2 extends Cat {
    public Kitten2(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type+" eats snacks");
    }
}

class Kitten3 extends Cat {
    public Kitten3(String type) {
        super(type);
    }

    @Override
    void eat() {
        System.out.println(type+" eats everything");
    }
}