package file;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.testng.Assert;

public class TestCase {

	@Test
	public void testDate() {
		// TODO Auto-generated method stub
		Write.WriteFile("File modified " + Write.todayDate(), "C:/test.txt");
		Read.ReadFile("C:/test.txt");
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		Assert.assertEquals(Read.ReadFile("C:/test.txt"), "File modified " + dateFormat.format(date));
	}



}
