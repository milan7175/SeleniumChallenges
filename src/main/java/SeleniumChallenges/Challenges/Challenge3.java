package SeleniumChallenges.Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Challenge3 {

	public static void main(String[] args) {
		
		//𝐓𝐞𝐬𝐭 𝐒𝐜𝐞𝐧𝐚𝐫𝐢𝐨: 𝐔𝐬𝐢𝐧𝐠 𝐬𝐞𝐥𝐞𝐧𝐢𝐮𝐦 𝐚𝐮𝐭𝐨𝐦𝐚𝐭𝐢𝐨𝐧 - 𝐫𝐞𝐚𝐝 𝐭𝐡𝐞 * 𝐫𝐚𝐭𝐢𝐧𝐠 𝐨𝐟 𝐭𝐡𝐞 𝐛𝐨𝐨𝐤, 𝐞𝐧𝐭𝐞𝐫 𝐢𝐭 𝐢𝐧 𝐭𝐡𝐞 𝐭𝐞𝐱𝐭 𝐛𝐨𝐱 𝐚𝐧𝐝
		//𝐜𝐥𝐢𝐜𝐤 "𝐜𝐡𝐞𝐜𝐤 𝐫𝐚𝐭𝐢𝐧𝐠" 𝐛𝐮𝐭𝐭𝐨𝐧. 𝐲𝐨𝐮 𝐬𝐡𝐨𝐮𝐥𝐝 𝐬𝐞𝐞 "𝐰𝐞𝐥𝐥 𝐝𝐨𝐧𝐞!" 𝐦𝐞𝐬𝐬𝐚𝐠𝐞. 
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://play1.automationcamp.ir/advanced.html");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String text = jse.executeScript("return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')").toString();
		String rating = text.replaceAll("\"", "");
		
		driver.findElement(By.id("txt_rating")).sendKeys(rating);
		driver.findElement(By.id("check_rating")).click();
		
		String actual = driver.findElement(By.id("validate_rating")).getText();
		
		if(actual.equals("Well done")) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}
		
		//String rating = driver.findElement(By.className("star-rating")).get("content").toString();
		//System.out.println(rating);
		driver.close();
	}

}
