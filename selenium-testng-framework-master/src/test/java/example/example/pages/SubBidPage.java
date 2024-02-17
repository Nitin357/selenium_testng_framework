package example.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SubBidPage extends BasePage{

    @FindBy(xpath = "//span[@class='clickable no-child-pointers'][3]")
    private WebElement editDetails;
    @FindBy(id = "bidScenarioId")
    private WebElement quoteType;//Default Scenario
    @FindBy(id = "edit-expectedLaunchDate")
    private WebElement estimatedLaunchDate;
    @FindBy(xpath = "//span[@class='flatpickr-day today']")
    private WebElement todayDate;
    @FindBy(id = "edit-requestedDeliveryDate")
    private WebElement reqProjectDeliveryDate;
    @FindBy(id = "edit-expectedRevenueRecognitionDate")
    private WebElement expRevRecDate;
    @FindBy(xpath = "//button[text()=' Save']")
    private WebElement savebtn;


    public SubBidPage(WebDriver driver) {
        super(driver);
    }

    public void clickEditDetailsBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(editDetails)).click();
    }

    public void selectQuoteType(String quoteTypeTxt) {
        new Select(quoteType).selectByVisibleText(quoteTypeTxt);
    }
    public void selectEstiLaunchDate() {
        estimatedLaunchDate.click();
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ENTER);
    }
    public void selectReqProjDeliveryDate() {
        reqProjectDeliveryDate.click();
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ENTER);
    }
    public void selectExpeRevRecDate() {
        expRevRecDate.click();
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ARROW_DOWN);
        todayDate.sendKeys(Keys.ENTER);
    }
    public void clickSaveBtn() {
        savebtn.click();
    }
}
