package TestngListnerConceot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListner.class)
public class ScreevShotTest extends Base{

	@BeforeMethod
	public void setup()
	{
		initilazition();
	}
	
	
	@AfterMethod
	public void teardown() 
	{
		driver.quit();
	}
	
	@Test
	public void LoginTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void HomePageTest()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void SerchTest()
	{
		Assert.assertEquals(false, true);
	}
}
