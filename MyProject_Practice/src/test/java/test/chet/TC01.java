package test.chet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01 {
	WebDriver driver;
	@Test
	public void test1(){
		System.out.println("sample");
		System.setProperty("webdriver.chrome.driver","D:\\CSProject\\MyProject_Practice\\drivers\\chromedriver.exe");
		   ChromeDriver f = new ChromeDriver();
		   f.get("http://www.monster.com");
		//driver=new FirefoxDriver();
	}
}
