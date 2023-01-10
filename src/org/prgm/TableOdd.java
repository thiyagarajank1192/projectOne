//web table...

package org.prgm;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TableOdd {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abc\\eclipse-workspace\\ZMock\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("\n=============================");
		System.out.println("Printing the table content...");
		System.out.print("=============================");
		for(int i=0;i<rows.size();i++) {
			WebElement row = rows.get(i);
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				System.out.print(cols.get(j).getText()+"\t");
			}
			System.out.println();
		}
		// Printing the odd rows
		System.out.println("\n\n=============================");
		System.out.println("1. Printing the odd rows..");
		System.out.println("=============================");
		for(int i=1;i<rows.size();i+=2) {
			WebElement row = rows.get(i);
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				System.out.print(cols.get(j).getText()+"\t");
			}
			System.out.println();
		}
		// Printing the even rows
		System.out.println("=============================");
		System.out.println("2. Printing the even rows..");
		System.out.print("=============================");
		for(int i=0;i<rows.size();i+=2) {
			WebElement row = rows.get(i);
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for(int j=0;j<cols.size();j++) {
				System.out.print(cols.get(j).getText()+"\t");
			}
			System.out.println();
		}
		//Printing last row n last column value..
		WebElement lastrow = rows.get(rows.size()-1);
		List<WebElement> cols = lastrow.findElements(By.tagName("td"));
		WebElement lostcol = cols.get(cols.size()-1);
		System.out.println("\n=============================");
		System.out.println("3. Last row last column value: "+ lostcol.getText());
		System.out.println("=============================");
		//printing data with row n column values..
		System.out.println("\n===========================================");
		System.out.println("4.Printing data with row and colum number...");
		System.out.println("============================================");
		int r=3;
		int c=2;
		WebElement row = rows.get(r);
		List<WebElement> Cols = row.findElements(By.tagName("td"));
		WebElement Col = Cols.get(c-1);
		System.out.println("Row    =>"+r);
		System.out.println("Coulmn =>"+c);
		System.out.println("Value  =>"+Col.getText());
		
	}
}
