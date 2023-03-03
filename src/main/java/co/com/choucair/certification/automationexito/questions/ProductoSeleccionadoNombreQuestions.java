package co.com.choucair.certification.automationexito.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito.PRODUCTOUNO;
import static co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito.PRODUCTODOS;
import static co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito.PRODUCTOTRES;
import static co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito.PRODUCTOCUATRO;
import static co.com.choucair.certification.automationexito.userinterfaces.ProductosCarrito.PRODUCTOCINCO;

public class ProductoSeleccionadoNombreQuestions {

    public static Question<String> NombreProductoUno(){
        return actor -> TextContent.of(PRODUCTOUNO).viewedBy(actor).asString().trim();
    }

    public static Question<String> NombreProductoDos(){
        return actor -> TextContent.of(PRODUCTODOS).viewedBy(actor).asString().trim();
    }
    public static Question<String> NombreProductoTres(){
        return actor -> TextContent.of(PRODUCTOTRES).viewedBy(actor).asString().trim();
    }
    public static Question<String> NombreProductoCuatro(){
        return actor -> TextContent.of(PRODUCTOCUATRO).viewedBy(actor).asString().trim();
    }
    public static Question<String> NombreProductoCinco(){
        return actor -> TextContent.of(PRODUCTOCINCO).viewedBy(actor).asString().trim();
    }

}
