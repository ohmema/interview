package chang.practice;

import java.io.*;

public class FileOut {
	public static void FileOutTxt() {

		

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try 
		{
			String path = FileOut.class.getResource(".").toString();
			path = path.replace("file:/", "");
			File new_path = new File(path,"BufferedOutputStreamDemo.txt");
			bos = new BufferedOutputStream(new FileOutputStream(new_path.getPath()));
			
			byte b = 66;
			bos.write(b);
			bos.write("HGelleo".getBytes());

		} 
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("Specified file not found" + fnfe);
		} 
		catch (IOException ioe) 
		{
			System.out.println("Error while writing to file" + ioe);
		} 
		finally 
		{

					try {
						bos.flush();
						bos.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					

		}

	}
}
