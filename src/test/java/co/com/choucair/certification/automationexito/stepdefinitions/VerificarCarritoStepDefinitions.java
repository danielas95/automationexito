package co.com.choucair.certification.automationexito.stepdefinitions;

import co.com.choucair.certification.automationexito.tasks.IngresarCategoriaYSubcategoria;
import co.com.choucair.certification.automationexito.tasks.IngresarProductos;
import co.com.choucair.certification.automationexito.tasks.VerificarCarrito;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerificarCarritoStepDefinitions {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setThestage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniela Sanchez Pastrana");
    }

    @Dado("^: un cliente ingresa a la pagina del exito$")
    public void unClienteIngresaALaPaginaDelExito() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.exito.com/"));

    }


    @Cuando("^: el cliente agrega productos al carrito$")
    public void elClienteAgregaProductosAlCarrito() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(IngresarCategoriaYSubcategoria.makeinformation());
        theActorInTheSpotlight().attemptsTo(IngresarProductos.createinformation());
        theActorInTheSpotlight().attemptsTo(VerificarCarrito.createcar());
    }

    @Entonces("^: se debe observar que el nombre de los productos coincida en el carrito$")
    public void seDebeObservarQueElNombreDeLosProductosCoincidaEnElCarrito() {

    }

    @Entonces("^: se debe observar que los precios de los productos coincida en el carrito$")
    public void seDebeObservarQueLosPreciosDeLosProductosCoincidaEnElCarrito() {

    }

    @Entonces("^: Se debe observar que las cantidades de los productos coincida en el carrito$")
    public void seDebeObservarQueLasCantidadesDeLosProductosCoincidaEnElCarrito() {

    }

    @Entonces("^: Se debe observar que el numero de los productos coincida en el carrito$")
    public void seDebeObservarQueElNumeroDeLosProductosCoincidaEnElCarrito() {

    }
}
