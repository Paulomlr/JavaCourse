package exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter a file path: ");
        String sourceFileStr= sc.nextLine();

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();
        System.out.println(sourceFolderStr);

        boolean success = new File(sourceFolderStr + "/out").mkdir();

        if (success) {
            System.out.println("Output directory created successfully.");
        } else {
            System.out.println("Failed to create output directory.");
        }

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                line = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item : list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + "CREATED");
            }
            catch (IOException e){
                System.out.println("Error: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
