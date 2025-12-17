package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://frameskraft.com/");
		
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Sunglass");
		
		driver.findElement(By.xpath("//button[@class='btn searchBtn']")).click();
		
	}

}
