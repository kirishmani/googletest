package googletest;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class GoogleTest {
	public WebDriver wd;
	@org.testng.annotations.Test
	public void openbrowser()
	{
		wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
	}
	@AfterMethod
	public void teardown() throws IOException
	{
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src,new File("D:\\WORKSPACE\\bdd2-test\\screenshot"));
		

	}
	

}
