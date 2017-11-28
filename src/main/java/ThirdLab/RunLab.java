package ThirdLab;

public class RunLab {
    public static void main(String[] args) {
        ArrayCalc arrayCalc = new ArrayCalc();

        Array workArray = new Array(5, 5);
        arrayCalc.fillArray(workArray);
        arrayCalc.printArray(workArray);

        System.out.print("max = " + arrayCalc.findMaxElement(workArray) + "\n");
        System.out.print("min = " + arrayCalc.findMinElement(workArray) + "\n");
    }
}