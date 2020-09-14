package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_0003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\naren\\Desktop\\selenium downloads\\driver\\chromedriver_win32\\chromedriver.exe");
WebDriver browser=new ChromeDriver();
browser.get("http://apps.qaplanet.in/hrm/login.php");
browser.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("xxx");
browser.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
browser.findElement(By.xpath("//input[@name='Submit']")).click();

System.out.println(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText());
if(browser.findElement(By.xpath("//table[@id='Table_01']//tbody//tr//td//table//tbody//tr//td//strong//font")).getText().equals("Invalid Login")) {
	System.out.println("pass");
}
else{
System.out.println("fail");	
}
browser.close();
	}

}
