package sample;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1Test {
	@Test
	public void t1()
	{
	WebDriver driver;
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			driver = WebDriverManager.chromedriver().create();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			driver = WebDriverManager.firefoxdriver().create();
		}
		else if(Browser.equalsIgnoreCase("microsoftEdge"))
		{
			driver = WebDriverManager.edgedriver().create();
		}else {
			driver = WebDriverManager.chromedriver().create();
		}
		driver.get(URL);
}
}