package co.com.choucair.certification.automationexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target MENU = Target.the("menu").
            locatedBy("//div[@id=\"category-menu\"]");

    public static final Target CATEGORIA = Target.the("categoria").
            locatedBy("//li[@id=\"undefined-nivel2-Dormitorio\"]");

    public static final Target SUBCATEGORIA = Target.the("subcategoria").
            locatedBy("//p[contains(.,\"Cabeceros\")]");

}
