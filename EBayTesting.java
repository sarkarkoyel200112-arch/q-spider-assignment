package day5Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//a[text()='Advanced']")).click();
		
		driver.findElement(By.xpath("//input[@id='_nkw']")).sendKeys("12");
		
		driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys("Dress");
		
		driver.findElement(By.xpath("//a[text()='using advanced search options']")).click();
		
		driver.findElement(By.xpath("//span[text()='By item number']")).click();
		

	}

}
