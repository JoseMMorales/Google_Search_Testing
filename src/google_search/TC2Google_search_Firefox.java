package google_search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2Google_search_Firefox {

    public static void main(String[] args) {
        // Auto-generated method stub
    	System.setProperty("webdriver.gecko.driver", "/......./geckodriver");

        // Initialise browser
        WebDriver driver = new FirefoxDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Maximise browser
        driver.manage().window().maximize();
      	
      	//Get the WebElement into search bar
        WebElement bar = driver.findElement(By.name("q"));
        
        bar.sendKeys("Guru99");
        
        //Click WebElement search button
        WebElement search = driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]"));
        
        search.click();
        
    }  

}