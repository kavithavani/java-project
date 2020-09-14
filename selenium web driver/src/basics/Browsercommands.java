package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver browser=new ChromeDriver();
		//gettitle():string-webdriver
		//here we have three parameters
		//1st parameter : gettitle()
		//1st parameter amy be variable or method 
		//method(): without parameter
		//method(string arg0): with parameter
		//gettitle(): method witout parameter
		//2nd parameter: string
		//string is return type 
		//3rd parameter : (class) webdriver 
		//3rd parameter is class
		
		
		browser.get("https://www.redbus.in/");
		browser.getTitle();
		String a=browser.getTitle();
		System.out.println(a);
	String b=browser.getCurrentUrl();
			System.out.println(b);
		String c=browser.getPageSource();
		System.out.println(c);
		//navigation commands//
		browser.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		browser.navigate().back();
		Thread.sleep(3000);
		browser.navigate().forward();
		Thread.sleep(3000);
		browser.navigate().refresh();
		Thread.sleep(3000);
		browser.close();
		
	}

}
