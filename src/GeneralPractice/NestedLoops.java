package GeneralPractice;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("It's so freaking cold outside!");
        }
        System.out.println("----------");

        String[] colors = {"Red", "Blue", "Green"};
        for (int i = 0; i < 3; i++) {
            System.out.println(colors[i]);
        }
        System.out.println("----------");

        String[][] fancyColors = {
                {"Red", "Blue", "Green"},
                {"Cyan", "Magenta", "Turquoise"}};
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++)
                System.out.println(fancyColors[row][column]);
        }
        System.out.println("----------");
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 10; j++)
                System.out.println("row: " + i + ", column: " + j);
        }
        System.out.println("-------------");
        String word = "superman";
        for (int i = 0; i < word.length() - 3; i++) {
            System.out.println(word);
        }
    }
}
