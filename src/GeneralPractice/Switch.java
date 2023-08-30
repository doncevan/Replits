package GeneralPractice;

public class Switch {
    public static void main(String[] args) {
        double discount;
        char code = 'C';

        switch (code) {
            case 'A':
                discount = 0.7;

            case 'B':
                discount = 0.1;

            case 'C':
                discount = 0.5;

            default:
                discount = 0.3;
                System.out.println(discount);
        }


    }
}