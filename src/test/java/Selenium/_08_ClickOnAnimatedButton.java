package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _08_ClickOnAnimatedButton {

	@Test
	public void _1_clickOnAnimatedBtnUsingHardWait() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/challenges/growing-clickable.html");
		Thread.sleep(5000);
		WebElement clickMeBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Click Me']"));
		clickMeBtn.click();
		Thread.sleep(500);
		driver.findElement(By.id("growbuttonstatus")).getText().equalsIgnoreCase("Event Triggered");
		driver.quit();
	}

	@Test
	public void _2_clickOnAnimatedBtnUsinnExplicitWait() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.eviltester.com/styled/challenges/growing-clickable.html");
		WebElement clickMeBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Click Me']"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
		wt.until(ExpectedConditions.attributeContains(clickMeBtn, "class", "showgrow grown"));
		clickMeBtn.click();
		Thread.sleep(500);
		driver.findElement(By.id("growbuttonstatus")).getText().equalsIgnoreCase("Event Triggered");
		driver.quit();
	}
}
