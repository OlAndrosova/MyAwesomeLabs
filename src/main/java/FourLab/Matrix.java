package FourLab;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private int rowCount;
    private int columnCount;
    List<List<Integer>> matrix;

    Matrix(){
        this.rowCount = 0;
        this.columnCount = 0;
        this.matrix = new ArrayList();
    }

    Matrix(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.matrix = new ArrayList();
    }

    public int getColumnCount(){
        return this.columnCount;
    }
    public void setColumnCount(int columnCount){
        this.columnCount = columnCount;
    }

    public int getRowCount(){
        return this.rowCount;
    }
    public void setRowCount(int rowCount){
        this.rowCount = rowCount;
    }

    public List<List<Integer>> getMatrix(){
        return this.matrix;
    }
    public void setMatrix(List<List<Integer>> matrix){
        this.matrix = matrix;
    }
}
