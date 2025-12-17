package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search_query']")).sendKeys("rongin fanush song");
		
		driver.findElement(By.xpath("//button[@aria-label='Search' and @title='Search']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-formatted-string[@aria-label='রঙিন ফানুস | First Kiss | Prank King | Eshan Sabbir | Afrina Rup | S R Sobuj | New Music Video 2025 3 minutes, 35 seconds' or contains(text(),'First Kiss')]")).click();
		
		

	}

}
