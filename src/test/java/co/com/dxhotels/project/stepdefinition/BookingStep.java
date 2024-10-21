package co.com.dxhotels.project.stepdefinition;

import co.com.dxhotels.project.tasks.SearchwithData;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookingStep {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("el realiza una busqueda con los siguentes datos")
    public void searchWithData(List<co.com.dxhotels.project.models.SearchHotel> data) {
        theActorInTheSpotlight().attemptsTo(SearchwithData.searchwithData(data));
        System.out.println(theActorInTheSpotlight().recall("days").toString());
    }

    @And("selecciona el hotel que presenta el prcio mas bajo")
    public void seleccionaElHotelQuePresentaElPrcioMasBajo() {

    }

    @Then("el podra ver el resumen de la reservacion")
    public void elPodraVerElResumenDeLaReservacion() {
    }
}