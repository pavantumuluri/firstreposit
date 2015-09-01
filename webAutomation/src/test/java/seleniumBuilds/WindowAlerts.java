package seleniumBuilds;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class,ConfigurationListener.class,MethodListener.class})

public class WindowAlerts {
	{
		System.setProperty("atu.reporter.config", "H:\\maven Build Creation Programs\\atu.properties");
	}
	
	WebDriver fd;
	@BeforeTest
	public void urlOpen()
	{
		fd=new FirefoxDriver();
		fd.get("http://www.skilledpool.com/");
		fd.manage().window().maximize();
	}
	@Test
	public void windowHandling() throws Exception
	{
		WebElement signUp=fd.findElement(By.linkText("Sign up"));
		new Actions(fd).moveToElement(signUp).perform();
		Thread.sleep(5000);
		fd.findElement(By.linkText("Employer")).click();
		Thread.sleep(5000);
		fd.findElement(By.id("type2")).click();
		fd.findElement(By.id("firstname")).sendKeys("pavan");
		fd.findElement(By.id("company_name")).sendKeys("pavan software");
		new Select(fd.findElement(By.id("category"))).selectByIndex(4);
		fd.findElement(By.id("email")).sendKeys("abc@gmail.com");
		fd.findElement(By.id("password")).sendKeys("abc123");
		fd.findElement(By.id("confpassword")).sendKeys("abc123");
		new Select(fd.findElement(By.id("country_code1"))).selectByValue("IN");
		Thread.sleep(5000);
		new Select(fd.findElement(By.id("state"))).selectByValue("2");
		Thread.sleep(5000);
		new Select(fd.findElement(By.id("city"))).selectByValue("1021442");
		fd.findElement(By.id("zipcode")).sendKeys("540008");
		fd.findElement(By.id("address")).sendKeys("malkaj giri,sec-bad");
		fd.findElement(By.id("address")).click();
		Thread.sleep(9000);
		Runtime.getRuntime().exec("H:\\JAVA PROGRAMS\\upload.exe");
		fd.findElement(By.id("userfile")).click();
		fd.findElement(By.id("website")).sendKeys("www.abc.com");
		fd.findElement(By.id("phone")).sendKeys("1234567890");
		Thread.sleep(5000);
		fd.switchTo().frame(fd.findElement(By.xpath("//*[@title='Rich text editor, description']")));
		fd.findElement(By.tagName("body")).sendKeys("this about company");
		
	}
}
