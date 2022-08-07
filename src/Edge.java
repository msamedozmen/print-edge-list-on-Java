public class Edge {
    @Override
    public String toString() {
        return "("+to.id+","+weight+") ";
    }

    Node from,to;
    int weight;

    public Edge(Node from, Node to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
