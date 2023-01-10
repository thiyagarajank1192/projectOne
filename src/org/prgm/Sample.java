package org.prgm;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\eclipse-workspace\\ZMock\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement l = driver.findElement(By.name("login"));
		System.out.println("Font Size : "+ l.getCssValue("font-size"));
		System.out.println("Font type : "+ l.getCssValue("font-style"));
		//driver.close();

	}

}
