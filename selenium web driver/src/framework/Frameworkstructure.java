package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameworkstructure {
void TC_0001() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/hrm/login.php");
	browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	Thread.sleep(4000);
	
	browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	Thread.sleep(4000);
	browser.findElement(By.xpath("//input[@name='Submit']")).click();
	Thread.sleep(5000);
	System.out.println(browser.getTitle());
	if(browser.getTitle().equals("OrangeHRM")) {
	System.out.println("pass");	
	}
	else {
		System.out.println("fail");
	}
		
	browser.close();
}
void TC_0002() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\naren\\\\Desktop\\\\selenium downloads\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/hrm/login.php");
	browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("xxx");
	browser.findElement(By.xpath("//input[@name='Submit']")).click();
	System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
	if(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText().equals("Invalid Login")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	browser.close();
}
void TC_0003() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/hrm/login.php");
	browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("xxx");
	browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	browser.findElement(By.xpath("//input[@name='Submit']")).click();

	System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
	if(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText().equals("Invalid Login")) {
		System.out.println("pass");
	}
	else{
	System.out.println("fail");
	}
	browser.close();
}
void TC_0004() {	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
WebDriver browser=new ChromeDriver();
browser.get("http://apps.qaplanet.in/hrm/login.php");
browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("xxx");
browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("yyy");
browser.findElement(By.xpath("//input[@name='Submit']")).click();
System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
if(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText().equals("Invalid Login")) {
	System.out.println("pass");
}
else {
	System.out.println("fail");
}
browser.close();
}

}
