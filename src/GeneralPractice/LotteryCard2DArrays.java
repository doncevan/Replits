package GeneralPractice;

public class LotteryCard2DArrays {
    public static void main(String[] args) {
        int[][] lotteryCard = {{20, 15, 7}, {8, 7, 19}, {7, 13, 41}};
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(lotteryCard[i][j] + " ");
            }
            System.out.println();
        }
    }
}