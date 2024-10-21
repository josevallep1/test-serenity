package co.com.dxhotels.project.interactions;

import co.com.dxhotels.project.ui.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Select implements Interaction {

    private final String location;

    public Select(String location) {
        this.location = location;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(InitialPage.LOCATION),
                Click.on(InitialPage.CHECK_IN.of(location)));

    }

    public static Select location(String location) {
        return Tasks.instrumented(Select.class, location);
    }
}
