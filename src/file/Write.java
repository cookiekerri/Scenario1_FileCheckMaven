package file;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteFile("File modified " + todayDate(), "C:/myfile.txt");
		Read.ReadFile("C:/myfile.txt");
	}

	public static String todayDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		return dateFormat.format(date);
		
	}
	public static void WriteFile(String stringToWrite, String WriteToPath){
		 BufferedWriter bw = null;
	      try {
	         //Specify the file name and path here
		 File file = new File(WriteToPath);

		 /* This logic will make sure that the file 
		  * gets created if it is not present at the
		  * specified location*/
		  if (!file.exists()) {
		     file.createNewFile();
		  }

		  FileWriter fw = new FileWriter(file);
		  bw = new BufferedWriter(fw);
		  bw.write(stringToWrite);
	          System.out.println("File written Successfully");

	      } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception e){
		       System.out.println("Error in closing the BufferedWriter" + e);
		    }
		}
		
	}
}
