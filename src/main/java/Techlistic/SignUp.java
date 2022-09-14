package Techlistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("tommy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("john");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.xpath("//input[@id='exp-3']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("02/08/2022");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		
		//selecting the continent from the dropdown list using SelectByVisisbleText
		WebElement continents =driver.findElement(By.id("continents"));
		Select select1 =new Select(continents);
		
		select1.selectByVisibleText("North America");
		
		driver.findElement(By.xpath("//option[text()='Wait Commands']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\gunda\\Desktop");
		
		
		driver.findElement(By.id("submit")).click();
		driver.quit();
	}

}
