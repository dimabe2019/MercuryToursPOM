package test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.MercuryToursSteps;

public class testMercuryTours {

    @Steps
    MercuryToursSteps mercuryToursSteps = new MercuryToursSteps();

    @Before
    public void setUp() {
        SeleniumWebDriver.ChromeWebDriver("http://demo.guru99.com/test/newtours/");
    }

    @After
    public void tearDown() {
        //SeleniumWebDriver.driver.quit();
    }

    @Test
    public void registerUser() throws InterruptedException {
        Thread.sleep(2000);
      mercuryToursSteps.procesoRegisto();
    }

    @Test
    public void singIn() throws InterruptedException {
        mercuryToursSteps.iniciarSesion();
    }


}
