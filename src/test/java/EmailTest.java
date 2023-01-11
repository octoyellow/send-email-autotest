import org.junit.Test;
import pages.*;

public class EmailTest extends BaseTest {

    private final static String BASE_URL = "https://google.com";
    private final static String email = "testplotnikov@gmail.com";
    private final static String password = "123qw321";

    private final static String recepient = "testplotnikov@gmail.com";
    private final static String subject = "Hello ladies";
    private final static String message = "Brown fox jumps over lazy dog";

    @Test
    public void sendEmail() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickEmailButton();

        SecondWindowPage secondWindowPage = new SecondWindowPage();
        secondWindowPage.pressEnterButton();

        EnterEmailPage enterEmailPage = new EnterEmailPage();
        enterEmailPage.enterEmail(email);

        PasswordPage passwordPage = new PasswordPage();
        passwordPage.enterPassword(password);

        SendEmailPage sendEmailPage = new SendEmailPage();
        sendEmailPage.sendMessage(recepient, subject, message);
    }
}
