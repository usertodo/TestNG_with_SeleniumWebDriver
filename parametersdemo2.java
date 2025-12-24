package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersdemo2 {
    @Test
    @Parameters("Keyword")
    void search(String sdata){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");

            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys(sdata);
        }
    }

