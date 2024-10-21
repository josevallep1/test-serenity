package co.com.dxhotels.project.ui;

import net.serenitybdd.screenplay.targets.Target;


public class InitialPage {

    private InitialPage() {
    }

    public static final Target LOCATION = Target.the("Location")
            .locatedBy("//input[contains(@id,'_location')]");

    public static final Target CHECK_IN = Target.the("CheckIn")
            .locatedBy("//input[contains(@id,'_CheckIn']");

    public static final Target CHECK_OUT = Target.the("CheckOut")
            .locatedBy("//input[contains(@id,'_CheckOut']");

    public static final Target ROOMS = Target.the("Rooms")
            .locatedBy("//input[contains(@id,'_Rooms')]");

    public static final Target ADULTS = Target.the("Adults")
            .locatedBy("//input[contains(@id,'_Adults')]");

    public static final Target CHILDREN = Target.the("Children")
            .locatedBy("//input[contains(@id,'_Children')]");

    public static final Target SEARCH_BUTTON = Target.the("Search Button")
            .locatedBy("//span[contains(text(),'SEARCH')]");
}
