package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwebdrivercommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
 WebDriver bo=new ChromeDriver();
bo.get("https://www.facebook.com/");
bo.close();
	}

}
