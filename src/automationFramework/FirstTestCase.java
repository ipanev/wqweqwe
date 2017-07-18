package automationFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstTestCase {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\chromedriver.exe");	
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://techcommunity.softwareag.com/c/portal/login?p_l_id=10160");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		
		username.clear();
		username.sendKeys(new String[]{"ivaylo.panev@softwareag.com"});
		
		password.clear();
		password.sendKeys(new String []{"ipanev23"});
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(10000);
		
		WebElement prime = driver.findElement(By.id("channel0123456"));
		prime.click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/div[2]/div[2]/span/p[1]/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='CONTENT']/div/div[3]/span/p[2]/strong/a")).click();
			
		
	}
}
	
		
		

			



