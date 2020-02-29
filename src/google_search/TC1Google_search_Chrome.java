package google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1Google_search_Chrome {

    public static void main(String[] args) {
        // Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver", "/....../chromedriver");
        // Initialise browser
        WebDriver driver = new ChromeDriver();
        // Open Google
        driver.get("https://www.google.com/");
        // Maximise browser
        driver.manage().window().maximize();
      	
      	//Get the WebElement into search bar
        WebElement bar = driver.findElement(By.name("q"));
        bar.sendKeys("Guru99");
        
        //Click WebElement search button
        WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
        search.click();
    }  
}