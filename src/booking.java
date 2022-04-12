import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class booking {
	public static void main(String[] args) throws InterruptedException, IOException {

//Setting system properties of ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\Chrome Driver\\chromedriver.exe");

//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//Deleting all the cookies
		driver.manage().deleteAllCookies();

//Specifiying pageLoadTimeout and Implicit wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

//launching the specified URL
		driver.get("https://www.booking.com/");

//Locating the elements using name locator for the text box
		driver.findElement(By.id("ss")).sendKeys("Chen");
		System.out.println("Chennai get Selected");

//date select  
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		driver.findElement(By.xpath("//*[text()='25']")).click();
		driver.findElement(By.xpath("//*[text()='31']")).click();
		System.out.println("Date was selected");


// click on child

		driver.findElement(By.xpath("//*[@class='xp__guests__count']")).click();

// click on no. of child
		driver.findElement(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]"))
				.click();

// click on child age 
		Select se = new Select(driver.findElement(By.xpath("//*[@name='age']")));
		se.selectByValue("6");
		System.out.println("All child values get selected");

// search
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
// See Available
		driver.findElement(By.xpath(
				"//*[@id=\"search_results_table\"]/div/div/div/div/div[8]/div[3]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[2]/div"))
				.click();

//Tab Switch 
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("tab was successfully switched");

// Screensort
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot, new File("C:\\Users\\DELL\\eclipse-workspace\\Booking\\screenshots.png"));
		

// quit 
		driver.quit();
// close
		driver.close();
	}
}