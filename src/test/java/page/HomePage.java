package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class HomePage extends PageObject{
    @FindBy(css = "div.login-greeting")
    WebElement lbGreeting;

    public HomePage() {
    }

    public String getLbGreeting() {
        return lbGreeting.getText();
    }
}
