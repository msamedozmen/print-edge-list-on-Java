import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.security.spec.ECField;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        try {
            File input = new File("Input.txt");
            FileReader fileReader = new FileReader(input);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            for(int i = 0; i<32836; i++){
                String edge = bufferedReader.readLine();
                String inputs[] = edge.split(" ");
                int n1 = Integer.valueOf(inputs[0]);
                int n2 = Integer.valueOf(inputs[1]);
                int weight = Integer.valueOf(inputs[2]);
                graph.add(n1,n2,weight);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e){
            System.out.println("The input file cannot be read!!!");
        }

        graph.printToFile();
    }
}
