package example.example.tests;

import example.example.pages.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import example.example.factory.PageinstancesFactory;


//@Test(testName = "Aurora Quote Test", description = "Creating LS Quote")
public class QuotesAuroraTest extends BaseTest {


	@Test(priority = 1)
	public void auroraLaunchTest() {
		driver.get("https://aurora-testing.luz.com/");
	}
	@Test(priority = 2)
	public void createQuoteTest() throws InterruptedException {
		driver.get("https://aurora-testing.luz.com/");
		QuotesPage quotePage = PageinstancesFactory.getInstance(QuotesPage.class);
        assert quotePage != null;
        quotePage.clickQuotesTab();
		quotePage.clickCreateNewQuote();
		quotePage.selectClient("SMPL - Myers Inc");
		quotePage.selectClientContact("Anurag Wani");
		quotePage.selectTeam("Testing");
		quotePage.enterBidDesc("LS Quote By Nitin(A)");
		quotePage.selectQuoteFormat("Life Sciences");
		quotePage.selectRWSQuoteConatct("Nitin Magar");
		quotePage.clickCreateNewQuoteFormBtn();

	}
    @Test(priority = 3)
	public void subBidEditTest() throws InterruptedException {
		SubBidPage subBid = PageinstancesFactory.getInstance(SubBidPage.class);
        assert subBid != null;
        subBid.clickEditDetailsBtn();
		subBid.selectQuoteType("Default Scenario");
		subBid.selectEstiLaunchDate();
		subBid.selectReqProjDeliveryDate();
		subBid.selectExpeRevRecDate();
		subBid.clickSaveBtn();
		Thread.sleep(5000);
	}

	@Test(priority = 4)
	public void breakdownEditTest() throws InterruptedException {
		BreakdownPage breakdown = PageinstancesFactory.getInstance(BreakdownPage.class);
        assert breakdown != null;
        breakdown.clickBreakdownTab();
		breakdown.clickComponentInstrumentBtn();
		breakdown.enterComponentTxt("Inst-1");
		breakdown.clickComponentSave();
		Thread.sleep(3000);
		breakdown.clickLangPairBtn();
		breakdown.selectLangPairs("English -> French (France)");
		breakdown.selectComponent("Inst-1");
		breakdown.clickLangPairSaveBtn();
		Thread.sleep(1000);
		breakdown.clickLineItemBtn();
		breakdown.selectLineItemType("DTP");
		breakdown.selectLineServiceItem("Format Only");
		breakdown.enterWordQuantityTxt("678");
		breakdown.clickLineSaveAndCloseBtn();
		Thread.sleep(1000);
		breakdown.clickDiscountBtn();
		breakdown.enterDiscountAmtTxt("10");
		breakdown.clickPercentageRadioBtn();
		breakdown.clickAddDiscountBtn();
		Thread.sleep(1000);
		breakdown.clickEditModeBtn();
		breakdown.clickExpandBreakdownBtn();
		breakdown.enterRateTxt("2.02");
		breakdown.clickSaveAfterEditBtn();
		breakdown.clickConfirmOkBtn();
		Thread.sleep(3000);

	}

	@Test(priority = 5)
	public void signoffsTest() throws InterruptedException {
		SignoffsPage signOffs = PageinstancesFactory.getInstance(SignoffsPage.class);
        assert signOffs != null;
        signOffs.clickSignOffsTab();
		signOffs.clickSignOffsTab();
		signOffs.deleteExistingSignOffs();
		signOffs.clickNewSignOffsTaskBtn();
		signOffs.enterAssignee("Nitin Magar");
		signOffs.clickAssignAnsSendBtn();
		signOffs.enterAssignee("Nitin Magar");
		signOffs.clickSendBtn();
		signOffs.clickApproveSignOffsThumbBtn();
		signOffs.clickConfirmOkBtn();
		signOffs.enterCommentSingOff("SignOff By Nitin(A)");
		signOffs.clickSignOffsBtn();
	}
	@Test(priority = 6)
	public void launchProjectTest() throws InterruptedException {
		MainBidPage mainBid = PageinstancesFactory.getInstance(MainBidPage.class);
        assert mainBid != null;
        mainBid.clickMainBidTab();
		Thread.sleep(2000);
		mainBid.clickSendToClientBtn();
		Thread.sleep(2000);
		mainBid.clickMarkAsSentBtn();
		mainBid.clickAlertOkBtn();
		Thread.sleep(2000);
		mainBid.clickMainBidTab();
		mainBid.clickLaunchProjectBtn();
		mainBid.clickOkBtn();
		Thread.sleep(5000);

	}
}
