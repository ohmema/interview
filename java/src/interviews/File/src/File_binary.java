import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_binary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream(
					"bin.bin"));
			out.writeUTF("Changpil");
			out.writeLong(810762);

			out.close();

			DataInputStream in = new DataInputStream(new FileInputStream(
					"bin.bin"));

			System.out.printf("%s:%d\n", in.readUTF(), in.readLong());

			in.close();

		} catch (Exception e) {
			System.err.print(e.getMessage());
		}
	}

}
