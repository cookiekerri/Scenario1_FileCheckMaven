package fileTest;

import org.testng.annotations.Test;

import file.Read;
import file.Write;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class TestNGTests {
  @Test
  public void writeTest() {
	  Write.WriteFile("File modified " + Write.todayDate(), "C:/test.txt");
		Read.ReadFile("C:/test.txt");
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		Assert.assertEquals(Read.ReadFile("C:/test.txt"), "File modified " + dateFormat.format(date));
  }
  @BeforeMethod
  public void beforeMethod() {
  }

}
