	package SeleniumChallenges.Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Challenge1 

{
	//𝐓𝐞𝐬𝐭 𝐒𝐜𝐞𝐧𝐚𝐫𝐢𝐨: Develop an automation script that bypasses the Basic Browser Authentication Popup. 
	//Link: https://the-internet.herokuapp.com/basic_auth
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://the-internet.herokuapp.com/");
		//driver.findElement(By.linkText("Basic Auth")).click();
		
		driver.close();
    }
}
