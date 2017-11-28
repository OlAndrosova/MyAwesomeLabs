package FourLab;

import java.util.*;

public class MatrixCalc {
    private static int i, j;
    private static List<List<Integer>> matrixCalc;

    public void fillArray(Matrix matrix){
        List<List<Integer>> array = matrix.getMatrix();
        int randomNumber = 20;
        int number;
        for (i = 0; i < matrix.getColumnCount(); i++) {
            List<Integer> intList = new ArrayList();
            for(j = 0; j < matrix.getRowCount(); j++) {
                number = (int) (Math.random() * randomNumber);
                intList.add(number);
            }
            array.add(intList);
        }
    }

    public void printArray(Matrix matrix){
        matrixCalc = matrix.getMatrix();
        for(List<Integer> listElement : matrixCalc){
            for( Integer i : listElement) {
               System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public int findMaxElement(Matrix matrix) {
        matrixCalc = matrix.getMatrix();
        int maxElement = 0;
        for (List<Integer> listElement : matrixCalc){
            for (Integer i : listElement) {
                if(maxElement < i)
                    maxElement = i;
            }
        }
        return maxElement;
    }

    public int findMinElement(Matrix matrix){
        matrixCalc = matrix.getMatrix();
        int minElement = matrixCalc.get(0).get(0);
        for (List<Integer> listElement : matrixCalc) {
            for (Integer i : listElement) {
                if (minElement > i)
                    minElement = i;
            }
        }
        return minElement;
    }

    public int printMin(Matrix matrix){
        matrixCalc = matrix.getMatrix();
        int resultMin = matrixCalc.get(0).get(0);
        int min;
        for(int i = 0; i < matrixCalc.size(); i++) {
            min =
                    matrixCalc.get(i).stream().min(Integer::compareTo).get();
            if(resultMin > min){
                resultMin = min;
            }
        }
        return resultMin;
    }

    public int printMax(Matrix matrix){
        matrixCalc = matrix.getMatrix();
        int resultMax = matrixCalc.get(0).get(0);
        int max;
        for(int i = 0; i < matrixCalc.size(); i++) {
            max =
                    matrixCalc.get(i).stream().max(Integer::compareTo).get();
            if(resultMax < max){
                resultMax = max;
            }
        }
        return resultMax;
    }

}
