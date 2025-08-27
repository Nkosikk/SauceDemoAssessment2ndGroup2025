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
    @FindBy(id ="first-name")
    WebElement firstName_id;
    @FindBy(id = "last-name")
    WebElement lastName_id;
    @FindBy(id = "postal-code")
    WebElement postalCode_id;
    @FindBy(id = "continue")
    WebElement continueBtn_id;


    public void verifyYourInformationHeadingIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(yourInformationTitle));
        yourInformationTitle.isDisplayed();
    }
    public void enterFirstName(String firstName){
        firstName_id.sendKeys(firstName);

    }
    public void enterLastName(String lastName){
        lastName_id.sendKeys(lastName);

    }
    public void enterPostalCode(String postalCode){
        postalCode_id.sendKeys(String.valueOf(postalCode));

    }
    public void clickContinueBtn(){
        continueBtn_id.click();

    }
}
