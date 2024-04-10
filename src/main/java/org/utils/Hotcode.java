package org.utils;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Hotcode {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.xpath("//div[text()='Signup']")).click();
	
	String parentwindow = driver.getWindowHandle();
	Set<String> windowHandles = driver.getWindowHandles();
	for (String handle : windowHandles) {
	if(!handle.equals(parentwindow)) {
		driver.switchTo().window(handle);
	}
	
	}
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	
	WebElement element = driver.findElement(By.id("first_name"));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	element.sendKeys("sivakumar");
	boolean displayed = element.isDisplayed();System.out.println(displayed);
	
	WebElement element2 = driver.findElement(By.xpath("//img[@alt='date']"));
	element2.click();
	
	
	
	
//driver.close();	
}

}