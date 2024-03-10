package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _10_StopProgessBar {
	@Test
	public void _01_stopUsingAttributeAndWhileLoop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestingplayground.com/progressbar");
		WebElement startBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Start']"));
		startBtn.click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement progressBar = driver.findElement(By.cssSelector(".progress-bar.bg-info"));
		WebElement stopBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Stop']"));
		int i = 0;
		while (i < 3000) {
			if (progressBar.getAttribute("aria-valuenow").equalsIgnoreCase("65")) {
				stopBtn.click();
				break;
			}
			Thread.sleep(90);
		}

	}

	@Test
	public void _02_stopUsingAttributeAndExplicitWait() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestingplayground.com/progressbar");
		WebElement startBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Start']"));
		startBtn.click();
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement stopBtn = driver.findElement(By.xpath("//*[normalize-space(text())='Stop']"));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@aria-valuenow='65']")));
		stopBtn.click();

	}
}
