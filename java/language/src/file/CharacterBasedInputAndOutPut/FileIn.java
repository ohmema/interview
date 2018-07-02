package language.file.CharacterBasedInputAndOutPut;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIn {

	public static void main(String[] args) {
		
		readFromFile("FileOutString.txt");
	}
	static void readFromFile(String fileName)
	{
		String thisLine = "";
		File filePath = FileOut.getFile(fileName);
		BufferedReader br = null;
		
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			while ((thisLine = br.readLine()) != null) {
				System.out.println(thisLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
