package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class BreakdownPage extends BasePage {

    @FindBy(xpath = "//ul[@class='tabs']/li[3]/a")
    private WebElement breakdownTab;
    @FindBy(xpath = "//span[@class='clickable    no-child-pointers'][1]")
    private WebElement componentInstrumentBtn;
    @FindBy(id = "component_name")
    private WebElement componentTxt;//Inst-1
    @FindBy(css = "button.schedule-button[onclick*='aurora.quotes.breakdown.addComponent()']")
    private WebElement componentSaveBtn;
    @FindBy(xpath = "//span[@class='clickable    no-child-pointers'][2]")
    private WebElement langPairBtn;
    @FindBy(id = "add-lp-languages")
    private WebElement languagePairSelect;//English -> French (France)//36875
    @FindBy(id = "add-lp-components")
    private WebElement componentSelect;//Inst-1
    @FindBy(xpath = "//button[@class='schedule-button btn-submit']")
    private WebElement langPairSaveBtn;
    @FindBy(xpath = "//span[@class='clickable    no-child-pointers'][3]")
    private WebElement lineItemBtn;
    @FindBy(id = "nri_select_type")
    private WebElement lineItemTypeSel;//DTP//2
    @FindBy(id = "id_ri_descr_all")
    private WebElement lineServiceItemSel;//Format Only
    @FindBy(id = "addLineItemQuantity")
    private WebElement wordQuantityTxt;//678
    @FindBy(xpath = "//button[@class='schedule-button btn-nri-save'][2]")
    private WebElement lineSaveAndCloseBtn;
    @FindBy(xpath = "//span[@class='clickable    no-child-pointers'][4]")
    private WebElement discountBtn;
    @FindBy(id = "amountDis")
    private WebElement discountAmountTxt;
    @FindBy(xpath = "//input[@value='percentage']")
    private WebElement percentRadioBtn;
    @FindBy(xpath = "//button[@class='schedule-button details-action add-discount']")
    private WebElement addDiscountBtn;
    @FindBy(xpath = "//button[text()='Edit Mode']")
    private WebElement editModeBtn;
    @FindBy(xpath = "//i[@data-action='open']")
    private WebElement expandBreakdownBtn;
    @FindBy(xpath = "//input[@type='number']")
    private WebElement rateTxt;
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveEditBtn;

    @FindBy(xpath = "//button[@class='schedule-button confirm-button']")
    private WebElement confirmOkBtn;

    public BreakdownPage(WebDriver driver) {
        super(driver);
    }

    public void clickBreakdownTab() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(breakdownTab)).click();
    }

    public void clickComponentInstrumentBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(componentInstrumentBtn)).click();
    }

    public void enterComponentTxt(String component) {
        componentTxt.sendKeys(component);
    }

    public void clickComponentSave() throws InterruptedException {
        waitForElement.until(ExpectedConditions.elementToBeClickable(componentSaveBtn)).click();
        Thread.sleep(3000);
    }

    public void clickLangPairBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(langPairBtn)).click();
    }

    public void selectLangPairs(String langPairs) {
        new Select(languagePairSelect).selectByVisibleText(langPairs);
    }

    public void selectComponent(String component) {
        new Select(componentSelect).selectByVisibleText(component);
    }

    public void clickLangPairSaveBtn() {
        langPairSaveBtn.click();
    }

    public void clickLineItemBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(lineItemBtn)).click();
    }

    public void selectLineItemType(String lineItemType) {
        waitForElement.until(ExpectedConditions.elementToBeClickable(lineItemTypeSel));
        new Select(lineItemTypeSel).selectByVisibleText(lineItemType);
    }

    public void selectLineServiceItem(String lineServiceItem) {
        new Select(lineServiceItemSel).selectByVisibleText(lineServiceItem);
    }

    public void enterWordQuantityTxt(String wordQuantity) {
        wordQuantityTxt.sendKeys(wordQuantity);
    }

    public void clickLineSaveAndCloseBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(lineSaveAndCloseBtn)).click();
    }

    public void clickDiscountBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(discountBtn)).click();
    }

    public void enterDiscountAmtTxt(String discountAmt) {
        discountAmountTxt.sendKeys(discountAmt);
    }

    public void clickPercentageRadioBtn() {
        percentRadioBtn.click();
    }

    public void clickAddDiscountBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(addDiscountBtn)).click();    }

    public void clickEditModeBtn() {
        editModeBtn.click();
    }

    public void clickExpandBreakdownBtn() {
        expandBreakdownBtn.click();
    }

    public void enterRateTxt(String rate) {
        rateTxt.sendKeys(rate);
    }

    public void clickSaveAfterEditBtn() {
        waitForElement.until(ExpectedConditions.elementToBeClickable(saveEditBtn)).click();;
    }

    public void clickConfirmOkBtn() throws InterruptedException {
        waitForElement.until(ExpectedConditions.elementToBeClickable(confirmOkBtn)).click();
        Thread.sleep(3000);
    }


}
