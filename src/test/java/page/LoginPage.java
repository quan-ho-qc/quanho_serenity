package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject{
    @FindBy(id = "modlgn-username")
    WebElement txtUsername;
    @FindBy(id = "modlgn-passwd")
    WebElement txtPassword;
    @FindBy(id = "system-message")
    WebElement errorMessage;
    @FindBy(xpath = "//input[@name='Submit']")
    WebElement btnLogin;

    public LoginPage() {
    }

    public LoginPage setUsername(String username) {
        txtUsername.sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password) {
        txtPassword.sendKeys(password);
        return this;
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public String getBtnLogin() {
        return btnLogin.getAttribute("value");
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
