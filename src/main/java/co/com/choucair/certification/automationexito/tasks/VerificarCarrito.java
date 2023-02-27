package co.com.choucair.certification.automationexito.tasks;

import co.com.choucair.certification.automationexito.userinterfaces.Carrito;
import co.com.choucair.certification.automationexito.userinterfaces.Productos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(Carrito.CARRITO)
        );

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static VerificarCarrito createcar(){
        return instrumented(VerificarCarrito.class);
    }
}
