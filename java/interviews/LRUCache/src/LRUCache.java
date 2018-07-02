import java.util.Hashtable;


public class LRUCache {

	Hashtable<Integer, Integer> cache;
	int capacity;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
    }
    
    public int get(int key) {
        return cache.get(key%capacity);
    }
    
    public void set(int key, int value) {
        cache.put(key%capacity, value);
    }
	public static void main(String[] args) {
		

	}
	
	

}
