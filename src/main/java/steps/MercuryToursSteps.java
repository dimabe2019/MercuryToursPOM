package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MercuryToursPage;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MercuryToursSteps {

    public void clicEnElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void escribirTextoEnELemento(By elemento, String texto) {
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public boolean validar(By elemento) {
        boolean cond = SeleniumWebDriver.driver.findElement(elemento).isDisplayed();
        return cond;
    }

    public String obtenerTextoDeElemnto(By elemento) {
        return SeleniumWebDriver.driver.findElement(elemento).getText();
    }
    public void validarTextoEnPantalla(By elemento, String texto) {
        assertEquals(obtenerTextoDeElemnto(elemento), texto);
    }


    public void procesoRegisto()  {
        clicEnElemento(MercuryToursPage.getRegisterLinkLocator());
        if (validar(MercuryToursPage.getRegisterPageLocator()) == true ) {
            escribirTextoEnELemento(MercuryToursPage.getUsernameLocator(), "Martinez");
            escribirTextoEnELemento(MercuryToursPage.getPasswordLocator(),"pass1");
            escribirTextoEnELemento(MercuryToursPage.getConfirmPasswordLocator(), "pass1");
            clicEnElemento(MercuryToursPage.getRegisterBtnLocator());
        } else {
            System.out.println("Register pages was not found");
        }

        List<WebElement> fonts = SeleniumWebDriver.driver.findElements(MercuryToursPage.getFonts());
        assertEquals("Note: Your user name is Martinez.",fonts.get(5).getText());//Vamos a comparar
        //Cone el fonts.get(5) esta es la forma en que accedemos al 6to elemento de la lista (el indice de primer elemento = 0)

    }

    public void iniciarSesion() {
        if (validar(MercuryToursPage.getUserLocator()) == true) {
            escribirTextoEnELemento(MercuryToursPage.getUserLocator(),"Martinez");
            escribirTextoEnELemento(MercuryToursPage.getPasswordLocator(),"pass1");
            clicEnElemento(MercuryToursPage.getSingBtnLocator());
            validarTextoEnPantalla(MercuryToursPage.getLblSingRegister(), "Login Successfully");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }

        }else {
            System.out.println("username text was not present");
        }
    }



}
