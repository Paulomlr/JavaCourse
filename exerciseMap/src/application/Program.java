package application;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> regitro = new LinkedHashMap<>(); 

        System.out.print("Enter file full path: ");
        String path = in.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] fields = line.split(",");
                if (!regitro.containsKey(fields[0])){
                    regitro.put(fields[0], Integer.parseInt(fields[1]));
                }
                else {
                    int votos = regitro.get(fields[0]);
                    int totalVotos = Integer.parseInt(fields[1]) + votos;
                    regitro.put(fields[0], totalVotos);
                }
                line = br.readLine();
            }
            for (String key: regitro.keySet()){
                System.out.println(key + ": " + regitro.get(key));
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        in.close();
    }
}