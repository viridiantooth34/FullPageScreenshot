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
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		/*
		 * File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileHandler.copy(src, new File("Screenshots/First1.png"));
		 */ 
		
		 //Shutterbug
		  String screenshot_name = "amazon";
		  Shutterbug.shootPage(driver, Capture.FULL, true).withName(screenshot_name).save("Screenshots\\");
		 
		 
		 
		
		
		driver.quit();
	}

}
