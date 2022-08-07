import java.util.LinkedList;

public class Node {
    int id;
    LinkedList<Edge> list;

    public Node(int id) {
        this.id = id;
        this.list = new LinkedList<>();
    }
    public void addToList(Edge edge){
        list.add(edge);
    }

    @Override
    public String toString() {
        String nodes = id + " = ";
        for(int i = 0; i< list.size();i++){
            nodes+=list.get(i).toString();
            if(i!=list.size()-1)
                nodes+="-> ";
        }

        return nodes+"\n";
    }
}
