package testngframework;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//testng is a framework which is using java language
import org.testng.annotations.Test;

public class runframeworktestng {
	
  @Test(priority=1,enabled=true,groups="login")
  public void TC_0001() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		browser.get("http://apps.qaplanet.in/hrm/login.php");
		browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		
		
		browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		Thread.sleep(4000);
		browser.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(5000);
		System.out.println(browser.getTitle());
		Assert.assertEquals(browser.getTitle(), "OrangeHRM");
		
	
			
		browser.close();
  }
  @Test(priority=2,enabled=true,groups="login")
  public void TC_0002() {
	  System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\naren\\\\Desktop\\\\selenium downloads\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
	  WebDriver browser=new ChromeDriver();
	  browser.get("http://apps.qaplanet.in/hrm/login.php");
	  browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	  browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("xxx");
	  browser.findElement(By.xpath("//input[@name='Submit']")).click();
	  System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
	  Assert.assertEquals(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText(),"Invalid Login");
	  

	  
	  
	  browser.close();

	  
  }
  @Test(priority=3,enabled=true,groups="login")
  public void TC_0003() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver browser=new ChromeDriver();
	  browser.get("http://apps.qaplanet.in/hrm/login.php");
	  browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("xxx");
	  browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	  browser.findElement(By.xpath("//input[@name='Submit']")).click();

	  System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
	  Assert.assertEquals(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText(),"Invalid Login");
	  
	  
	  browser.close();

  }
  @Test(priority=4,enabled=true,groups="login")
  public void TC_0004() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver browser=new ChromeDriver();
	  browser.get("http://apps.qaplanet.in/hrm/login.php");
	  browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("xxx");
	  browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("yyy");
	  browser.findElement(By.xpath("//input[@name='Submit']")).click();
	  System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
	  Assert.assertEquals(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText(), "Invalid Login");
	 browser.close();
  }
  
//testNG is a sequential framework//
  //group is nothing but module//
  @Test(priority=5,enabled=true,groups="admin")
  public void TC_0005() throws InterruptedException {
	  
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/hrm/login.php");
	browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	Thread.sleep(4000);
	
	browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	Thread.sleep(4000);
	browser.findElement(By.xpath("//input[@name='Submit']")).click();
	browser.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	//browser.findElement(By.className("")).click();//
	//Rex path : relative path  abs path: absolute path//
	System.out.println(browser.getTitle());
	Assert.assertEquals(browser.getTitle(), "OrangeHRM - New Level of HR Management");
	
	browser.close();
}
  @Test(priority=6,enabled=true,groups="admin")
  public void TC_0006() throws InterruptedException {
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
  WebDriver browser=new ChromeDriver();
  browser.get("http://apps.qaplanet.in/hrm/login.php");
  browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
  browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
  browser.findElement(By.xpath("//input[@name='Submit']")).click();
  browser.findElement(By.xpath("//div[@id='option-menu-bar']//li[2]//a[1]")).click();
  Thread.sleep(4000);
  System.out.println(browser.getTitle());
  Assert.assertEquals(browser.getTitle(), "OrangeHRM");
  browser.close();

}
  
}