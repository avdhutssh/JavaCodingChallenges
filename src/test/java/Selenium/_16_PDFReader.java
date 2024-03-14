package Selenium;

import java.io.File;
import java.io.IOException;
import java.rmi.server.LoaderHandler;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class _16_PDFReader {
	static WebDriver driver;

	@Test
	void readAndValidatePDF() throws IOException, InterruptedException {
		final String downloadDirectory = System.getProperty("user.dir") + "\\downloads";

		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.prompt_for_download", false);
		chromePrefs.put("download.default_directory", downloadDirectory);
		options.setExperimentalOption("prefs", chromePrefs);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		String file = downloadDirectory + "\\samplefile.pdf";
		cleanDownloadDirectory(downloadDirectory);
		driver.findElement(By.xpath("//a[@type='button']")).click();
		Thread.sleep(5000);
		
		getFileSizeAndName(new File(file));
		readPdf(new File(file), "Get Tickets");
		driver.quit();
	}

	void cleanDownloadDirectory(String downloadDirectory) throws IOException {
		File dir = new File(downloadDirectory);
		if (dir.exists() && dir.isDirectory()) {
			FileUtils.cleanDirectory(dir);
			System.out.println("existing file deleted");
		}
	}

	void getFileSizeAndName(File file) {

		long fileSize = FileUtils.sizeOf(file);
		System.out.println("File Size: " + fileSize);
		String fileName = file.getName();
		System.out.println("File Name: " + fileName);
		String filePath = file.getAbsolutePath();
		System.out.println("File Path: " + filePath);
	}

	void readPdf(File file, String str) throws IOException {
		PDDocument doc = Loader.loadPDF(file);
		PDFTextStripper stripper = new PDFTextStripper();
		String text = stripper.getText(doc);
		if(text.contains(str)) {
			System.out.println("Found in pdf");
		}else {
			System.out.println("Not Found in pdf");
		}
	}
}
