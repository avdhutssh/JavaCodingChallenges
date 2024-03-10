package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _09_EnterNumKeys {

	@Test
	public void _01_using_keysNum() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaplayground.dev/apps/verify-account/");
		List<WebElement> boxes = driver.findElements(By.cssSelector(".code-container input"));
		for (WebElement ele : boxes) {
			ele.sendKeys(Keys.NUMPAD9);
		}
		Thread.sleep(1000);
		String actualMsg = driver.findElement(By.cssSelector(".info.success")).getText();
		Assert.assertEquals(actualMsg, "Success");
		driver.quit();

	}

	@Test
	public void _02_by_FetchingText() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaplayground.dev/apps/verify-account/");

		String codeText = driver.findElement(By.className("info")).getText();
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(codeText);

		List<WebElement> boxes = driver.findElements(By.cssSelector(".code-container input"));
		for (WebElement ele : boxes) {
			if (matcher.find()) {
				String confirmationNumber = (matcher.group());
				ele.sendKeys(confirmationNumber);
			}
		}
		Thread.sleep(1000);
		String actualMsg = driver.findElement(By.cssSelector(".info.success")).getText();
		Assert.assertEquals(actualMsg, "Success");
		driver.quit();
	}
	
	@Test
	public void _03_using_RobotClass() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaplayground.dev/apps/verify-account/");
		Robot robot = new Robot();
		List<WebElement> boxes = driver.findElements(By.cssSelector(".code-container input"));
		for (WebElement ele : boxes) {
			ele.click();
			robot.keyPress(KeyEvent.VK_9);
			robot.keyRelease(KeyEvent.VK_9);
		}
		Thread.sleep(1000);
		String actualMsg = driver.findElement(By.cssSelector(".info.success")).getText();
		Assert.assertEquals(actualMsg, "Success");
		driver.quit();

	}
}