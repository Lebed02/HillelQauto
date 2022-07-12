import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class SideMenu {


    SelenideElement garageIcon = Selenide.$(".icon-garage");

    SelenideElement logoutIcon = Selenide.$(".icon-logout");

    public LogOutFromSideMenu openLogOut(){
        logoutIcon.click();
        return new LogOutFromSideMenu();
    }
}
