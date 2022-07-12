import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class GaragePage extends BasePage{

    //body for Garage page
    SideMenu sideMenu = new SideMenu();

    SelenideElement addCarBtn = Selenide.$(".btn-primary");
    public AddCarFormPage openAddCarModal(){
        addCarBtn.click();
        return new AddCarFormPage();
    }
}
