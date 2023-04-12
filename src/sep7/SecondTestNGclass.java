package sep7;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil;

public class SecondTestNGclass extends AppUtil {
	@Test(priority=2,enabled=true)
	public void addition() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("76543");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("display")).sendKeys("987");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String drivers=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(drivers,true);
		
		
	}
	@Test(priority=0,enabled=true)
	public void multiplication() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("84569");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("display")).sendKeys("58");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String drivers=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(drivers,true);
	}
	@Test(priority=1,enabled=false)
	public void division() throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("956854");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("display")).sendKeys("12");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		Thread.sleep(1000);
		String drivers=driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(drivers,true);
	}
	
	
	

}
