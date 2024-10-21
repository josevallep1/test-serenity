package co.com.dxhotels.project.stepdefinition.hook;

import co.com.dxhotels.project.hook.Booking;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;
import org.junit.Before;

import static co.com.dxhotels.project.utils.Constants.TITLE_WEBSITE;
import static co.com.dxhotels.project.utils.Constants.TIME_SHORT;
import static co.com.dxhotels.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el {string} se encuentra en la pagina inicial")
    public void openTheTestWebsite(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                Booking.browserURL()
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE_WEBSITE)
                )
        );
    }
}
