import java.awt.Component;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JOptionPane;



public class AddressAndShowContents {

	public  boolean exists(String URLName){
		  try {
		    HttpURLConnection.setFollowRedirects(false);
		    HttpURLConnection con =
		       (HttpURLConnection) new URL(URLName).openConnection();
		    con.setRequestMethod("HEAD");
		    return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		    }
		  catch (Exception e) {
		      // e.printStackTrace();
		       return false;
		       }
		  }
	public String AskURL() {
		String address="";
			while(!exists(address)){
				address = JOptionPane.showInputDialog(null, 
		                "Enter a valid URL to continue ", 
		                "http://www.");
				
			}
		return address;
	}
	
	public Vector<String> getContents(String url){
	
		Vector<String> lines = new Vector<String>();
		 String inputLine;
		try{ 
			URL oracle = new URL(url);
			URLConnection urlc = oracle.openConnection();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
			//BufferedReader in = new BufferedReader(System.in);

			  while ((inputLine = in.readLine()) != null){
			      lines.add(inputLine);
				 // System.out.println(inputLine);
			  }
			  in.close();
		}catch(Exception e){
	
			
		}
		
		return lines;
	}
	
	public static void main(String[] args) {
		AddressAndShowContents show_and_input = new AddressAndShowContents();
		Vector<String> contents = show_and_input.getContents(show_and_input.AskURL());
		
		for(Iterator i = contents.iterator(); i.hasNext();){
			System.out.println(i.next());
			
		}
	}
}
