import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class HeaderPage {
    SelenideElement signInBtn = Selenide.$(".header_signin");
    SelenideElement userMenu = Selenide.$("#userNavDropdown");

    public LoginFormPage openLoginModal(){
        signInBtn.click();
        return new LoginFormPage();
    }

    public LogOutFromHeader openUserNav() {
        userMenu.click();
        return new LogOutFromHeader();
    }
}
