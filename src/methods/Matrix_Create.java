package methods;

public class Matrix_Create {

    public static int[][] setAdjencyMatrix(int[] inputData, int size) {
        int adjencyMatrix[][] = new int[size][size];
        int len = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjencyMatrix[i][j] = inputData[len];
                len++;
            }
        }
        return adjencyMatrix;
    }

}
