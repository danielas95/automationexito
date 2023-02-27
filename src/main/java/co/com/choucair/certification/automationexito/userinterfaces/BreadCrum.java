package co.com.choucair.certification.automationexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BreadCrum {
    public static final Target REGRESARCABECEROS = Target.the("regresar a cabeceros").
            locatedBy("//span[@class=\"vtex-breadcrumb-1-x-arrow vtex-breadcrumb-1-x-arrow--breadcrumb-pdp vtex-breadcrumb-1-x-arrow--3 vtex-breadcrumb-1-x-arrow--breadcrumb-pdp--3 ph2 c-muted-2\"]");

}
