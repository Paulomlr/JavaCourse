package classeFileReader_BufferedReader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};

        String path = "src/classeFile/out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){ // true significa que o arquivo no qual eu to referenciando, se ti tiver algo, não vair ser apagado mas sim escrito em baixo
           for (String line : lines){
               bw.write(line);
               bw.newLine();
           }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
