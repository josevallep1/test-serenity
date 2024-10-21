package co.com.dxhotels.project.interactions;

import co.com.dxhotels.project.ui.InitialPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Insert implements Interaction {

    private final String date;
    private final String inOut;

    public Insert(String date, String inOut) {
        this.date = date;
        this.inOut = inOut;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(InitialPage.CHECK_OUT.of(inOut)),
                Enter.theValue(date).into(InitialPage.CHECK_OUT.of(inOut)));

    }

    public static Insert date(String date, String inOut) {
        return Tasks.instrumented(Insert.class, date, inOut);
    }
}
