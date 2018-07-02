package language.file.StreamBasedInAndOut.SttreamInAndOut;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class StreamFileOut {

	public static void main(String[] args) {
		generateIntToDataOut("IntDataStreamOut.dat");
		generateDoubleToDataOut("DoubleDataStreamOut.dat");
		generateStringToDataOut("StringDataStreamOut.dat");
	}

	public static File getFile(String fileName) {
		String path = StreamFileOut.class.getResource(".").toString();
		path = path.replace("file:/", "");
		path = path.replace("%20", " ");
		File filePath = new File(path, fileName);
		return filePath;
	}

	public static void generateIntToDataOut(String fileName) {
		File filePath = getFile(fileName);
		DataOutputStream dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream(filePath));
			dout.writeInt(123);
			dout.writeInt(12);
			dout.writeInt(13);
			dout.writeInt(5234);
			dout.writeInt(-342);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}

	public static void generateDoubleToDataOut(String fileName) {
		File filePath = getFile(fileName);
		DataOutputStream dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream(filePath));
			dout.writeDouble(123.22);
			dout.writeDouble(-123.22);
			dout.writeDouble(13);
			dout.writeDouble(-0);
			dout.writeDouble(0);
			dout.writeDouble(-342);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}

	public static void generateStringToDataOut(String fileName) {
		File filePath = getFile(fileName);
		DataOutputStream dout = null;
		try {
			dout = new DataOutputStream(new FileOutputStream(filePath));
			dout.writeBytes("It was the best of times, it was the worst of times,\n");
			dout.writeChars("it was the age of wisdom, it was the age of foolishness,\n");
			dout.writeChar('a');
			dout.writeChar('b');
			dout.writeChar('c');

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}
}
