package co.com.dxhotels.project.interactions;

import co.com.dxhotels.project.ui.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Add implements Interaction {

    private final String type;
    private final String quantity;

    public Add(String type, String quantity) {
        this.quantity = quantity;
        this.type = type;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InitialPage.ADULTS.of(type)),
                Click.on(InitialPage.CHECK_IN.of(quantity)));
    }

    public static Add people(String type, String quantity) {
        return Tasks.instrumented(Add.class, type, quantity);
    }
}
