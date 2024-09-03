public class PrintDiagonalArray {
    public static void main(String[] args) {
        int ad[][] = {
                {1, 2},
                {3, 4}
        };

        System.out.println("Main diagonal elements:");
        for (int i = 0; i < ad.length; i++) {
            System.out.print(ad[i][i] + " ");
        }

        System.out.println("\nAnti-diagonal elements:");
        for (int i = 0; i < ad.length; i++) {
            System.out.print(ad[i][ad.length - 1 - i] + " ");
        }
    }
}
