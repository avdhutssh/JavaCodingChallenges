package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _04_CheckingBrokenLinksInParallel {

	@Test
	public void checkLinks() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> anchorLinks = driver.findElements(By.tagName("a"));

		System.out.println("Number of links are " + anchorLinks.size());

		List<String> urls = new ArrayList<String>();
		for (WebElement element : anchorLinks) {
			String url = element.getAttribute("href");
			urls.add(url);
		}

		long startTime = System.currentTimeMillis();
//		urls.stream().forEach(e -> validateUrls(e));Time taken: 91
		urls.parallelStream().forEach(e -> validateUrls(e)); // Time taken: 17
		long endTime = System.currentTimeMillis();
		System.out.println("Time taken: " + (endTime - startTime));
		driver.quit();

	}

	private void validateUrls(String url) {

		try {
			URL link = new URL(url);
			HttpURLConnection httpconnection = (HttpURLConnection) link.openConnection();
			httpconnection.setConnectTimeout(5000);
			httpconnection.connect();
			if (httpconnection.getResponseCode() >= 400)
				System.out.println(
						link + " ---> is a broken link and giving msg as : " + httpconnection.getResponseMessage());
			else
				System.out.println(link + " ---> " + httpconnection.getResponseMessage() + " is OK");

		} catch (Exception e) {

		}
	}
}
