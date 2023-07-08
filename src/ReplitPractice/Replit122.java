package ReplitPractice;

public class Replit122 {
    String nameOfCountry;
    String capital;
    int populationSize;

    public void display() {
        System.out.println("The capital of " + nameOfCountry + " is " + capital + " and population is " + populationSize);
    }

    public static void main(String[] args) {
        Replit122 obj1 = new Replit122();
        obj1.nameOfCountry = "USA";
        obj1.capital = "Washington DC";
        obj1.populationSize = 330000000;

        Replit122 obj2 = new Replit122();
        obj2.nameOfCountry = "Kazakhstan";
        obj2.capital = "Astana";
        obj2.populationSize = 185000000;

        obj1.display();
        obj2.display();
    }
}
