package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SendEmailPage {

    private final SelenideElement writeMessageButton = $x("//div[@style='user-select: none']");

    public void sendMessage(String recepient, String subject, String message) {
        writeMessageButton.click();

        SelenideElement recepientForm = $x("//input[@class='agP aFw']");
        SelenideElement subjectForm = $(By.name("subjectbox"));
        SelenideElement messageForm = $x("//div[@role='textbox']");

        recepientForm.sendKeys(recepient);
        subjectForm.sendKeys(subject);
        messageForm.sendKeys(message);


    }
}
