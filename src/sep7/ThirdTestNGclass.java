package sep7;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import config.AppUtil;
import config.AppUtil1;

public class ThirdTestNGclass extends AppUtil1 {
	
	@Test
	public void branches() throws InterruptedException
	{
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void roles() throws InterruptedException
	{
		driver.findElement(By.xpath("(//img)[6]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void users() throws InterruptedException
	{
		driver.findElement(By.xpath("(//img)[7]")).click();
		Thread.sleep(5000);
	}
	@Test
	public void employees() throws InterruptedException
	{
		driver.findElement(By.xpath("(//img)[8]")).click();
		Thread.sleep(5000);
	}

}
