package TestNGProgram;
import net.bytebuddy.asm.Advice;
import org.testng.annotations.Test;

public class enabledanddisabled {
    @Test(enabled = true)
    void test1(){
        System.out.println("Test case 1");
    }
    @Test(enabled = true)
    void test2(){
        System.out.println("Test case 2");
    }
    @Test(enabled = true)
    void test3(){
        System.out.println("Test case 3");
    }
    @Test(enabled = true)
    void test4(){
        System.out.println("Test case 4");
    }
    @Test(enabled = false)
    void test5(){
        System.out.println("Test case 5");
    }
    @Test(enabled = false)
    void test6(){
        System.out.println("Test case 6");
    }

}
