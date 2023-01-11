package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {

    private final SelenideElement mailButton = $$x("//a[@class='gb_m']").first();

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void clickEmailButton() {
        mailButton.click();
    }
}
