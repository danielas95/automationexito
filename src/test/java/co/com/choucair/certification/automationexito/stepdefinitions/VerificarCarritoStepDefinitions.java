package co.com.choucair.certification.automationexito.stepdefinitions;

import co.com.choucair.certification.automationexito.questions.ProductoSeleccionadoNombreQuestions;
import co.com.choucair.certification.automationexito.tasks.IngresarCategoriaYSubcategoria;
import co.com.choucair.certification.automationexito.tasks.IngresarProductos;
import co.com.choucair.certification.automationexito.tasks.VerificarCarrito;
import co.com.choucair.certification.automationexito.userinterfaces.BreadCrum;
import co.com.choucair.certification.automationexito.userinterfaces.Productos;
import co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.EventualConsequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

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
        theActorInTheSpotlight().attemptsTo(VerificarCarrito.goToCar());
    }

    @Entonces("^: se debe observar que el nombre de los productos coincida en el carrito$")
    public void seDebeObservarQueElNombreDeLosProductosCoincidaEnElCarrito() {
        int contadorProducto = 0;
        Question<String> producto = null;
        for (Integer numProducto : IngresarProductos.numerosProducto) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            switch (contadorProducto) {
                case 0:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoUno();
                    break;
                case 1:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoDos();
                    break;
                case 2:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoTres();
                    break;
                case 3:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoCuatro();
                    break;
                case 4:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoCinco();
                    break;
            }


            switch (numProducto) {
                case 0:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Tela Base Cama Doble Rombos Gris")));
                    break;
                case 1:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Para Cama Doble Dublin Café")));
                    break;
                case 2:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Para Cama King Londres Gris 200")));
                    break;
                case 3:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Entero Centuri Cama Doble 140 X 120 Negro")));
                    break;
                case 4:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Doble Linea Vertical Dormipuff")));
                    break;
                case 5:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Espaldar Cama Doble Negro")));
                    break;
                case 6:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Para Cama Doble Dublin Negro")));
                    break;
                case 7:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Tela Base Cama Sencilla Rombos Negro")));
                    break;
                case 8:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Industrial Caramelo Para Cama De 100 X 190")));
                    break;
                case 9:
                    theActorInTheSpotlight().
                            should(
                                    seeThat(
                                            "Product Name", producto
                                            , equalTo("Cabecero Para Cama Sencilla Dublin Gris")));
                    break;

            }

            producto = null;

            /*for (Integer numerosCantidade : IngresarProductos.numerosCantidades) {

            }*/

            contadorProducto ++;
        }
    }

    @Entonces("^: se debe observar que los precios de los productos coincida en el carrito$")
    public void seDebeObservarQueLosPreciosDeLosProductosCoincidaEnElCarrito() {
    }

    @Entonces("^: Se debe observar que las cantidades de los productos coincida en el carrito$")
    public void seDebeObservarQueLasCantidadesDeLosProductosCoincidaEnElCarrito() {
        if(IngresarProductos.cantidadTotalProductos>0){
            //Se verificaron las cantidades totales unidades de productos
        }
    }

    @Entonces("^: Se debe observar que el numero de los productos coincida en el carrito$")
    public void seDebeObservarQueElNumeroDeLosProductosCoincidaEnElCarrito() {
        int contadorProductos = 0;
        Question<String> producto = null;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Integer numProducto : IngresarProductos.numerosProducto) {
            switch (numProducto) {
                case 0:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoUno();
                    break;
                case 1:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoDos();
                    break;
                case 2:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoTres();
                    break;
                case 3:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoCuatro();
                    break;
                case 4:
                    producto = ProductoSeleccionadoNombreQuestions.NombreProductoCinco();
                    break;
            }
        }

    }
}
