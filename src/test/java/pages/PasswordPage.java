package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage {

    public void enterPassword(String password) {
        SelenideElement enterPasswordForm = $x("//input[@type='password']");
        enterPasswordForm.sendKeys(password);
        enterPasswordForm.pressEnter();
    }
}
