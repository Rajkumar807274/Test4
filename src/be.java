import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.util.Scanner;


public class be {
	

	public static void main(String[] args) throws InterruptedException, IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium\\Chrome Driver\\chromedriver.exe");  
        
        // Instantiate a ChromeDriver class.     
   WebDriver driver=new ChromeDriver(); 
  
     
      // Launch Website  
   driver.navigate().to("https://be.cognizant.com/");  
     
    //Maximize the browser  
     driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//email
     driver.findElement(By.xpath("//*[@id=\"i0116\"]")).sendKeys("2111495@cognizant.com");
     driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();

//Password
     driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.findElement(By.xpath("//*[@id=\'i0118\']")).sendKeys("Kalasiva23#");

 	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[4]/div[2]/div/div/div/div/input")).click();

     /*WebDriverWait wait = new WebDriverWait(driver,50);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[4]/div[2]/div/div/div/div/input"))).click();*/
     
		

//call option
     int op;
     Scanner sc = new Scanner(System.in);
     System.out.println("Choose Authentication by Call:1 or Message:2");
     op = sc.nextInt();
     switch (op)
     
      {
         case 1:
        	 System.out.println("Call was Selected");

        	 driver.findElement(By.xpath("//*[@id=\"idDiv_SAOTCS_Proofs\"]/div[2]/div/div/div[2]")).click();
        	 break;
         case 2:
        	 System.out.println("Message was Selected");
        	 
      		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        	 driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/div/div[1]/div/div/div[2]")).click();
        	 
     		

        	 /*WebDriverWait t = new WebDriverWait(driver,100);
             t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[6]/div/div/div/div/input"))).click();*/
             
        	 
        	 
        	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("/html/body/div/form[1]/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[2]/div/div[6]/div/div/div/div/input")).click();

             break;
         
      }
		

     
     
//yes/no   
		driver.findElement(By.xpath("/html/body/div/form/div/div/div[2]/div[1]/div/div/div/div/div/div[3]/div/div[2]/div/div[3]/div[2]/div/div/div[2]/input")).click();



     //driver.findElement(By.xpath("//*[@id="user-name"]/text()"]")).getText();
		
     /*WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"userProfileToggleBtn\"]/div/div[2]/span"));
     TxtBoxContent.getText();
     System.out.println("Printing " + TxtBoxContent); */ //*[@id="user-name"]/text()
		
		WebElement a=driver.findElement(By.xpath("/html/body/div/app-root/unily-header/dynamic-content-viewer/upgrade-component-wrapper/div/header/div[2]/div[2]/button/div/div[2]/p/text()"));
	     //getText() to obtain text
	     String e= a.getText();
	     System.out.println("Text content is : " + a);
			
     WebElement p=driver.findElement(By.xpath("//*[@id=\"userProfileToggleBtn\"]/div/div[2]/span"));
     //getText() to obtain text
     String s= p.getText();
     System.out.println("Text content is : " + s);
		
		
		// click apps and tools
		driver.findElement(By.xpath("/html/body/div/app-root/main/div/unily-spa/dynamic-content-viewer/section/upgrade-component-wrapper/div/div/div[1]/div/div[2]/div/reusable-widget/div/div/div[1]/slick/div/div/div[1]/div/app-carousel-item/a")).click();
		
		
		
	     driver.findElement(By.xpath("//*[text()=\"R\"]")).click();
	     
 
		List<WebElement> tools = driver.findElements(By.xpath("//*[@class=\"ng-scope ng-isolate-scope\"]"));
		System.out.println("Printing Starting letter of name 'R': ");
		
		List<String> starting=new ArrayList<>();

	     for(int i=0; i<tools.size(); i++){

	         //loading text of each element in to array all_elements_text
	    	 starting.add(tools.get(i).getText());

	         //to print directly
	         System.out.println(tools.get(i).getText());

	     }
	     
	     
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     //clear 
		
		driver.findElement(By.xpath("//*[@class='search-area__filters ng-isolate-scope']")).click();
		System.out.println("Printing Last letter of name 'R': ");

		
		// last name R
		driver.findElement(By.xpath("//*[text()=\"R\"]")).click();

		List<WebElement> tool = driver.findElements(By.xpath("//*[@class=\"ng-scope ng-isolate-scope\"]"));
		
		//Get the names of the available tools
		List<String> last=new ArrayList<>();

	     for(int i=0; i<tool.size(); i++){

	         //loading text of each element in to array all_elements_text
	    	 last.add(tool.get(i).getText());

	         //to print directly
	         System.out.println(tool.get(i).getText());

	     }
		
		
     driver.close(); 
	// common path for app and tool //*[@class="ng-scope ng-isolate-scope"]
     
	}

}