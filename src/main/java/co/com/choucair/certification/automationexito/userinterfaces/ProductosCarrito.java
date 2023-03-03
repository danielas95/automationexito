package co.com.choucair.certification.automationexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosCarrito {
    public static final Target PRODUCTOUNO = Target.the(" producto uno")
            .locatedBy("//tr[@class=\"product-item\"][1]");
    public static final Target PRODUCTODOS = Target.the(" producto dos")
            .locatedBy("//tr[@class=\"product-item\"][2]");
    public static final Target PRODUCTOTRES = Target.the(" producto tres")
            .locatedBy("//tr[@class=\"product-item\"][3]");
    public static final Target PRODUCTOCUATRO = Target.the(" producto cuatro")
            .locatedBy("//tr[@class=\"product-item\"][4]");
    public static final Target PRODUCTOCINCO = Target.the(" producto cinco")
            .locatedBy("//tr[@class=\"product-item\"][5]");




}
