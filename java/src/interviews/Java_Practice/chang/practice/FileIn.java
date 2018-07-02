package chang.practice;
import java.io.*;
public class FileIn {
	public static void FileInTxt()
	{
		BufferedInputStream bis = null;
		try
		{
			String path = FileOut.class.getResource(".").toString();
			path = path.replace("file:/", "");
			File new_path = new File(path,"BufferedOutputStreamDemo.txt");
	         bis = new BufferedInputStream(new FileInputStream(new_path.getPath()));
	         while(bis .available() > 0) {
	             int currByte = bis.read();
	             System.out.print((char)currByte);
	         }
	                 
	      } catch (FileNotFoundException e) {
	          e.printStackTrace();
	      } catch (SecurityException e) {
	          e.printStackTrace();
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      finally {
	           //close the stream to release system resources
	             try {
	                 if (bis != null) {
	                     bis.close();
	                 }
	             } catch(Exception e) {
	                 e.printStackTrace();
	             }
	         }
	      
	    }
	 
	
}
