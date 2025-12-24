package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeoutdemo {
    @Test(timeOut = 20000000)
    void Test1(){
        System.out.println("Test1");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.close();

    }
    @Test
    void Test2(){
        System.out.println("Test2");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.close();


    }
}