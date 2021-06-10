package serenity;

import net.thucydides.core.annotations.Step;
import page.HomePage;

public class SerenityHomeStep {
    private HomePage homePage;

    @Step
    public String getLbGreeting() {
        return homePage.getLbGreeting();
    }
}
