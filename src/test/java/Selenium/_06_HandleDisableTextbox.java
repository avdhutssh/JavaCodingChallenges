package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _06_HandleDisableTextbox {

	@Test
	public void _01_ByRemovingAttribute() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement disabled_pwd = driver.findElement(By.cssSelector("[id='pass']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].removeAttribute('disabled')", disabled_pwd);
		disabled_pwd.sendKeys("abcd1234");
		Thread.sleep(500);
		driver.quit();
	}
	
	@Test
	public void _02_ByJSBasic() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		WebElement disabled_pwd = driver.findElement(By.cssSelector("[id='pass']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='abcd1234'", disabled_pwd);
		Thread.sleep(500);
		driver.quit();
	}
}
