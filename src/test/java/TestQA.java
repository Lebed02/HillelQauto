import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;

public class TestQA {

    @Test
    public void canLogin() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.headerPage.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "lebed1709@gmail.com",
                "Qwerty123456");

        garagePage.headerPage.userMenu.shouldBe(Condition.visible);
        garagePage.sideMenu.garageIcon.shouldBe(Condition.visible);
        garagePage.alertSuccess.shouldBe(Condition.visible);
    }

    @Test
    public void canAddCar() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.headerPage.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "lebed1709@gmail.com",
                "Qwerty123456");

        AddCarFormPage addCarFromPage = garagePage.openAddCarModal();
        GaragePage addCar = addCarFromPage.addCarPage("3156");

        garagePage.headerPage.userMenu.shouldBe(Condition.visible);
        garagePage.sideMenu.garageIcon.shouldBe(Condition.visible);
        garagePage.alertSuccess.shouldBe(Condition.visible);
    }
    @Test
    public void canLogOutSideMenu() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.headerPage.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "lebed1709@gmail.com",
                "Qwerty123456");

        LogOutFromSideMenu logOutFromSideMenu = garagePage.sideMenu.openLogOut();

        garagePage.sideMenu.logoutIcon.shouldBe(Condition.visible);
        garagePage.alertSuccess.shouldBe(Condition.visible);
    }
    @Test
    public void canLogOutHeader() {
        WebDriverManager.chromedriver().setup();

        HomePage homePage = new HomePage();
        homePage.openPage();

        LoginFormPage loginFormPage = homePage.headerPage.openLoginModal();
        GaragePage garagePage = loginFormPage.authorise(
                "lebed1709@gmail.com",
                "Qwerty123456");

        LogOutFromHeader logOutFromHeader =garagePage.headerPage.openUserNav();
        GaragePage lo = logOutFromHeader.exitFromPage();

        garagePage.alertSuccess.shouldBe(Condition.visible);
    }
}
