package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _13_WaitAndSwitchToWindow {

	@Test
	void wait_SwitchToWindow() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.cssSelector("[name='p']")).sendKeys("mob");
		List<WebElement> autoSuggestions = driver.findElements(By.cssSelector("ul[role='listbox'] li span._yb_uqvxvc"));
		for (WebElement ele : autoSuggestions) {
			if (ele.getText().equalsIgnoreCase("MobyMax")) {
				ele.click();
				break;
			}
		}
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.numberOfWindowsToBe(2));

		driver.getWindowHandles().iterator()
				.forEachRemaining(e -> System.out.println(driver.switchTo().window(e).getTitle()));

		Assert.assertEquals(driver.getTitle(), "MobyMax - Yahoo Search Results");
////    -------Above line is shortcut for below code-----
//		Set<String> windows = driver.getWindowHandles();
//		System.out.println("Total windows are: " + windows.size());
//		Iterator<String> it = windows.iterator();
//		while (it.hasNext()) {
//			String childWindow = it.next();
//			driver.switchTo().window(childWindow);
//			System.out.println(driver.getTitle());
//
//		}
		driver.quit();

	}
}
