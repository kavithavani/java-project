package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class runframeworktestng1 {
  @Test
  public void TC_0001() {
	  System.setProperty("", "");
	  WebDriver browser=new ChromeDriver();
	  browser.findElement(By.xpath("")).sendKeys("");
	  
  }
}
