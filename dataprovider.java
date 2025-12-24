package TestNGProgram;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

    @Test(dataProvider = "data")
    void searchgoogletest(String country, String movements,int value) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys(country+"" + movements+""+value);
        searchbox.sendKeys(Keys.ENTER);

    }


    @DataProvider(name = "data")
    Object[][] searchdata() {
        Object[][] mydata = new Object[3][3];
        mydata[0][0] = "India";
        mydata[0][1] = "Qutub minar";
        mydata[0][2] =1;

        mydata[1][0] = "Agra";
        mydata[1][1] = "Tajmahal";
        mydata[1][2] =2;

        mydata[2][0] = "Hydrabad";
        mydata[2][1] = "Charminar";
        mydata[2][2] =3;

        return mydata;


    }
}
