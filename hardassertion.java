package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassertion {

    WebDriver driver;

    @Test
    void verifytitle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();

        String ExpectedTiltle = "nopCommerce demo store. Login";
        String ActualTitle = driver.getTitle();

        //Hard Assert
       // Assert.assertEquals(ExpectedTiltle, ActualTitle);
      //  Assert.assertTrue(true);
       // Assert.assertTrue(false);
       // Assert.assertFalse(true);
        Assert.assertFalse(false);
        System.out.println("Verify title Successfully");
        driver.close();

    }

//    @Test
//    void verifylogin() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
//        driver.manage().window().maximize();
//
//        WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Log in']"));
//
//        Assert.assertTrue(loginbtn.isDisplayed());
//
//        System.out.println("verify login button passed");
//        driver.close();

    }
//}
