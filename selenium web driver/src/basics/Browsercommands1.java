package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		//we are calling the above link with bo object//
		bo.get("https://www.ikea.com/");
		String a=bo.getPageSource();
		System.out.println(a);
		String b=bo.getCurrentUrl();
		System.out.println(b);
		String c=bo.getTitle();
		System.out.println(c);
		bo.navigate().to("https://www.redbus.in/");
		Thread.sleep(5000);
		bo.navigate().back();
		Thread.sleep(4000);
		bo.navigate().forward();
		Thread.sleep(5000);
		bo.navigate().refresh();
		Thread.sleep(6000);
		bo.close();
		
		
	}

}
