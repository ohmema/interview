import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class File_object {

		String name;
		int age;
		String ssn;
		
		File_object(String n, int a, String ssn)
		{
			name =n;
			age=a;
			this.ssn=ssn;
		}
	
	public static void main(String[] args) {
		File_object objectFile = new File_object("changpil",30,"33333"); 
	
		try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ch4.obj"));
			
			out.writeObject(objectFile);
			out.flush();
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("ch4.obj"));
			File_object an= (File_object)in.readObject();
			
			System.out.printf("%s  %d  %s", an.name,an.age, an.ssn);
			in.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();  
			
		}

	}

}
