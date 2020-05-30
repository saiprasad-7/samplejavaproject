package sample1example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaProject {

	@Test
	public void lofign()
	{
		System.setProperty("webdriver.chrome.driver", "D://chromedriver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.close();
	}
}

