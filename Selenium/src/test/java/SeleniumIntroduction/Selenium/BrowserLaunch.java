package SeleniumIntroduction.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Options op=driver.manage();
		Window w=op.window();
		w.maximize();
		WebElement createAccount=driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(3000);
		WebElement drop=driver.findElement(By.id("day"));
		Select s=new Select(drop);
		s.selectByValue("15");
		
	}

}
