package ReplitPractice;

/*Create Class call Parent. create a class String **variable** call city. create Parent constructor take the String parameter city.
 include the logic to assign the value of parameter to class variable. create method with below specification. access modifier public.
  return type void name display Write to logic print below sentence. "City name " + the value of class variable. Create Child Class.
  inherit to Parent class. create Child constructor with one String parameter called city. call super constructor and pass the
  parameter. in Main Class. Create and object of Child class. pass city name as "Fairfax" and call the display method.
  Output.  City name Fairfax*/
public class Replit158 {
    public static void main(String[] args) {
        Child158 child158 = new Child158("Fairfax");
        child158.display();
    }
}

class Parent158 {
    String city;

    public Parent158(String city) {
        this.city = city;
    }

    public void display() {
        System.out.println("City name " + city);
    }
}

class Child158 extends Parent158 {

    public Child158(String city) {
        super(city);
    }
}