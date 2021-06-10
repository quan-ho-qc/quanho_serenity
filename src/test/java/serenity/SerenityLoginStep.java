package serenity;

import net.thucydides.core.annotations.Step;
import page.LoginPage;

public class SerenityLoginStep {
    private LoginPage loginPage;

    @Step
    public void fillAccount(String username, String password) {
        loginPage.setUsername(username).setPassword(password);
    }

    @Step
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Step
    public boolean isAtLoginPage() {
        return loginPage.getBtnLogin().equals("Log in");
    }

    @Step
    public String getErrorMessage() {
        return loginPage.getErrorMessage();
    }

}
