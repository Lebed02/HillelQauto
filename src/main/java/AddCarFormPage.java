import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class AddCarFormPage {
    //SelenideElement addCarBtn = Selenide.$(".btn-primary");
    SelenideElement addCarBrandBtn = Selenide.$("#addCarBrand");
    SelenideElement addCarBrand = Selenide.$x("//*[text()='Audi']");
    SelenideElement addCarModelBtn = Selenide.$("#addCarModel");
    SelenideElement addCarModel = Selenide.$x("//*[text()='R8']");
    SelenideElement addCarMileageBtn = Selenide.$("#addCarMileage");
    SelenideElement inputMileage = Selenide.$x("//*[text()='Add']");

    public GaragePage addCarPage(String mileage){
       // addCarBtn.click();
        addCarBrandBtn.click();
        addCarBrand.click();
        addCarModelBtn.click();
        addCarModel.click();
        addCarMileageBtn.sendKeys(mileage);
        inputMileage.click();
        return new GaragePage();
    }
}
