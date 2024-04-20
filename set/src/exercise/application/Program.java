package exercise.application;

import exercise.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = in.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Instant moment = Instant.parse(fields[1]);
                set.add(new LogEntry(username, moment)); //se eu tentar inserir um LogEntry repitido, a inserção no conjunto é barrada
                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
