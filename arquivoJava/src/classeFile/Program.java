package classeFile;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();  //example: /home/cliente/Documents/javaCodigos/arquivoJava

        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for(File folder : folders){
            System.out.println(folder); //imprimindo os diretorios
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file); //imprimindo os arquivos
        }

        boolean success = new File(strPath + "\\subdir").mkdir();  //criando uma pasta no local srtPath
        System.out.println("Directory created successfully " + success);

        sc.close();
    }
}