import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class File_program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dir="user.dir";
		//String dir="os.name";
		dir= System.getProperty(dir);
		System.out.printf("dir=%s\n",dir);
		dir ="temp.txt";
		File file = new File(dir);
		/*
		String files[]=file.list();
		for(String name:files)
			
		{
			System.out.printf("file name: %s\n", name);
		}
		*/
		try{
			/*
			if(!file.createNewFile())
			{
				System.out.print("Error\n");
			}
			*/
			//if(!file.exists())
			
				FileWriter fw = new FileWriter(file, true);
			
			fw.write("hello\n");  
			fw.write("chan\n");
			
			fw.close();
			
			
			BufferedReader reader = new BufferedReader(new FileReader("temp.txt"));
			
			String s="";
			int i=0;
			while((s=reader.readLine())!=null)
			{
				System.out.printf("line %d: %s\n", i++,s);
				
			}
			
			reader.close();
		}
		catch(Exception e){
			System.err.print(e.getMessage());	
		}
		
		
	}

}
