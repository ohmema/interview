package RandomGen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;

public class ReadFile {

	static FileReader inFile = null;
	static FileWriter outFile = null;
	static BufferedReader inBuffer = null;
	static BufferedWriter outBuffer =null;

	public String fileName(){
		String dirName="src/"; 
		FileManager fm = new FileManager();
		String fileName = dirName+fm.input();
		File file = new File(fileName);

		while(!file.exists()){
			System.out.println(fileName+" file does not exists!!");
			System.out.println(dirName);
			fm.showFiles(dirName);
			fileName = dirName+fm.input();
			file = new File(fileName);
		}
		System.out.println(file.getAbsolutePath());
		return file.getAbsolutePath();
	}
	public BufferedReader getReadFileInstance() throws Exception{
		if(inFile == null){
			String fileName=fileName();
			inFile = new FileReader(fileName);
			inBuffer = new BufferedReader(inFile);
		}
		return inBuffer;	

	}
	public void closeReadBuffer() throws Exception{
		inBuffer.close();
	}
	public void closeWriteBuffer() throws Exception{
		outBuffer.close();
	}
	public BufferedWriter getWriteFileInstance()throws Exception{
		if(outFile ==null){
			String fileName=fileName();
			outFile = new FileWriter(fileName);
			outBuffer = new BufferedWriter(outFile);
		}
		return outBuffer;

	}
	public void closeBufferedReader(){

	}
	public void storeData() throws Exception{
		BufferedReader br= getReadFileInstance();
		String line,allString="";
		Vector<String> lines = new Vector<String>();

		while((line=br.readLine())!=null){
			if(line.matches("([0-9]|[\\s])*")){
				allString += (line+" ");
			}
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		//StringTokenizer token = new StringTokenizer(allString);
		for(String s : allString.split("\\s+")){
			if(hm.containsKey(Integer.parseInt(s))){
				int count = hm.get((Integer)Integer.parseInt(s));
				hm.put(Integer.parseInt(s),new Integer(++count) );
			}else{
				hm.put(Integer.parseInt(s),new Integer(1) );
			}
					
		}
		
		for(Integer i:hm.keySet()){
			System.out.println("Key: "+i + ": "+hm.get(i));
		}
		//inBuffer.close();
	}
	public static void main(String[] args) {
		ReadFile rf = new ReadFile();
		try{
			rf.storeData();
		}
		catch(Exception e){}
	}

}
