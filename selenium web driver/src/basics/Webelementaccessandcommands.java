package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementaccessandcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\browser driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		browser.get("http://apps.qaplanet.in/hrm/login.php");
		//browser is page ,findelement : which web element we haave to find(it is access command), sendkeys is operational command//
		browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
		browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
		browser.findElement(By.xpath("//input[@name='Submit']")).click();
		browser.findElement(By.xpath("//div[@id='option-menu-bar']//li[3]//a[1]")).click();
		browser.close();
		
	
		
	}

}

