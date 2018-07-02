import java.util.ArrayList;

public class Vertex {
    public String contents;
    private ArrayList<Edge> edges;
    private Integer cost;
    private Integer estimate;
    private Vertex parent;
    private boolean visited;
    private Double latitude;
    private Double longitude;
    public Vertex (String s)
      { contents = s;
        edges = new ArrayList<Edge>(); }
    public Vertex (String s, Double lat, Double longx) {
        contents = s;
        latitude = lat;
        longitude = longx;
        edges = new ArrayList<Edge>(); }
    public void add (Edge e) { edges.add(e); }
    
    public void add (Vertex v, int c) {
        edges.add( new Edge(v, c) ); }
    
    public void add (Vertex v, int c, boolean undirected) {
        edges.add( new Edge(v, c) );
        if ( undirected && ( this.contents.compareTo(v.contents) < 0 ) )
            v.edges.add( new Edge(this, c) ); 
        }
    
    public String str() { return contents; }
    public int cost() { return cost; }
    public Vertex parent() { return parent; }
    public Double latitude() { return latitude; }
    public Double longitude() { return longitude; }
    public int compareTo (Vertex other) {
        if ( this.cost == other.cost )
            return 0;
        else if ( this.cost < other.cost )
            return -1;
        else return 1; }
    public void print() {
        System.out.print("node " + contents);
        if ( latitude != 0.0 ) {
            System.out.print("  lat = " + latitude);
            System.out.print("  long = " + longitude); }
        System.out.print("  cost = " + cost);
        System.out.print("  parent = " +
                               ((parent == null) ? "null"
                                : parent.contents) + "   ");
        for ( Edge e : edges ) e.print();
        System.out.println(); }
    public Integer distanceTo(Vertex other) {     // in miles
        return ((Double) (gcdist(this.latitude, this.longitude,
                                 other.latitude, other.longitude)
                          * 0.62137119)).intValue(); 
        }
    
    public double gcdist (double lata, double longa, double latb, double longb)
    {
      double midlat, psi, dist;
      midlat = 0.5 * (lata + latb);
      psi = 0.0174532925
            * Math.sqrt(Math.pow(lata - latb, 2)
                    + Math.pow((longa - longb)
                               * Math.cos(0.0174532925 * midlat), 2));
      dist = 6372.640112 * psi;
      return dist;
    }   /* gcdist */


}

