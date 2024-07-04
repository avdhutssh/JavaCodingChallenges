package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _17_removeAndAddTags {
	static WebDriver driver;

	@Test
	public void method_1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaplayground.dev/apps/tags-input-box/");
		Thread.sleep(2000);

		System.out.println("The total tags present :" + getTagsCount());

		removeAllTags();
		Thread.sleep(2000);
		verifyTags(10);
		System.out.println("The total tags present after removal :" + getTagsCount());
		System.out.println(getTagsvalue());

		for (int i = 1; i <= 10; i++) {
			AddTags(i + "1" + i + Keys.ENTER);
		}
		Thread.sleep(2000);
		verifyTags(0);
		System.out.println("The total tags present after 10 entries:" + getTagsCount());
		getTagsvalue().stream().forEach(e-> System.out.println(e));

		removeAllTags();
		Thread.sleep(2000);
		System.out.println("-------------");
		AddTags("<script>alert()</script>" + Keys.ENTER);
		System.out.println(getTagsvalue());
		driver.quit();

	}

	private void verifyTags(int count) {
		Assert.assertEquals(Integer.parseInt(driver.findElement(By.cssSelector("p span")).getText()), count);

	}

	private void AddTags(String str) {
		WebElement textBox = driver.findElement(By.cssSelector("[type='text']"));
		textBox.sendKeys(str);

	}

	private void removeAllTags() {
		driver.findElement(By.tagName("button")).click();
	}

	private int getTagsCount() {
		int countTags = driver.findElements(By.cssSelector("ul li")).size();
		return countTags;
	}

	private List<String> getTagsvalue() {
		List<WebElement> tags = driver.findElements(By.cssSelector("ul li"));
		if (tags.size() != 0) {
			List<String> tagValue = new ArrayList<>();

			for (WebElement ele : tags) {
				tagValue.add(ele.getText());
			}
			return tagValue;
		}
		return null;
	}
}
