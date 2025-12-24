package TestNGProgram;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersdemo {

    @Test
    @Parameters({"x","y"})
    void add(int a,int b){
        System.out.println("addition of a and b="+(a+b));
    }



    @Test
    @Parameters({"r","s"})
    void substraction(int a,int b){
        System.out.println("Substraction of a and b="+(a-b));
    }
}