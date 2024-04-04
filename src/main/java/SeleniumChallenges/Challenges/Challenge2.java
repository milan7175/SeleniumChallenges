package SeleniumChallenges.Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge2 {

	public static void main(String[] args) {
		
		//𝐓𝐞𝐬𝐭 𝐒𝐜𝐞𝐧𝐚𝐫𝐢𝐨: Develop an automation script that will input a value in a disabled field 
		//(You cannot able to input value in field with sendkeys() directly if field is disabled)
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		//driver.findElement(By.id("pass")).sendKeys("password");	
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('pass').setAttribute('value', 'password')");
		jse.executeScript("document.getElementById('passnew').setAttribute('value', 'password')");

		
		driver.close();
		

	}

}
