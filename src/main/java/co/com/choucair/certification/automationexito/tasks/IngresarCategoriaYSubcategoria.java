package co.com.choucair.certification.automationexito.tasks;

import co.com.choucair.certification.automationexito.userinterfaces.Home;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.HoverOverBy;
import net.serenitybdd.screenplay.actions.HoverOverTarget;

import java.awt.event.MouseEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarCategoriaYSubcategoria implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.MENU),
                Click.on(Home.CATEGORIA),
                Click.on(Home.SUBCATEGORIA)


        );
    }
    public static IngresarCategoriaYSubcategoria makeinformation(){
        return instrumented(IngresarCategoriaYSubcategoria.class);
    }
}
