package TestNGProgram;
import org.testng.annotations.Test;

public class groupsdemo {

    @Test(groups = "sanity testing")
    void gitanjali(){
        System.out.println("I am Gitanjali");

    }
    @Test(groups = "sanity testing")
    void girija(){
        System.out.println("I am Girija");
    }
    @Test(groups = "smoke testing")
    void sandeep(){
        System.out.println("I am sandeep");
    }
    @Test(groups = "Regression testing")
    void ashutosh(){
        System.out.println("I am Ashutosh");
    }
    @Test(groups = "Regression testing")
    void mamata(){
        System.out.println("I am Mamata");
    }
    @Test(groups = "sanity testing")
    void sai(){
        System.out.println("I am sai");
    }

}

