package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBySurroundingAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Mobiles");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter New to narrow results']//i[@class='a-icon a-icon-checkbox']")).click();

	}

}
