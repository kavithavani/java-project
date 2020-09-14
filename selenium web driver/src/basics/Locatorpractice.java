package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\browser driver\\chromedriver_win32\\chromedriver.exe");
				WebDriver browser=new ChromeDriver();
				browser.get("http://apps.qaplanet.in/hrm/login.php");
				browser.findElement(By.name("txtUserName")).sendKeys("qaplanet1");
				browser.findElement(By.name("txtPassword")).sendKeys("lab1");
				browser.findElement(By.cssSelector("table:nth-child(2) tbody:nth-child(1) tr:nth-child(4) td:nth-child(1) > input.button")).click();
				browser.findElement(By.linkText("Logout")).click();
				browser.close();
	}

}
