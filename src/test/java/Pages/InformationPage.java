package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InformationPage {

    WebDriver driver;


    @FindBy(css = "span.title[data-test='title']")
    WebElement yourInformationTitle;


    public void verifyYourInformationHeadingIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourInformationTitle));
        yourInformationTitle.isDisplayed();
    }
}
