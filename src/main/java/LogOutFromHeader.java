import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LogOutFromHeader {
    SelenideElement LogOutBtn = Selenide.$x("//*[text()='Logout']");

    public GaragePage exitFromPage() {
        LogOutBtn.click();
        return new GaragePage();
    }
}
