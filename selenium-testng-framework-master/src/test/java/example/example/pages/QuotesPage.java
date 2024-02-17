package example.example.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuotesPage extends BasePage {


	@FindBy(id = "bids_menu")
	private WebElement quoteTab;
	@FindBy(id = "aur-new-quote")
	private WebElement createNewQuoteBtn;
	@FindBy(xpath = "//table[@class='hightable']//tbody//tr[2]//td[1]")
	private WebElement firstExistingQuote;
	@FindBy(name = "clientId")
	private WebElement clientName;
	@FindBy(name = "clientContactId")
	private WebElement clientContact;
	@FindBy(name = "teamId")
	private WebElement team;
	@FindBy(name = "bidDescription")
	private WebElement quoteDesc;
	@FindBy(name = "quoteType")
	private WebElement quoteFormat;
	@FindBy(name = "assignedTo")
	private WebElement rwsQuoteContact;
	@FindBy(xpath = "//button[text()='Create New Quote']")
	private WebElement createNewQuoteFormBtn;

	public QuotesPage(WebDriver driver) {
		super(driver);
	}


	public void clickQuotesTab() {
		waitForElement.until(ExpectedConditions.elementToBeClickable(quoteTab)).click();
	}
	public void clickCreateNewQuote() {
		waitForElement.until(ExpectedConditions.elementToBeClickable(createNewQuoteBtn)).click();
	}
	public QuotesPage clickFirstExistingQuote() {
		firstExistingQuote.click();
		return this;
	}
	public void selectClient(String clientTxt) {
		new Select(clientName).selectByVisibleText(clientTxt);
	}
	public void selectClientContact(String clientContactTxt) {
		new Select(clientContact).selectByVisibleText(clientContactTxt);
	}
	public void selectTeam(String Team) {
		new Select(team).selectByVisibleText(Team);
	}
	public void enterBidDesc(String bidDescTxt) {
		quoteDesc.sendKeys(bidDescTxt);
	}
	public void selectQuoteFormat(String quoteFormatTxt) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", quoteFormat);
		new Select(quoteFormat).selectByVisibleText(quoteFormatTxt);

	}
	public void selectRWSQuoteConatct(String QuoteContact) {
		new Select(rwsQuoteContact).selectByVisibleText(QuoteContact);
	}

	public void clickCreateNewQuoteFormBtn()
	{
		createNewQuoteFormBtn.click();
	}
}
