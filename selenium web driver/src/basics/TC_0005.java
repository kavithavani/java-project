package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_0005 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver browser=new ChromeDriver();
	browser.get("http://apps.qaplanet.in/hrm/login.php");
	browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	Thread.sleep(4000);
	
	browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	Thread.sleep(4000);
	browser.findElement(By.xpath("//input[@name='Submit']")).click();
	browser.findElement(By.linkText("Logout")).click();
	//browser.findElement(By.className("")).click();
	//Rex path : relative path  abs path: absolute path
	System.out.println(browser.getTitle());
	if(browser.getTitle().equals("OrangeHRM-new level of HR Management")) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
		browser.close();


	
	
	
	
	

		
	
}
}
