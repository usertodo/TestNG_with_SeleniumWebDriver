package TestNGProgram;
import org.testng.annotations.*;

public class testannotationdemo {

    @BeforeSuite
    void A(){
        System.out.println("A is ----->Before suite");

    }
    @AfterSuite
    void B(){
        System.out.println("B is ----->After suite");

    }
    @BeforeTest
    void C(){
        System.out.println("C is ----->Before Test");

    }
    @AfterTest
    void D(){

        System.out.println("D is ----->After Test");
    }
    @BeforeClass
    void E(){
        System.out.println("E is ----->Before class");

    }
    @AfterClass
    void F(){
        System.out.println("F is ----->After class");
    }

    @BeforeMethod
    void G(){
        System.out.println("G is ----->Before Method");

    }
    @AfterMethod
    void H(){
        System.out.println("H is ----->After method");
    }
    @Test
    void Test1(){

        System.out.println("Test1 case passed");
    }

    @Test
    void Test2(){
        System.out.println("Test2 case passed");
    }
    @Test
    void Test3()
    {
        System.out.println("Test3 case passed");

    }
}