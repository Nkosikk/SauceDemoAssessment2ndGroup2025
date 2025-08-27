package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverviewPage {

    WebDriver driver;

    public CheckOutOverviewPage(WebDriver driver){
        this.driver = driver;

    }


    @FindBy(css = "span.title[data-test='title']")
    WebElement checkOutOverView_css;


    public void verifycheckOutOverView() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkOutOverView_css));
        checkOutOverView_css.isDisplayed();
    }


}
