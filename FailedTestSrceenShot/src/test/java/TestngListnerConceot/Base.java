package TestngListnerConceot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
public static WebDriver driver;
	
	public static void initilazition() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sel\\chromedriver.exe");

		 driver=new ChromeDriver();
	
	     driver.get("https://www.google.com");
	
	}
	
	
	public void failed(String testMethodName ) 
	{
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\GLB-132\\eclipse-workspace\\FailedTestSrceenShot\\Screenshot\\"+testMethodName+"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
