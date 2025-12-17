package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexing {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("TV");
        
        driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']//*[name()='svg']")).click();
        
        driver.findElement(By.xpath("//div[normalize-space()='Thomson Alpha 60 cm (24 Inch) HD Ready LED Smart Linux TV with 20 W Sound Output']")).click();
        
        driver.findElement(By.xpath("//button[@class='dSM5Ub']")).click();
    }
}
