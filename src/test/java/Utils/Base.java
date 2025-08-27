package Utils;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    public final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.saucedemo.com/");

    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public YourCartPage yourCartPage = PageFactory.initElements(driver, YourCartPage.class);
    public InformationPage informationPage = PageFactory.initElements(driver, InformationPage.class);
    public CheckOutOverviewPage checkOutOverviewPage = PageFactory.initElements(driver, CheckOutOverviewPage.class);


}
