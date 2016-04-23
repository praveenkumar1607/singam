package Basictest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class mobileannotation {
	WebDriver driver;

  
  /*
  @Test
  public void loginwithoutpassword() {
	  
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).sendKeys("a@gmail.com");
	 // driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative1')]")).sendKeys("123");
	  
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_signin')]")).click();
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_menu')]")).click();
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/text_relative')]")).click();
	  driver.findElement(By.xpath("//commontestware.com.delieveryordermgmt[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/button_yes')]")).click();
  
  }
  */
  @Test
  public void validlogin() {
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).clear();
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).sendKeys("a@gmail.com");
	  driver.findElement(By.xpath("android.widget.RelativeLayout[contains(@bounds,'[524,1152][1020,1233]')]")).sendKeys("123");
	  
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_signin')]")).click();
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_menu')]")).click();
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/text_relative')]")).click();
	  driver.findElement(By.xpath("//commontestware.com.delieveryordermgmt[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/button_yes')]")).click();
  
  }
  /*
  
  @Test
  public void invalidlogin() {
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).sendKeys("abc@gmail.com");
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/edt_pass')]")).sendKeys("12345");
	  
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_signin')]")).click();
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_menu')]")).click();
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/text_relative')]")).click();
	  driver.findElement(By.xpath("//commontestware.com.delieveryordermgmt[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/button_yes')]")).click();
  
  }
  @Test
  public void loginwithoutuseridandpassword() {
	 // driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).sendKeys("a@gmail.com");
	  //driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative1')]")).sendKeys("123");
	  
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_signin')]")).click();
	  driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/btn_menu')]")).click();
	  driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/text_relative')]")).click();
	  driver.findElement(By.xpath("//commontestware.com.delieveryordermgmt[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/button_yes')]")).click();
  
  }
  */
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities cap=new DesiredCapabilities();
		 cap.setCapability("deviceName","J668A1ZR5B101972");
		 cap.setCapability(CapabilityType.BROWSER_NAME,"Android");
		 cap.setCapability(CapabilityType.VERSION,"5.1");
         cap.setCapability("platformName","Android");
		 cap.setCapability("appPackage","commontestware.com.delieveryordermgmt");
		//cap.setCapability("appActivity","com.example.bliss.mychecklist.Splash");
		//cap.setCapability("appActivity","com.example.bliss.mychecklist.Login");
		 cap.setCapability("appActivity","commontestware.com.delieveryordermgmt.view.MainActivity");
		 driver=new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/relative_email')]")).clear();
	  driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@resource-id,'commontestware.com.delieveryordermgmt:id/edt_pass')]")).clear();
	  
	  driver.quit();
  }

}
