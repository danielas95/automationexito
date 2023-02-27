package co.com.choucair.certification.automationexito.tasks;

import co.com.choucair.certification.automationexito.userinterfaces.BreadCrum;
import co.com.choucair.certification.automationexito.userinterfaces.Home;
import co.com.choucair.certification.automationexito.userinterfaces.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarProductos implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<Integer> numerosProducto = new ArrayList<Integer>();
        numerosProducto = generarRandom(10);

        ArrayList<Integer> numerosCantidades = new ArrayList<Integer>();
        numerosCantidades = generarRandom(10);

        espera(5);

        for(int i=0; i<5; i++){
            if(i>0) {
                espera(8);
            }

            switch (numerosProducto.get(i)) {
                case 0:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTOUNO)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 1:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTODOS)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 2:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTOCUATRO)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 3:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTOSIETE)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 4:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTODIEZ)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 5:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTODOCE)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 6:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTOTRECE)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 7:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTOCATORCE)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 8:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTODIECISIETE)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
                case 9:
                    actor.attemptsTo(
                            Click.on(Productos.AGREGARPRODUCTODIECIOCHO)
                    );
                    espera(5);
                    for(int j=0; j<numerosCantidades.get(i); j++) {
                        if(j==0) {
                            actor.attemptsTo(
                                    Click.on(Productos.ANADIRCANTIDAD)
                            );
                        }else {
                            actor.attemptsTo(
                                    Click.on(Productos.ADICIONARCANTIDAD)
                            );
                        }
                    }
                    actor.attemptsTo(
                            Click.on(BreadCrum.REGRESARCABECEROS)
                    );
                    break;
            }
        }
    }

    public ArrayList<Integer> generarRandom(int limiteSuperior){
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numeros.size() < 5) {
            int random = randomGenerator .nextInt(limiteSuperior);
            if (!numeros.contains(random)) {
                numeros.add(random);
            }
        }
        return numeros;
    }

    public void espera(int seg){
        try {
            Thread.sleep(seg*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static IngresarProductos createinformation(){
        return instrumented(IngresarProductos.class);
    }
}
