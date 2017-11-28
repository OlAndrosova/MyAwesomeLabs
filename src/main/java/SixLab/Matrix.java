package SixLab;

public class Matrix {
    private int rowCount;
    private int columnCount;
    private int[][] matrixBody;
    private Author author;

    Matrix(){
        this.rowCount = 0;
        this.columnCount = 0;
        this.matrixBody = new int[0][0];
        this.author = getAuthor();
    }

    Matrix(int rowCount, int columnCount, Author author) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.matrixBody = new int[columnCount][rowCount];
        this.author= author;
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

    public int[][] getMatrixBody() {
        return this.matrixBody;
    }

    public void setMatrixBody(int [][] arrayBody){
        this.matrixBody = arrayBody;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
