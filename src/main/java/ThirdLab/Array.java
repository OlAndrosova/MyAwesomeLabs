package ThirdLab;

public class Array {
    private int rowCount;
    private int columnCount;
    private int[][] arrayBody;

    Array(){
        this.rowCount = 0;
        this.columnCount = 0;
        this.arrayBody = new int[0][0];
    }

    Array(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.arrayBody = new int[columnCount][rowCount];
    }

    public int getRowCount(){
        return this.rowCount;
    }
    public void setRowCount(int rowCount){
        this.rowCount = rowCount;
    }

    public int getColumnCount(){
        return this.columnCount;
    }
    public void setColumnCount(int columnCount){
        this.columnCount = columnCount;
    }

    public int[][] getArrayBody() {
        return this.arrayBody;
    }
    public void setArrayBody(int [][] arrayBody){
        this.arrayBody = arrayBody;
    }


}
