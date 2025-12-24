package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsonmethods {

    @Test(dependsOnMethods = "setup")
    void login(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        driver.close();

    }
    @Test
    void setup(){
        WebDriverManager.chromedriver().setup();

    }

}