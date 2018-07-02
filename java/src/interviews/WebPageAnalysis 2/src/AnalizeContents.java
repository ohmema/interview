import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;



public class AnalizeContents {
	public static String VectorToString(Vector<String> v){
		String ph="";

		for(Iterator i = v.iterator();i.hasNext();){
			ph +=(String)i.next()+"\n"; 
		}
		return ph;
	}
	public static Vector<String> getContents(){
		String line;
		Vector<String> lines = new Vector<String>();

		try{
			File file = GUIFile.chooseFile();
			FileReader fr = new FileReader(file.getAbsolutePath());
			BufferedReader br = new BufferedReader(fr);


			while((line=br.readLine())!=null){
				lines.add(line);
			}
		}catch(Exception e){

		}
		return lines;
	}
	public static boolean checkString(String line){
		String regExp =".*(html|php|python|javascript).*";
		//return line.contains(regExp.subSequence(0, regExp.length()));
		return line.matches(regExp);
	}
	
	
	public static void analize(){
		Vector<String> lines = AnalizeContents.getContents();
		Vector<String> selectedLines = new Vector<String>();
		String _line;
		for(Iterator i = lines.iterator();i.hasNext();){
			_line = (String)i.next();
			if(checkString(_line.toLowerCase())){
				selectedLines.add(_line);
				System.out.println(_line);	
			}
		}
		
		
		JOptionPane.showMessageDialog(null, VectorToString(selectedLines));

	}

	public static void main(String[] args) {
		AnalizeContents.analize();
	}
}
