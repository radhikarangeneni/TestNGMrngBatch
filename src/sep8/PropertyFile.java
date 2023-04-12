package sep8;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	WebDriver driver;
	Properties p;
	@BeforeTest
	public void setup()throws Throwable
	{
		p=new Properties();
		p.load(new FileInputStream("C:\\MorningBatch\\TestNG_Framework\\primus.properties"));
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(p.getProperty("Url"));
		
	}
@Test
public void login()
{
	driver.findElement(By.xpath(p.getProperty("objUser"))).sendKeys(p.getProperty("username"));
	driver.findElement(By.xpath(p.getProperty("objPass"))).sendKeys(p.getProperty("Password"));
	driver.findElement(By.xpath(p.getProperty("objLogin"))).click();
	
	
	
}
@AfterTest
public void tearDown()
{
	driver.quit();
}

}
