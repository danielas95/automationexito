package co.com.choucair.certification.automationexito.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Productos {
    public static final Target AGREGARPRODUCTOUNO = Target.the("agregar producto uno")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][1]");
    public static final Target AGREGARPRODUCTODOS = Target.the("agregar producto dos")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][2]");
    public static final Target AGREGARPRODUCTOTRES = Target.the("agregar producto cautro")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][3]");
    public static final Target AGREGARPRODUCTOCUATRO = Target.the("agregar producto siete")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][4]");
    public static final Target AGREGARPRODUCTOCINCO = Target.the("agregar producto diez")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][5]");
    public static final Target AGREGARPRODUCTOSEIS = Target.the("agregar producto doce")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][6]");
    public static final Target AGREGARPRODUCTOSIETE = Target.the("agregar producto trece")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][7]");
    public static final Target AGREGARPRODUCTOOCHO = Target.the("agregar producto catorce")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][8]");
    public static final Target AGREGARPRODUCTONUEVE = Target.the("agregar producto diecisiete")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][9]");
    public static final Target AGREGARPRODUCTODIEZ = Target.the("agregar producto dieciocho")
            .locatedBy("//div[@class=\"vtex-search-result-3-x-galleryItem vtex-search-result-3-x-galleryItem--normal vtex-search-result-3-x-galleryItem--default pa4\"][10]");


    public static final Target ANADIRCANTIDAD = Target.the("anadir cantidad").
            locatedBy("//div[@class=\"exito-vtex-components-4-x-mainBuyButton\"]");

    public static final Target ADICIONARCANTIDAD = Target.the("adicionar cantidad").
            locatedBy("//button[@class=\"exito-vtex-components-4-x-buttonActions exito-vtex-components-4-x-productSummaryAddToCar  product-summary-add-to-car-plus\"]");



}
