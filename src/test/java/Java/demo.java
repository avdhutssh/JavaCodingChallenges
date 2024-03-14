package Java;

import java.awt.AWTException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void challengeday8() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://qaplayground.dev/apps/sortable-list/";
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement check_button = driver.findElement(By.xpath("//button[@id='check']"));

		// Required list
		Map<String, Integer> required_list = new LinkedHashMap<String, Integer>();
		required_list.put("Jeff Bezos", 1);
		required_list.put("Bill Gates", 2);
		required_list.put("Warren Buffett", 3);
		required_list.put("Bernard Arnault", 4);
		required_list.put("Carlos Slim Helu", 5);
		required_list.put("Amancio Ortega", 6);
		required_list.put("Larry Ellison", 7);
		required_list.put("Mark Zuckerberg", 8);
		required_list.put("Michael Bloomberg", 9);
		required_list.put("Larry Page", 10);
		List<WebElement> person_names = driver.findElements(By.xpath("//p[@class='person-name']"));
		List<WebElement> indexes = driver.findElements(By.xpath("//span[@class='number']"));
		Actions action = new Actions(driver);

		int size = person_names.size();
		int required_position;

		for (Map.Entry<String, Integer> entry : required_list.entrySet()) {
			required_position = entry.getValue();
			System.out.println(required_position);
			System.out.println(size);
			person_names = driver.findElements(By.xpath("//p[@class='person-name']")); // Fetching new list after every
																						// sort
			for (int j = required_position; j <= size; j++) {
				if (entry.getKey().equalsIgnoreCase(person_names.get(j - 1).getText())) {

					Thread.sleep(2000);
					WebElement element1 = person_names.get(j - 1);
					WebElement element2 = indexes.get(required_position - 1);
					action.dragAndDrop(element1, element2).build().perform();
					break;
				}

			}

		}

		check_button.click();

	}

}