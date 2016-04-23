package Basictest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() throws MalformedURLException {
		 driver=new FirefoxDriver();
		 driver.get("https://www.google.co.in");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 
			
	  }

 @Test(priority=1)
 public void sampletest() {
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("sample1");
	driver.findElement(By.xpath("//input[@id='lst-ib']")).clear();
	
	
	
	   
	  
 }
 @Test(priority=2)
 public void sampletest2() {
	 driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("sample2");
	
	   
	  
 }

 @AfterTest
 public void afterTest() {
	  driver.quit();
 }
}
