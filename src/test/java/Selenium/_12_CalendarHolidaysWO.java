package Selenium;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class _12_CalendarHolidaysWO {
	static WebDriver driver;
	String month = "February 2025";

	@Test
	public void printHolidays_WO() throws InterruptedException {
		if (isCurrentMonthOrFutureMonth()) {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("disable-notifications");
			driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.get("https://www.redbus.in/");
			driver.findElement(By.cssSelector(".dateText")).click();
			navigateToMonth();
			getHolidays_WO();
			driver.quit();
		} else {
			System.out.println("Cannot check for previous month");
		}
	}	    
	private boolean isCurrentMonthOrFutureMonth() {
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		int currentMonthValue = currentDate.getMonthValue();

		int providedYear = Integer.parseInt(month.split(" ")[1]);
		String providedMonth = month.split(" ")[0].toUpperCase();
		int providedMonthValue = Month.valueOf(providedMonth).getValue();	
		if (providedYear > currentYear) {
			return true;
		} else if (providedYear == currentYear) {
			if (providedMonthValue >= currentMonthValue) {
				return true;
			}
		}
		return false;
	}

	private void getHolidays_WO() {
		List<WebElement> holidays = driver.findElements(By.cssSelector(".holiday_count"));
		if (!holidays.isEmpty())
			System.out.println(holidays.get(0).getText());
		else
			System.out.println("No holidays available for given month");

		List<String> WO = new ArrayList<String>();
		List<WebElement> currentWeekend = driver.findElements(By.cssSelector(".fgdqFw"));
		if (!currentWeekend.isEmpty()) {
			WO.add(currentWeekend.get(0).getText());
		}
		List<WebElement> weekOff = driver.findElements(By.cssSelector(".bwoYtA"));
		for (WebElement ele : weekOff) {
			WO.add(ele.getText());
		}

		System.out.println("Week off days for month: " + WO);

	}

	private void navigateToMonth() throws InterruptedException {
	    String[] parts = month.split(" ");
	    String shortMonth = parts[0].substring(0, 3);
	    month =  shortMonth + " " + parts[1];
		while (!driver.findElement(By.cssSelector("[style*='flex-grow: 2']")).getText().contains(month)) {
			driver.findElement(By.cssSelector("[style*='flex-grow: 2'] + div[class*='Day']")).click();
			Thread.sleep(200);
		}
		System.out.println("onto the month: "
				+ driver.findElement(By.cssSelector("[style*='flex-grow: 2']")).getText().split(" ")[0]);

	}

}
