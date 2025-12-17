package day6Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeVideoSignup {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.primevideo.com/offers/nonprimehomepage");
        
        
        
        driver.findElement(By.xpath("//a[@class='ODY5qo tdZtlO yHcUia a-SaCx']//span[@class='_4EyTZx'][normalize-space()='Join Prime']")).click();
        
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Koyel Sarkar");
        
        
        
        driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7000592671");
        
        driver.findElement(By.xpath("//a[normalize-space()='Conditions of Use and Privacy Notice']")).click();
        
        driver.findElement(By.xpath("//li[@class='iUFzdn jH3Elq']//span[@class='_4EyTZx'][normalize-space()='Home']")).click();
    }
}
