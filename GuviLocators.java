package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GuviLocators {
	
	public static void main(String[] args) {
        // Set the path to your Microsoft EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\Automation directory\\TestAutomation\\drivers\\msedgedriver.exe");

        // Open Edge browser
        WebDriver driver = new EdgeDriver();

        // Navigate to facebook website 
        driver.get("https://www.guvi.in/register");
        
        WebElement elementById = driver.findElement(By.id("sign-in-page"));
        WebElement elementByClassName = driver.findElement(By.className("l_ecrd_webicon_txt l_ecrd_thmtxt"));
        WebElement elementByTagName = driver.findElement(By.tagName("_blank"));
        WebElement elementByXPath = driver.findElement(By.xpath("//*[@id=\"l_ecrd_blk_0_PlainHero\"]/div/div[4]/div/a[2]"));
        WebElement elementBycssselector = driver.findElement(By.cssSelector("#l_ecrd_blk_0_PlainHero > div > div.l_ecrd_imcolheader_bot_icons > div > a.l_ecrd_webicon_txt.l_ecrd_thmtxt"));
        
	}
}
