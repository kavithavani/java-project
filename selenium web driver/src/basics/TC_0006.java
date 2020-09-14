package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_0006 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
WebDriver browser=new ChromeDriver();
browser.get("http://apps.qaplanet.in/hrm/login.php");
browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
browser.findElement(By.xpath("//input[@name='Submit']")).click();
browser.findElement(By.xpath("//div[@id='option-menu-bar']//li[2]//a[1]")).click();
System.out.println(browser.getTitle());
if(browser.getTitle().equals("OrangeHRM")) {
	System.out.println("pass");
	
}
else {
	System.out.println("fail");
}
browser.close();
}
}