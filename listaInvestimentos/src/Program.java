import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        PrintWriter pw = null;

        System.out.print("Enter full path file: ");
        String file = in.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            List<Investimento> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                Investimento investimento = new Investimento(fields[0], fields[1], Double.parseDouble(fields[2]), Integer.parseInt(fields[3]), Double.parseDouble(fields[4]));
                list.add(investimento);
                line = br.readLine();
            }

            Collections.sort(list);

            pw = new PrintWriter(new FileWriter("saidaInvest.txt"));
            for (Investimento invs : list){
                pw.println(invs);
            }

        }
        catch (IOException e){
            System.out.println("Error: arquivo não encontrado");
        }
        finally {
            pw.close();
        }
        in.close();
    }
}