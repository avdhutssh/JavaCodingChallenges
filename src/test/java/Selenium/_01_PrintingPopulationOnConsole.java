package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _01_PrintingPopulationOnConsole {

	@Test
	private static void method1_Try() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/world-population");
		WebElement currentPopulation = driver.findElement(By.xpath("//*[@rel='current_population']"));
		WebElement todayBirths = driver.findElement(By.xpath("//*[@rel='births_today']"));
		WebElement todayDeaths = driver.findElement(By.xpath("//*[@rel='dth1s_today']"));
		WebElement todayGrowth = driver.findElement(By.xpath("//*[@rel='absolute_growth']"));
		WebElement yearBirths = driver.findElement(By.xpath("//*[@rel='births_this_year']"));
		WebElement yearDeaths = driver.findElement(By.xpath("//*[@rel='dth1s_this_year']"));
		WebElement yearGrowth = driver.findElement(By.xpath("//*[@rel='absolute_growth_year']"));
		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));
		wt.until(ExpectedConditions.visibilityOf(currentPopulation));
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 10000) {
			System.out.println("Current Population is: " + currentPopulation.getText());
			System.out.println("todayBirths is: " + todayBirths.getText());
			System.out.println("todayDeaths is: " + todayDeaths.getText());
			System.out.println("todayGrowth is: " + todayGrowth.getText());
			System.out.println("yearBirths is: " + yearBirths.getText());
			System.out.println("yearDeaths is: " + yearDeaths.getText());
			System.out.println("yearGrowth is: " + yearGrowth.getText());
			System.out.println("----------------------------------------");
			Thread.sleep(1000);
		}

	}

	@Test
	private static void method2_Optimize() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/world-population");
		List<String> relAttributeValues = Arrays.asList("current_population", "births_today", "dth1s_today",
				"absolute_growth", "births_this_year", "dth1s_this_year", "absolute_growth_year");
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 10000) {
			for (String value : relAttributeValues) {
				WebElement element = driver.findElement(By.xpath("//*[@rel='" + value + "']"));
				System.out.println(value + " is: " + element.getText());

			}
			System.out.println("----------------------------------------");
		}

	}

	@Test
	private static void method3_XpathShortcut() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.worldometers.info/world-population");

		WebElement todayBirths = driver.findElement(By.xpath("(//*[@class='row']//span[@class='rts-counter'])[7]"));
		long startTime = System.currentTimeMillis();
		while (System.currentTimeMillis() - startTime < 10000) {
			for (int i = 1; i <= 7; i++) {
				WebElement element = driver.findElement(By.xpath("(//*[@class='row']//span[@class='rts-counter'])["+i+"]"));
				System.out.println(element.getAttribute("rel")+ " is : "+element.getText());

			}
			System.out.println("----------------------------------------");
		}

	}
}
