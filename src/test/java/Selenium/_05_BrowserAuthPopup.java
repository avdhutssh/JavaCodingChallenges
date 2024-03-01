package Selenium;

import java.net.URI;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _05_BrowserAuthPopup {

	@Test
	public void _1_appedingCredsInUrl() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.findElement(By.tagName("p")).getText().trim()
				.contains("Congratulations! You must have the proper credentials.");
		driver.quit();
	}

	@Test
	public void _2_usingHasAuthInterface() {
		WebDriver driver = new ChromeDriver();
		((HasAuthentication) driver).register(UsernameAndPassword.of("admin", "admin"));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.findElement(By.tagName("p")).getText().trim()
				.contains("Congratulations! You must have the proper credentials.");
		driver.quit();
		
	}
	
	@Test
	public void _3_usingPredicateURI() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Predicate<URI> uriPredicate = uri -> uri.getHost().contains("the-internet.herokuapp.com");
		((HasAuthentication) driver).register(uriPredicate, UsernameAndPassword.of("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.findElement(By.tagName("p")).getText().trim()
				.contains("Congratulations! You must have the proper credentials.");
		driver.quit();
		
	}
}
