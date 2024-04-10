package SeleniumChallenges.Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Challenge6 {

	public static void main(String[] args) {
		
		//𝐂𝐫𝐞𝐚𝐭𝐞 𝐚𝐧 𝐚𝐮𝐭𝐨𝐦𝐚𝐭𝐢𝐨𝐧 𝐒𝐞𝐥𝐞𝐧𝐢𝐮𝐦 𝐭𝐞𝐬𝐭 𝐬𝐜𝐫𝐢𝐩𝐭 𝐭𝐡𝐚𝐭 𝐜𝐥𝐢𝐜𝐤𝐬 𝐭𝐡𝐞 𝐒𝐭𝐚𝐫𝐭 𝐛𝐮𝐭𝐭𝐨𝐧 𝐚𝐧𝐝 𝐭𝐡𝐞𝐧 𝐰𝐚𝐢𝐭𝐬 𝐟𝐨𝐫 𝐭𝐡𝐞 𝐩𝐫𝐨𝐠𝐫𝐞𝐬𝐬 𝐛𝐚𝐫 𝐭𝐨 𝐫𝐞𝐚𝐜𝐡 65%. 
		//𝐓𝐡𝐞𝐧 𝐭𝐡𝐞 𝐭𝐞𝐬𝐭 𝐬𝐡𝐨𝐮𝐥𝐝 𝐜𝐥𝐢𝐜𝐤 𝐒𝐭𝐨𝐩. 𝐓𝐡𝐞 𝐥𝐞𝐬𝐬 𝐭𝐡𝐞 𝐝𝐢𝐟𝐟𝐞𝐫𝐞𝐧𝐜𝐞 𝐛𝐞𝐭𝐰𝐞𝐞𝐧 𝐯𝐚𝐥𝐮𝐞 𝐨𝐟 𝐭𝐡𝐞 𝐬𝐭𝐨𝐩𝐩𝐞𝐝 𝐩𝐫𝐨𝐠𝐫𝐞𝐬𝐬 𝐛𝐚𝐫 𝐚𝐧𝐝 65% 𝐭𝐡𝐞 𝐛𝐞𝐭𝐭𝐞𝐫 𝐲𝐨𝐮𝐫 𝐫𝐞𝐬𝐮𝐥𝐭.
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://uitestingplayground.com/progressbar");
		
		WebElement startButton = driver.findElement(By.xpath("//button[@onclick='Start()']"));
		
		WebElement stopButton = driver.findElement(By.xpath("//button[@onclick='Stop()']"));
		
		WebElement progressBar = driver.findElement(By.xpath("//div[@role='progressbar']"));
		//System.out.println(progressBar.getText());
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		startButton.click();
		
		wait.until(ExpectedConditions.textToBePresentInElement(progressBar, "75%"));
		// TODO Auto-generated method stub
		stopButton.click();

	}

}
