package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsercommands2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("https://www.facebook.com/");
	String a=bo.getCurrentUrl();
	System.out.print(a);
	String b=bo.getPageSource();
	System.out.println(b);
	String c=bo.getTitle();
	System.out.println(c);
	bo.navigate().to("https://www.amazon.ca/");
	bo.navigate().back();
	bo.navigate().forward();
	bo.navigate().refresh();
	
	}

}
