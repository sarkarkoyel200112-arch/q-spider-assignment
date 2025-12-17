package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
		
		String errortext = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful.')]")).getText();
		System.out.println(errortext);
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'By creating an account')]")).getText();
		System.out.println(text);

	}

}
