package Selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _03_HighestPriceProductAddCart {

	@Test
	public void method1_Try() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		List<WebElement> items = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
		float highestPrice = 0;
		for (WebElement item : items) {
			String price = item.getText().replace("$", "");
			Float priceFloat = Float.parseFloat(price);
			if (priceFloat > highestPrice) {
				highestPrice = priceFloat;
			}
		}
		String highest = String.valueOf(highestPrice);
		List<WebElement> products = driver.findElements(By.xpath("//*[contains(text(),'$')]"));
		for (int i = 1; i <= products.size(); i++) {
			String value = driver.findElement(By.xpath("(//*[contains(text(),'$')])[" + i + "]")).getText().replace("$",
					"");
			if (value.equals(highest)) {
				driver.findElement(By.xpath("(//*[contains(text(),'$')])[" + i + "]/../button")).click();
			}
		}

	}

	@Test
	public void method2_UsingStreams() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> items = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
		double maxPrice = items.stream().mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", ""))).max()
				.getAsDouble();
		System.out.println("method3: " + maxPrice);
		driver.findElement(By.xpath("//*[normalize-space()='$" + maxPrice + "']/../button")).click();

		System.out.println("--------------");
		double minPrice = items.stream().mapToDouble(e -> Double.parseDouble(e.getText().trim().replace("$", ""))).min()
				.getAsDouble();
		System.out.println(minPrice);
		driver.findElement(By.xpath("//*[normalize-space()='$" + minPrice + "']/../button")).click();
	}

	@Test
	public void method3_UsingForLoopLogic() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> items = driver.findElements(By.xpath("//*[@class='inventory_item_price']"));
		double maxPrice = 0;
		for (WebElement e : items) {
			double price = Double.parseDouble(e.getText().trim().replace("$", ""));
			if (maxPrice < price) {
				maxPrice = price;
			}
		}
		System.out.println("method3: " + maxPrice);
		driver.findElement(By.xpath("//*[normalize-space()='$" + maxPrice + "']/../button")).click();

	}

	@Test
	public void method4_UsingJS_ScriptInjection() {
		String js_Script = "var max = 0;\r\n"
				+ "document.getElementsByClassName('inventory_item_price').forEach(e=>{\r\n"
				+ "    newVal = parseFloat(e.innerText.split('$')[1]);\r\n" + "    if (max < newVal) {\r\n"
				+ "        max = newVal;\r\n" + "    }\r\n" + "}\r\n" + ");\r\n" + "console.log(max);\r\n"
				+ "var xpathVal = \"//div[normalize-space()='$\" + max + \"']/following-sibling::button[text()='Add to cart']\";\r\n"
				+ "var ele = document.evaluate(xpathVal, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;\r\n"
				+ "ele.click();\r\n" + "";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript(js_Script);
	}
}
