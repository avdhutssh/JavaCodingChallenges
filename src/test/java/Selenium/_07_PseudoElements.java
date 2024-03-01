package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _07_PseudoElements {

	@Test
	public void _1_usingQuerySelector() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://play1.automationcamp.ir/advanced.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String rating = js.executeScript(
				"return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')")
				.toString().replaceAll("\"", "");
		WebElement textBox = driver.findElement(By.xpath("//*[@id='txt_rating']"));
		textBox.sendKeys(rating);
		driver.findElement(By.xpath("//*[normalize-space(text())='Check Rating']")).click();
		driver.findElement(By.cssSelector(".badge.badge-success")).getText().equalsIgnoreCase("Well done!");
		Thread.sleep(1000);
		driver.quit();
	}
}
