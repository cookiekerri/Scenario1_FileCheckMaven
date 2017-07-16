package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Read {

	public static String ReadFile (String FilePath) {
		   //Specify the path of the file here
			//"C://myfile.txt"
	      File file = new File(FilePath);
	      BufferedInputStream bis = null;
	      FileInputStream  fis= null;
	      String FileString = "";
	      try
	      {
	          //FileInputStream to read the file
	          fis = new FileInputStream(file);

	          /*Passed the FileInputStream to BufferedInputStream
	           *For Fast read using the buffer array.*/
	          bis = new BufferedInputStream(fis);

	          /*available() method of BufferedInputStream
	           * returns 0 when there are no more bytes
	           * present in the file to be read*/
	          while( bis.available() > 0 ){             	
	              //System.out.print((char)bis.read());
	              FileString += (char)bis.read();
	          }
	          System.out.println(FileString);
	       }catch(FileNotFoundException fnfe)
	        {
	            System.out.println("The specified file not found" + fnfe);
	        }
	        catch(IOException ioe)
	        {
	            System.out.println("I/O Exception: " + ioe); 
	        }
	        finally
	        {
	            try{
	               if(bis != null && fis!=null)
	               {
	       	          fis.close();
	                  bis.close();
	               }      
	             }catch(IOException ioe)
	              {
	                  System.out.println("Error in InputStream close(): " + ioe);
	              }         
	        }
		
	      return FileString;
	}
}
