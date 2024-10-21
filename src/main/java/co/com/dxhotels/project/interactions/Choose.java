package co.com.dxhotels.project.interactions;

import co.com.dxhotels.project.ui.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Choose implements Interaction {

    private final String cantidad;

    public Choose(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InitialPage.ROOMS),
                Click.on(InitialPage.CHECK_IN.of(cantidad)));

    }

    public static Choose rooms(String quantity) {
        return Tasks.instrumented(Choose.class, quantity);
    }
}
