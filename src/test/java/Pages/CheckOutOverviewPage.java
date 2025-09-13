package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverviewPage {

    WebDriver driver;

    public CheckOutOverviewPage(WebDriver driver) {
        this.driver = driver;

    }


    @FindBy(css = "span.title[data-test='title']")
    WebElement checkOutOverView_css;


    public void verifycheckOutOverView() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(checkOutOverView_css));
        checkOutOverView_css.isDisplayed();
    }

    // 1. Locate elements
    @FindBy(css = "span.item-total")
    WebElement itemTotalElement;

    @FindBy(css = "span.tax")
    WebElement taxElement;

    @FindBy(css = "span.final-total")
    WebElement finalTotalElement;

    // 2. Validation method
    public void validateTotalPriceCalculation() {
        double itemTotal = Double.parseDouble(itemTotalElement.getText().replace("$", ""));
        double tax = Double.parseDouble(taxElement.getText().replace("$", ""));
        double displayedFinalTotal = Double.parseDouble(finalTotalElement.getText().replace("$", ""));
        double expectedFinalTotal = itemTotal + tax;

        // 3. Assertion
        if (Math.abs(displayedFinalTotal - expectedFinalTotal) > 0.01) {
            throw new AssertionError("Final total does not match expected value.");
        }
    }

}
