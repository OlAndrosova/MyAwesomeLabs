package SixLab;

import com.google.gson.*;

public class RunLab {

    public static void main(String[] args) {
        //MatrixCalc matrixCalc = new MatrixCalc();
        Author author = new Author("Alex Guck", 36, Sex.Male);

       // Matrix matrix = new Matrix(4,4, author);
        //matrixCalc.fillMatrix(matrix, author);
        //matrixCalc.printMatrix(matrix, author);

        String str = author.authorString();
        //System.out.println(str);

        Gson gson = new Gson();
        gson.toJson(author.authorString());
        String json = gson.toJson(str);
        String read = gson.fromJson(json, String.class);
        //System.out.println(read);

        if(str.equals(read))
            System.out.println("Is Equels");
        else
            System.out.println("Not");

    }

}
