package Selenium;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _15_shadowDom {

	@Test
	public void method_1() throws UnsupportedFlavorException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestingplayground.com/shadowdom");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		SearchContext shadowDOMContext = driver.findElement(By.tagName("guid-generator")).getShadowRoot();
		shadowDOMContext.findElement(By.cssSelector(".button-generate")).click();
		WebElement element = shadowDOMContext.findElement(By.cssSelector("#editField"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String inputTextString = (String) js.executeScript("return arguments[0].value",element);
		String guid = (String) js.executeScript("return document.querySelector('guid-generator').shadowRoot.querySelector('#editField').value");
		// shadowDOMContext.findElement(By.cssSelector(".button-copy")).click();

		Actions action = new Actions(driver);
		action.keyDown(element, Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).perform();

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		Object clipData = clipboard.getData(DataFlavor.stringFlavor);
		System.out.println((String) clipData);
		System.out.println(inputTextString);
		System.out.println(guid);
		Assert.assertTrue(((String) clipData).equalsIgnoreCase(inputTextString));
		driver.quit();
	}
}
