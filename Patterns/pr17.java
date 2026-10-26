public class pr17 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            System.out.print(" ".repeat(rows - i - 1));

            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}
