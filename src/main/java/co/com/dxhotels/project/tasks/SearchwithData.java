package co.com.dxhotels.project.tasks;

import co.com.dxhotels.project.interactions.Add;
import co.com.dxhotels.project.interactions.Choose;
import co.com.dxhotels.project.interactions.Insert;
import co.com.dxhotels.project.interactions.Select;
import co.com.dxhotels.project.models.SearchHotel;
import co.com.dxhotels.project.ui.InitialPage;
import co.com.dxhotels.project.utils.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.text.ParseException;
import java.util.List;

public class SearchwithData implements Task {
    private final List<SearchHotel> data;

    public SearchwithData(List<SearchHotel> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.location(data.get(0).getLocation()),
                Insert.date(data.get(0).getCheckIn(), "checkIn"),
                Insert.date(data.get(0).getCheckOut(), "checkOut"),
                Choose.rooms(data.get(0).getRoomsNumber()),
                Add.people("adults", data.get(0).getAdultsNumber()),
                Add.people("children", data.get(0).getChildrenNumber()),
                Click.on(InitialPage.SEARCH_BUTTON));

        try {
            actor.remember(
                    "days", Time.deDias(data.get(0).getCheckIn(),
                            data.get(0).getCheckOut()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static SearchwithData searchwithData(List<SearchHotel> data) {
        return Tasks.instrumented(SearchwithData.class, data);
    }
}
