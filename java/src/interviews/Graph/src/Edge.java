public class Edge {
    private Vertex target;
    private int cost;
    public Edge ( Vertex v, int c ) {
        target = v;
        cost = c; }
    public void print() {
        System.out.print("(" + target.str() + ", " + cost + ") "); }
}

