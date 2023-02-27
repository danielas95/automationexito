package co.com.choucair.certification.automationexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Carrito {
    public static final Target CARRITO = Target.the("carrito").
            locatedBy("//a[@class=\"exito-header-3-x-minicartLink\"]");

}
