package SecondLab;

import java.util.Scanner;
import java.lang.*;

public class SecondLab {
    public static void main(String[] args) {
        System.out.print("Введите размерность матрицы: ");
        Scanner enterNumber = new Scanner(System.in);
        int matrixRows = enterNumber.nextInt();
        int matrixColumns = enterNumber.nextInt();

        int[][] matrix = new int[matrixRows][matrixColumns];
        int i, j, maxElement, minElement, indexRowsMax, indexColumnsMax, indexRowsMin, indexColumnsMin;
        int randomNumber = 20;

        System.out.print("\nМатрица, заполненная случайными числами:\n");

        for (i = 0; i < matrixRows; i++) {
            for (j = 0; j < matrixColumns; j++) {
                matrix[i][j] = (int) (Math.random() * randomNumber);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        maxElement = 0;
        indexRowsMax = 0;
        indexColumnsMax = 0;
        for (i = 0; i < matrixRows; i++) {
            for (j = 0; j < matrixColumns; j++) {
                if (maxElement < matrix[i][j]) {
                    maxElement = matrix[i][j];
                    indexRowsMax = i + 1;
                    indexColumnsMax = j + 1;
                }
            }
        }

        minElement = matrix[1][1];
        indexRowsMin = 0;
        indexColumnsMin = 0;
        for (i = 0; i < matrixRows; i++) {
            for (j = 0; j < matrixColumns; j++) {
                if (minElement > matrix[i][j]) {
                    minElement = matrix[i][j];
                    indexRowsMin = i + 1;
                    indexColumnsMin = i + 1;
                }
            }
        }

        System.out.print("Максимальный элемент = " + maxElement + ", его индекс max[" + indexRowsMax + "][" + indexColumnsMax + "]");
        System.out.print("\nМинимальный элемент = " + minElement + ", его индекс min[" + indexRowsMin + "][" + indexColumnsMin + "]");
    }
}
