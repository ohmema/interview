import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class Graph {
    private TreeMap<String,Vertex> vertices;
    
    public void add (Vertex v) {
        if ( vertices == null )
            vertices = new TreeMap<String,Vertex>();
        vertices.put(v.contents, v); 
        }
    
    public Vertex vert(String s) {
        Vertex v = new Vertex(s);
        add(v);
        return v; 
        }
    public Vertex vert(String s, Double lat, Double longx) {
        Vertex v = new Vertex(s, lat, longx);
        add(v);
        return v; 
        }
    
    public TreeMap<String,Vertex> vertices() { return vertices; }
   
    public Vertex vertex(String s) { return vertices.get(s); }
    public void print() {
        Collection c = vertices.values();
        Iterator itr = c.iterator();
        while(itr.hasNext()) {
            Vertex v = (Vertex) itr.next();
            v.print(); 
            } 
        }
    public Graph () {
 
        vertices = new TreeMap<String,Vertex>();
       
       
            
    }
}
        
