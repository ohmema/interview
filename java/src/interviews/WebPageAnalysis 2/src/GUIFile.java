import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class GUIFile{


	// set up GUI
	
	public static File getFile()
	{
		JFileChooser  fileChooser = new JFileChooser(new File(".").getAbsolutePath());
		int result = fileChooser.showSaveDialog(null) ;

		if(result == JFileChooser.CANCEL_OPTION)
			System.exit(1);

		File fileName = fileChooser.getSelectedFile(); // get selected file
	
		if ( ( fileName == null ) || ( fileName.getName().equals( "" ) ) )
		{
			JOptionPane.showMessageDialog( null, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE );
			System.exit( 1 ) ;
		} // end if

		return fileName;
	} 

	public static File chooseFile()
	{
		JFileChooser  fileChooser = new JFileChooser(new File(".").getAbsolutePath());
		int result = fileChooser.showOpenDialog(null) ;
		File fileName = fileChooser.getSelectedFile(); // get selected file
		if ( ( fileName == null ) || ( fileName.getName().equals( "" ) ) )
		{
			JOptionPane.showMessageDialog( null, "Invalid File Name",
					"Invalid File Name", JOptionPane.ERROR_MESSAGE );
			System.exit( 1 ) ;
		} // end if
		
		return fileName;
	}

}
