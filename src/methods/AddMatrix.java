package methods;

public class AddMatrix {

    int[][] firstMatrix;
    int[][] secondMatrix;
    int rows;
    int cols;
    int[][] sum;

    /**
     * Konstruktor klasy
     *
     * @param firstMatrix przekazana macierz pierwsza
     * @param secondMatrix przekazana macierz druga
     * @param rows liczba wierszy
     * @param cols liczba kolumn
     */
    public AddMatrix(int[][] firstMatrix, int[][] secondMatrix, int rows, int cols) {
        this.firstMatrix = firstMatrix;
        this.secondMatrix = secondMatrix;
        this.rows = rows;
        this.cols = cols;

    }

    /**
     *
     * @return
     */
    public String add() {
        String score = "";
        sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("\n\npo dodaniu macierzy: ");
        score = score.concat("\n\npo dodaniu macierzy: \n");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                System.out.print("\t" + sum[i][j]);
                score = score.concat("\t " + sum[i][j]);
            }
            score = score.concat("\n");
            System.out.println();
        }
        return score;
    }
}
