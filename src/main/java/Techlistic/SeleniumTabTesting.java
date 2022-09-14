package Techlistic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTabTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-tutorials.html");
		//Thread.sleep(5000);
		
		//WebElement seleniumtab =
		driver.findElement(By.linkText("https://www.techlistic.com/p/selenium-tutorials.html")).click();
		/*Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(seleniumtab).build().perform();
		
		Select select = new Select(seleniumtab);
		select.selectByVisibleText("Selenium with TestNG"); */
		
		driver.quit();

	}

}
