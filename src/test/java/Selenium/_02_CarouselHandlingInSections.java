package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _02_CarouselHandlingInSections {

	@Test
	public void method1_Try() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.noon.com/uae-en/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		scrollDownUp(js);
		List<String> sectionNames = Arrays.asList("Limited time deals", "Trending deals in electronics",
				"Clearance deals", "Bestsellers in home appliances");
		for (String section : sectionNames) {
			System.out.println("=============== Items under section: " + section + "===============");
			List<String> sortedItemList = getItemNames(driver, js, section);
			for (String item : sortedItemList) {
				System.out.println(item);
			}
			System.out.println("----------------------------------------");
		}

	}

	public static void scrollDownUp(JavascriptExecutor js) throws InterruptedException {
		long totalHeight = (long) js.executeScript("return document.body.scrollHeight");
		int sectionScrollDistance = (int) totalHeight / 10;
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0, " + sectionScrollDistance + ")");
			Thread.sleep(500);
		}

		Thread.sleep(2000);
		for (int i = 0; i < 10; i++) {
			js.executeScript("window.scrollBy(0, -" + sectionScrollDistance + ")");
			Thread.sleep(500);
		}

		Thread.sleep(2000);
	}

	public static List<String> getItemNames(WebDriver driver, JavascriptExecutor js, String sectionName)
			throws InterruptedException {
		WebElement sectionArrowBtn = driver.findElement(By.xpath("//*[normalize-space(text())='" + sectionName
				+ "']/../../following-sibling::div/div[contains(@class,'swiper-button-next')]"));

		Actions act = new Actions(driver);
		act.moveToElement(sectionArrowBtn).perform();
		List<WebElement> items = driver.findElements(By.xpath("//*[normalize-space(text())='" + sectionName
				+ "']/../../following-sibling::div//div[@data-qa='product-name']"));
		js.executeScript("window.scrollBy(0, 300)");
		List<String> itemsName = new ArrayList<String>();
		for (WebElement ele : items) {
			boolean isVisible = ele.isDisplayed();
			if (isVisible) {
				itemsName.add(ele.getAttribute("title"));
			} else if (sectionArrowBtn.isDisplayed()) {
				sectionArrowBtn.click();
				Thread.sleep(500);
				itemsName.add(ele.getAttribute("title"));
			} else {
				break;
			}

		}
		Collections.sort(itemsName);
		return itemsName;
	}
}
