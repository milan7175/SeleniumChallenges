package SeleniumChallenges.Challenges;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge7 {

	public static void main(String[] args) {
		
		//𝐂𝐫𝐞𝐚𝐭𝐞 𝐚𝐧 𝐚𝐮𝐭𝐨𝐦𝐚𝐭𝐢𝐨𝐧 𝐒𝐞𝐥𝐞𝐧𝐢𝐮𝐦 𝐭𝐞𝐬𝐭 𝐬𝐜𝐫𝐢𝐩𝐭 𝐭𝐡𝐚𝐭 𝐩𝐞𝐫𝐟𝐨𝐫𝐦𝐬 𝐭𝐡𝐞 "𝐑𝐢𝐠𝐡𝐭 𝐂𝐥𝐢𝐜𝐤" 𝐨𝐟 𝐦𝐨𝐮𝐬𝐞 𝐚𝐧𝐝 𝐲𝐨𝐮 𝐰𝐢𝐥𝐥 𝐬𝐞𝐞 𝐭𝐡𝐞 𝐦𝐞𝐧𝐮 𝐭𝐡𝐞𝐧 𝐧𝐚𝐯𝐢𝐠𝐚𝐭𝐞 𝐭𝐨 
		//"𝐒𝐡𝐚𝐫𝐞 𝐦𝐞𝐧𝐮" 𝐨𝐩𝐭𝐢𝐨𝐧 𝐚𝐧𝐝 𝐜𝐥𝐢𝐜𝐤 𝐨𝐧 𝐚𝐥𝐥 "𝐬𝐨𝐜𝐢𝐚𝐥 𝐦𝐞𝐝𝐢𝐚 𝐥𝐢𝐧𝐤𝐬" 𝐢𝐧 𝐬𝐮𝐛-𝐦𝐞𝐧𝐮. 𝐚𝐧𝐝 𝐚𝐬𝐬𝐞𝐫𝐭𝐬 𝐭𝐡𝐞 𝐯𝐞𝐫𝐢𝐟𝐢𝐜𝐚𝐭𝐢𝐨𝐧 𝐦𝐞𝐬𝐬𝐚𝐠𝐞 𝐟𝐨𝐫 𝐚𝐥𝐥 𝐬𝐨𝐜𝐢𝐚𝐥 𝐥𝐢𝐧𝐤𝐬.
		//e.g: "Menu item Twitter clicked"
	
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://qaplayground.dev/apps/context-menu/");
		
		WebElement element = driver.findElement(By.xpath("//p[@id='msg']"));
		WebElement Share = driver.findElement(By.xpath("//i[@class='uil uil-share']"));
		
		List<WebElement> ShareList = driver.findElements(By.xpath("//ul[@class='share-menu']/li"));
		
		WebElement result = driver.findElement(By.xpath("//div[@class='flex-center']/p"));
		Actions builder = new Actions(driver);
		
		
		
		
		for(WebElement a : ShareList) {
			
			builder.contextClick(element).build().perform();
			builder.moveToElement(Share).build().perform();
			a.click();
			Set set = new HashSet();
			if(!set.contains(result.getText())) {
				set.add(result.getText());
				System.out.println(set);
			}
			
			if(set.contains(result.getText())){
				System.out.println("test pass");
			}else {
				System.out.println("Test fail");
			}
		}
		
		

	}

}
