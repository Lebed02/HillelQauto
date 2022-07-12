import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class BasePage {
    public void openPage(){
        Selenide.open(
                "https://qauto.forstudy.space/",
                "",
                "guest",
                "welcome2qauto");
    }


    //header
    HeaderPage headerPage = new HeaderPage();

    SideMenu sideMenu = new SideMenu();

    //footer
    SelenideElement alertSuccess = Selenide.$(".alert-success");
}
