import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class LoginFormPage {

    SelenideElement emailInput = Selenide.$("#signinEmail");
    SelenideElement passwordInput = Selenide.$("#signinPassword");
    SelenideElement LoginBtn = Selenide.$x("//*[text()='Login']");

    public GaragePage authorise(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        LoginBtn.click();
        return new GaragePage();
    }

}
