import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class SaveContents {

	public static void save(){
		AddressAndShowContents show_and_input = new AddressAndShowContents();
		Vector<String> contents = show_and_input.getContents(show_and_input.AskURL());

		
		try{
			File file = GUIFile.getFile();
			if(!file.exists()){
				file.createNewFile();
			}
			//System.out.println(file.getName());
			String p = file.getAbsolutePath();
			FileWriter fw = new FileWriter(p);
			BufferedWriter bw = new BufferedWriter(fw);
			for(Iterator i = contents.iterator(); i.hasNext();){
				bw.write((String)i.next());
				bw.newLine();
				 //System.out.println((String)i.next());
				
			}
			bw.flush();
			bw.close();
		}catch(IOException e){
			e.printStackTrace();
		}

		
		
		
		

	}
	public static void main(String[] args) {
		SaveContents sc= new SaveContents();
		sc.save();
		
	}

}
