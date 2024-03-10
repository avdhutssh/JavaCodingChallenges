package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _11_ContextClick {
	@Test
	void _1_rightClickAndVerify() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://qaplayground.dev/apps/context-menu/");
		Actions act = new Actions(driver);
		String[] platforms = { "Twitter", "Instagram", "Dribble", "Telegram" };
		for (String platform : platforms) {
			driver.get("https://qaplayground.dev/apps/context-menu/");
			WebElement msgField = driver.findElement(By.cssSelector("#msg"));
			WebElement shareField = driver.findElement(By.xpath("//*[normalize-space(text())='Share']"));
			WebElement socialMedia = driver.findElement(By.xpath("//*[normalize-space(text())='" + platform + "']"));
			act.moveToElement(msgField).contextClick().moveToElement(shareField).perform();
			Thread.sleep(300);
			socialMedia.click();
			Assert.assertEquals(msgField.getText(), "Menu item "+platform+" clicked");
		}
		driver.quit();

	}
}
