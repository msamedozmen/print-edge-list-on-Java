import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

public class Graph {
    HashMap<Integer,Node> nodes;

    public Graph() {
        this.nodes = new HashMap<>();
    }

    public void add(int node1,int node2, int strength){
        if(nodes.get(node1)==null)
            nodes.put(node1,new Node(node1));
        if(nodes.get(node2)==null)
            nodes.put(node2,new Node(node2));

        Node n1 = nodes.get(node1);
        Node n2 = nodes.get(node2);
        Edge edge = new Edge(n1,n2,strength);
        n1.addToList(edge);
    }

    public void printToFile(){
        try {
            File output = new File("Output.txt");
            FileWriter fileWriter = new FileWriter(output);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(Integer i:nodes.keySet()){
                String edges = nodes.get(i).toString();
                bufferedWriter.write(edges);
            }
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception exception){
            System.out.println("An error has occurred!!");
        }

    }
}
