import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class standaloneTest {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.GITHUB.com");
		driver.manage().window().maximize();
		
		
		/*
		 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileHandler.copy(src, new File("Screenshots/First1.png"));
		 */ 
		
		//Shutterbug
		
		  Shutterbug.shootPage(driver, Capture.FULL, true).withName("first").save(
		  "Screenshots\\");
		  
		 
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
