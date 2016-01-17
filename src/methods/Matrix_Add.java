package methods;

import java.util.Scanner;

public class Matrix_Add {

    Scanner scan;
    int matrix1[][], matrix2[][], sum[][];
    int row, column;

    public void create(String rows, String cols) {

        //scan = new Scanner(System.in);

        //System.out.println("Dodawanie macierzy");

        //System.out.println("\nWprowadz liczbe wierszy i kolumn");
        //row = Integer.parseInt(scan.nextLine());
        //column = Integer.parseInt(scan.nextLine());

        matrix1 = new int[row][column];
        matrix2 = new int[row][column];
        sum = new int[row][column];

        //System.out.println("Wprowadz pierwsza macierz");

        
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix1[i][j] = scan.nextInt();
            }
        }

        System.out.println("Wprowadz druga macierz");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                matrix2[i][j] = scan.nextInt();
            }
        }
    }

    public void display() {

        System.out.println("\nPierwsza macierz");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + matrix1[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n\nDruga macierz");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + matrix2[i][j]);
            }
            System.out.println();
        }
    }

    public void add() {

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("\n\npo dodaniu macierzy: ");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("\t" + sum[i][j]);
            }
            System.out.println();
        }
    }
}
