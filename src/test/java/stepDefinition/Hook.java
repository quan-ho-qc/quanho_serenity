package stepDefinition;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;

public class Hook extends PageObject {
    @Managed
    private WebDriver driver;

    @Before
    public void openDriver() {
        open();
        driver.manage().window().maximize();
    }

    @After
    public void closeDriver() {
        driver.close();
    }
}
