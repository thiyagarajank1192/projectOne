package org.prgm;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitsExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\eclipse-workspace\\ZMock\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(25));
		driver.findElement(By.id("email")).sendKeys("Admin123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Admin");
		System.out.println("Wating for login button....");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']")));
		System.out.println("Login button is clickable...");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
}
