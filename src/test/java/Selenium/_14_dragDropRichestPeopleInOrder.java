package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _14_dragDropRichestPeopleInOrder {

	String[] people = { "Jeff Bezos", "Bill Gates", "Warren Buffett", "Bernard Arnault", "Carlos Slim Helu",
			"Amancio Ortega", "Larry Ellison", "Mark Zuckerberg", "Michael Bloomberg" };

	@Test
	public void method_1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaplayground.dev/apps/sortable-list");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		List<WebElement> unsortedOrder = driver.findElements(By.cssSelector(".person-name"));
		Actions act = new Actions(driver);
		for (int i = 0; i < people.length; i++) {
			WebElement person = driver.findElement(By.xpath("//*[normalize-space(text())='" + people[i] + "']"));
			int j = i + 1;
			act.moveToElement(person).build().perform();
			Thread.sleep(500);
			WebElement rank = driver.findElement(By.xpath("(//*[@class='number']/../div)[" + j + "]"));
			act.dragAndDrop(person, rank).build().perform();

			Thread.sleep(1000);

		}
		driver.findElement(By.xpath("//button[@id='check']")).click();
		Thread.sleep(1000);
		List<WebElement> sortedOrder = driver.findElements(By.cssSelector(".person-name"));
		int count = 0;
		for (WebElement e : sortedOrder) {
			if (e.getCssValue("color").equals("rgba(58, 227, 116, 1)")) {
				count++;
			}
		}
		System.out.println("Correctly placed: " + count);
		driver.quit();
	}
}
