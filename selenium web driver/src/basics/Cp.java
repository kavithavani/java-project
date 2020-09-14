package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver kkk=new ChromeDriver();
		kkk.get("https://www.google.ca/");
		kkk.getCurrentUrl();
		String a=kkk.getCurrentUrl();
		System.out.println(a);
		kkk.getPageSource();
		String b=kkk.getPageSource();
		System.out.println(b);
		kkk.getTitle();
		String c=kkk.getTitle();
		System.out.println(c);
		
		
		
	}

}
