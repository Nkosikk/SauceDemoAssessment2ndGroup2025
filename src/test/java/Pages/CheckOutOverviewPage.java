package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutOverviewPage {

    // Initialize WebDriver
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

    // Validate that items are the same as in the cart

    @FindBy(css = "div.cart_item")
    WebElement cartItemElement;
    @FindBy(css = "div.inventory_item_name")
    WebElement itemNameElement;
    @FindBy(css = "div.inventory_item_price")
    WebElement itemPriceElement;

    public void validateItemsInCart(String expectedItemName, String expectedItemPrice) {
        String actualItemName = itemNameElement.getText();
        String actualItemPrice = itemPriceElement.getText();

        if (!actualItemName.equals(expectedItemName)) {
            throw new AssertionError("Item name does not match. Expected: " + expectedItemName + ", but got: " + actualItemName);
        }

        if (!actualItemPrice.equals(expectedItemPrice)) {
            throw new AssertionError("Item price does not match. Expected: " + expectedItemPrice + ", but got: " + actualItemPrice);
        }
    }


    // Validate total price calculation
    // 1. Locate elements
    @FindBy(css = "div.item-total")
    WebElement itemTotalElement;

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]")
    WebElement itemTotal_xpath;

    @FindBy(css = "div.summary_tax_label")
    WebElement taxElement;

    @FindBy(css = "div.summary_tax_label")
    WebElement taxElement_div;

    @FindBy(css = "span.final-total")
    WebElement finalTotalElement;

    // 2. Validation method
    public void validateTotalPriceCalculation() {
        double itemTotal = Double.parseDouble(itemTotal_xpath.getText().replace("$", ""));
        double tax = Double.parseDouble(taxElement.getText().replace("$", ""));
        double displayedFinalTotal = Double.parseDouble(finalTotalElement.getText().replace("$", ""));
        double expectedFinalTotal = itemTotal + tax;

        // 3. Assertion
        if (Math.abs(displayedFinalTotal - expectedFinalTotal) > 0.01) {
            throw new AssertionError("Final total does not match expected value.");
        }
    }

}
