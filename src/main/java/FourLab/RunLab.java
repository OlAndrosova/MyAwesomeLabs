package FourLab;

public class RunLab {
    public static void main(String[] args) {
        MatrixCalc arrayCalc = new MatrixCalc();
        Matrix workMatrix = new Matrix(5, 5);
        arrayCalc.fillArray(workMatrix);
        arrayCalc.printArray(workMatrix);
        System.out.print("max = " + arrayCalc.findMaxElement(workMatrix));
        System.out.print("\nmin = " + arrayCalc.findMinElement(workMatrix));
        System.out.print("\nmin stream = " + arrayCalc.printMin(workMatrix));
        System.out.print("\nmax stream = " + arrayCalc.printMax(workMatrix));
    }
}
