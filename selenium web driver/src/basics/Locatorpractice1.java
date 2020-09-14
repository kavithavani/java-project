package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\browser driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver browser=new ChromeDriver();
			browser.get("https://www.redbus.in/");
			Thread.sleep(5000);
			//click on bus tickets link in redbus application//
			browser.findElement(By.id("redBus")).click();
			//browser.get("https://www.redbus.in/bus-tickets/");
			//browser.findElement(By.xpath("//input[@id='src']")).sendKeys("hyderabad");
			
			//browser.findElement(By.xpath("//a[@id='redBus']")).click();//
			//browser.findElement(By.id("cars")).click();//
			// click on back and click on rpool//
			browser.navigate().back();
			browser.findElement(By.xpath("//a[@id='cars']")).click();
			
	}

}
