package SeleniumChallenges.Challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challenge5 {

	public static void main(String[] args) {
		
		//𝐔𝐬𝐢𝐧𝐠 𝐒𝐞𝐥𝐞𝐧𝐢𝐮𝐦 𝐚𝐮𝐭𝐨𝐦𝐚𝐭𝐢𝐨𝐧 𝐞𝐧𝐭𝐞𝐫 𝐭𝐡𝐞 𝐯𝐚𝐥𝐢𝐝 𝐜𝐨𝐝𝐞 𝐛𝐲 𝐤𝐞𝐲𝐛𝐨𝐚𝐫𝐝 𝐤𝐞𝐲𝐬 𝐛𝐲 𝐩𝐫𝐞𝐬𝐬𝐢𝐧𝐠 𝐭𝐡𝐞 𝐨𝐧𝐥𝐲 𝐤𝐞𝐲 𝐛𝐮𝐭𝐭𝐨𝐧 𝐚𝐧𝐝 𝐚𝐬𝐬𝐞𝐫𝐭𝐢𝐧𝐠 "𝐬𝐮𝐜𝐜𝐞𝐬𝐬" 𝐦𝐞𝐬𝐬𝐚𝐠𝐞.
		//The confirmation code is - "999999".
		//You cannot use sendkeys("9") directly.
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://qaplayground.dev/apps/verify-account/");
		
		List<WebElement> codeContainer = driver.findElements(By.className("code"));
		System.out.println(codeContainer.size());
		
		for(WebElement code : codeContainer) {
		code.sendKeys(Keys.NUMPAD9);
		// TODO Auto-generated method stub
		}
		
		
		//WebDriverWait wait = new WebDriverWait(driver,10 );
		
		
		
		String message = driver.findElement(By.xpath("//small[@class='info success']")).getText();
		//wait.until(ExpectedConditions.attributeContains(message, "class","Success"));
		System.out.println(message);
		if(message.equals("Success")) {
			System.out.println("Test pass");
		} else {
			System.out.println("Test fail");
		}
		
		driver.quit();
	}

}
