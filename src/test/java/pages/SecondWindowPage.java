package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SecondWindowPage {

    private final SelenideElement enterButton = $x("//a[@data-action='sign in']");

    public void pressEnterButton() {
        enterButton.click();
    }
}
