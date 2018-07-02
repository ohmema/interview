package RandomGen;

import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

public class RnadomGenerator {

	/**
	 * @param args
	 */
	public Vector<Integer> generator(int col, int num){
		Random random = new Random();
		Vector<Integer> v = new Vector<Integer>(); 
		for(int i=0;i<col;i++){
			v.add(random.nextInt(num));
		}
		return v;
	
	}
	public static void main(String[] args) {
		RnadomGenerator r = new RnadomGenerator ();
		Vector<Integer> v = r.generator(10,10);
		for(Iterator<Integer> i = v.iterator();i.hasNext();){
			Integer _int = i.next();
			System.out.println(_int);
		}
	}

}
