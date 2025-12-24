package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngwithselenium {
    WebDriver driver;
    Logger logger;
    @Test(priority = 1)
    void launch(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        logger= Logger.getLogger("swaglab");
        PropertyConfigurator.configure("log4J.Properties");



    }
    @Test(priority = 2)
    void openurl(){
        driver.get("https://www.saucedemo.com/v1/");
        logger.info("Open URL");

    }
    @Test(priority = 3)
    void login(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        logger.info("User name");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        logger.info("Password");


        driver.findElement(By.id("login-button")).click();
        logger.info("login button");
    }
    @Test(priority = 4)
    void logout(){
        driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
        logger.info("Open Menu");
        driver.findElement(By.id("logout_sidebar_link")).click();
        logger.info("Logout");

    }
    @Test(priority = 5)
    void closebrowser(){

        logger.info("close browser");
        driver.quit();
    }

}


