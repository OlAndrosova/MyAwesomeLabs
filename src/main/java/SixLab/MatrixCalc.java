package SixLab;
import java.lang.*;

public class MatrixCalc {
    private static int[][] matrixCalc;
    private static int i, j;
    private Author author = new Author("name", 36, Sex.Male);

    public void fillMatrix(Matrix matrix, Author author) {
        int[][] array = matrix.getMatrixBody();
        int randomNumber = 20;
        String str = author.authorString();

        for (i = 0; i < matrix.getRowCount(); i++){
            for (j = 0; j < matrix.getColumnCount(); j++) {
                array[i][j] = (int) (Math.random() * randomNumber);
            }
        }

        matrix.setMatrixBody(array);
    }

    public void printMatrix(Matrix matrix, Author author){
        matrixCalc = matrix.getMatrixBody();
        for (i = 0; i < matrix.getRowCount(); i++){
            for (j = 0; j < matrix.getColumnCount(); j++)
                System.out.print(matrixCalc[i][j] + "\t");
            System.out.println();
        }
        String str = author.authorString();
        System.out.print(author);
    }


}
