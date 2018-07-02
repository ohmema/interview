import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Weather {

	/**
	 * @param args
	 */
	
	public HashMap<Integer, Integer[]> parsedLines(String fileName) throws IOException{

		  String line;
		  List<String> lines = new ArrayList<String> ();
		  
		  File javaFile = new File(fileName);
		  if(javaFile.exists()){
			  FileReader file = new FileReader(fileName);
			  BufferedReader br = new BufferedReader(file);
			  while((line = br.readLine()) != null) 
				  lines.add( line);
			  file.close(); 	  
		  }
		  else{
			  System.out.println("File does not exist!");
			  System.exit(0);
		  }
		  
		Integer[] threeInt;
		HashMap<Integer,Integer[]> hTable = new HashMap<Integer,Integer[]>();
		 for(int i = 0;i<lines.size();i++){
			  threeInt=parsedInfo(lines.remove(i));
			  if(threeInt !=null){
				  hTable.put(threeInt[1]-threeInt[2],threeInt);	  
			  }
		 }
		
		 
		 
		 
		  return hTable;
	}
	public Integer[] parsedInfo(String data){
		boolean isFirst = true;
		data = data.replace('*',' ').trim();
		//System.out.println(data); 
		Integer[] val= null;
		StringTokenizer num = new StringTokenizer(data);
		while(num.hasMoreTokens()){
			String di = num.nextToken();
			if(isIntNumber(di)&&isFirst){
				//System.out.println(di); 
				val= new Integer[3];
				val[0]=(Integer.parseInt(di));
				val[1]=(Integer.parseInt(num.nextToken()));
				val[2]=(Integer.parseInt(num.nextToken()));
				return val;
			}
			isFirst=false;
		}
		return val;
	}
	
    public boolean isIntNumber(String num){
        try{
        Integer.parseInt(num);
        } catch(NumberFormatException nfe) {
        return false;
        }
        return true;
        }
	public static void main(String[] args) {
	
		Weather data = new Weather();
		try{
			
			 HashMap<Integer, Integer[]> hm= data.parsedLines("src/weather.dat");
			 TreeMap<Integer, Integer[]> tm = new TreeMap<Integer, Integer[]>(hm);
			 Iterator i = tm.entrySet().iterator();
			 System.out.println("Spread      DAY       MAX      MIN  ");
			 while(i.hasNext()){
			      Map.Entry<Integer, Integer[]> me = (Entry<Integer, Integer[]>) i.next();
			      Integer[] val = (Integer[])me.getValue();   
			      System.out.println( me.getKey()+"        "+val[0]+"          "+val[1]+"        "+val[2]);
			     // System.out.println("Key :"+ me.getKey()+"  value :"+val[0]+" "+val[1]+" "+val[2]+" ");
			    }		 
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
