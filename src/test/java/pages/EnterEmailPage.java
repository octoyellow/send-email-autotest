package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

public class EnterEmailPage {

    private final SelenideElement emailForm = $x("//input[@type='email']");

    public void enterEmail(String email) {
        emailForm.sendKeys(email);
        emailForm.pressEnter();
    }
}
