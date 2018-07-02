package language.file.StreamBasedInAndOut.SttreamInAndOut;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class StreamFileIn {

	public static void main(String[] args) {
		System.out.println("InTDataStreamOut.DAT");
		getIntFromData("InTDataStreamOut.DAT");
		System.out.println("dOUBLEDataStreamOut.DAT");
		getDoubleFromData("dOUBLEDataStreamOut.DAT") ;
		System.out.println("StringDataStreamOut.DAT");
		getStringFromData("StringDataStreamOut.DAT");
	}

	public static void getIntFromData(String fileName) {
		DataInputStream din = null;
		try {
			File filePath = StreamFileOut.getFile(fileName);
			din = new DataInputStream(new FileInputStream(filePath));
			while (din.available() > 0) {
				int vin = din.readInt();
				System.out.println(vin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}
	
	public static void getDoubleFromData(String fileName) {
		DataInputStream din = null;
		try {
			File filePath = StreamFileOut.getFile(fileName);
			din = new DataInputStream(new FileInputStream(filePath));
			while (din.available() > 0) {
				double vin = din.readDouble();
				System.out.println(vin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}
	
	public static void getStringFromData(String fileName) {
		DataInputStream din = null;
		try {
			File filePath = StreamFileOut.getFile(fileName);
			din = new DataInputStream(new FileInputStream(filePath));
			while (din.available() > 0) {
				byte vin = din.readByte();
				System.out.print((char)vin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
			} catch (Exception e) {
				System.out.println("error when closing BufferedReader ");
			}
		}
	}
}
