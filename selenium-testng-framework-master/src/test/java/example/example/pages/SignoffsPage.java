package example.example.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignoffsPage extends BasePage{


    @FindBy(xpath = "//ul[@class='tabs']/li[5]")
    private WebElement signOffsTab;

    @FindBy(xpath = "//i[@title='Delete Signoff']")
    private WebElement existingSignOffDelBtn;

    @FindBy(xpath = "//span[@class='clickable icon-action action-new']")
    private WebElement newSignOffTaskBtn;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    private WebElement assignee;
    @FindBy(xpath = "//button[@class='schedule-button'][2]")
    private WebElement assignAndSendBtn;
    @FindBy(xpath = "//button[@class='schedule-button'][2]")
    private WebElement sendBtn;

    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up action-signoff fa-lg clickable icon-action' and @style='color:#18751e' and @title='Approve/Reject Signoff']")
    private WebElement approveSignOff;

    @FindBy(xpath = "//button[text()='OK']")
    private WebElement confirmOkBtn;

    @FindBy(name = "comments")
    private WebElement commentSignOff;

    @FindBy(xpath = "//button[@class='schedule-button'][2]")
    private WebElement signOffBtn;


    public SignoffsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignOffsTab()
    {signOffsTab.click();
    }
    public void deleteExistingSignOffs()
    {
        try {
            do{
                Thread.sleep(1000);
                existingSignOffDelBtn.click();
                Thread.sleep(2000);
            }while (existingSignOffDelBtn.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void clickNewSignOffsTaskBtn()
    {newSignOffTaskBtn.click();}
    public void enterAssignee(String assigneeName)
    {assignee.sendKeys(assigneeName);
    assignee.sendKeys(Keys.ENTER);}
    public void clickAssignAnsSendBtn()
    {assignAndSendBtn.click();}
    public void clickSendBtn()
    {sendBtn.click();}
    public void clickApproveSignOffsThumbBtn()
    {approveSignOff.click();}
    public void clickConfirmOkBtn()
    {confirmOkBtn.click();
    }
    public void enterCommentSingOff(String commentTxt)
    {commentSignOff.sendKeys(commentTxt);
    }
    public void clickSignOffsBtn() throws InterruptedException {signOffBtn.click();
        Thread.sleep(5000);
    }
}
