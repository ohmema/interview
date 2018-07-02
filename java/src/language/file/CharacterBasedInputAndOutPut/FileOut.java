package language.file.CharacterBasedInputAndOutPut;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOut {

	public static void main(String[] args) {
		String content = new StringBuilder()
        .append("It was the best of times, it was the worst of times,\n")
        .append("it was the age of wisdom, it was the age of foolishness,\n")
        .append("it was the epoch of belief, it was the epoch of incredulity,\n")
        .append("it was the season of Light, it was the season of Darkness,\n")
        .append("it was the spring of hope, it was the winter of despair,\n")
        .append("we had everything before us, we had nothing before us")
        .toString();
		
		writeToFile("FileOutString.txt", content);
	}
	
	public static File getFile(String fileName)
	{
		String path = FileOut.class.getResource(".").toString();
		path = path.replace("file:/", "");
		path = path.replace("%20", " ");
		File filePath = new File(path, fileName);
		return filePath;
	}
	
	static void writeToFile(String fileName, String content)
	{
		File outFile = getFile(fileName);
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(outFile));
			bw.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
