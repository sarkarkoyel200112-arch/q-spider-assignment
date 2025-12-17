package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String textStartsWith = driver.findElement(By.xpath("//span[starts-with(text(),'Sign')]")).getText();
		System.out.println(textStartsWith);
		
		String textEndsWith = driver.findElement(By.xpath("//span[ends-with(text(),'newsletter:')]")).getText();
		System.out.println(textEndsWith);

	}

}
