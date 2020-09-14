package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_0001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

}
