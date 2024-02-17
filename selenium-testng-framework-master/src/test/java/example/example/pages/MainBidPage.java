package example.example.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainBidPage extends BasePage{

    @FindBy(xpath = "//ul[@class='tabs']/li[1]")
    private WebElement mainBidTab;
    @FindBy(xpath = "//span[@title='Send To Client']")
    private WebElement sendToClientBtn;
    @FindBy(id = "mas_btn")
    private WebElement markAsSentBtn;
    @FindBy(xpath = "//span[@title='Launch Project']")
    private WebElement launchProjectBtn;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement okBtn;



    public MainBidPage(WebDriver driver) {
        super(driver);
    }

    public void clickMainBidTab()
    {waitForElement.until(ExpectedConditions.elementToBeClickable(mainBidTab)).click();}
    public void clickSendToClientBtn()
    {waitForElement.until(ExpectedConditions.elementToBeClickable(sendToClientBtn)).click();}

    public void clickAlertOkBtn()
    {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickMarkAsSentBtn()
    {waitForElement.until(ExpectedConditions.elementToBeClickable(markAsSentBtn)).click();}
    public void clickLaunchProjectBtn()
    {waitForElement.until(ExpectedConditions.elementToBeClickable(launchProjectBtn)).click();}

    public void clickOkBtn()
    {waitForElement.until(ExpectedConditions.elementToBeClickable(okBtn)).click();}


}
