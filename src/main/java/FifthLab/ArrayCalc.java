package FifthLab;

import java.lang.*;

public class ArrayCalc {
    private static int[][] matrixCalc;
    private static int i, j;

    public void fillArray(Array matrix) {
        int[][] array = matrix.getArrayBody();
        int randomNumber = 20;
        int number = 0;

        for (i = 0; i < matrix.getRowCount(); i++){
            for (j = 0; j < matrix.getColumnCount(); j++) {
                //array[i][j] = (int) (Math.random() * randomNumber);
                number += 1;
                array[i][j] = number;
            }
        }
        matrix.setArrayBody(array);
    }

    public void printArray(Array matrix){
        matrixCalc = matrix.getArrayBody();
        for (i = 0; i < matrix.getRowCount(); i++){
            for (j = 0; j < matrix.getColumnCount(); j++)
                System.out.print(matrixCalc[i][j] + "\t");
            System.out.println();
        }
    }

    public int findMaxElement(Array matrix) {
        matrixCalc = matrix.getArrayBody();
        int maxElement = 0;
        for(i = 0; i < matrix.getRowCount(); i++){
            for (j = 0; j < matrix.getColumnCount(); j++){
                if(maxElement < matrixCalc[i][j])
                    maxElement = matrixCalc[i][j];
            }
        }
        return maxElement;
    }

    public int findMinElement(Array matrix){
        matrixCalc = matrix.getArrayBody();
        int minElement = matrixCalc[0][0];
        for (i = 0; i < matrix.getRowCount(); i++) {
            for (j = 0; j < matrix.getColumnCount(); j++) {
                if (minElement > matrixCalc[i][j])
                    minElement = matrixCalc[i][j];
            }
        }
        return minElement;
    }
}