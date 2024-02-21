package pages;

import browser.Browser;
import org.testng.annotations.Test;

public class AccountPageTest {

    @Test
    public void accountTest1(){

        Browser browser=new Browser();
        browser.startBrowser()
                .clickCustomerLoginButton()
                .setSelectUser()
                .clickOnLoginButton()
                .clickDepositButton()
                .depositMoney()
                .validateBalance();

    }
}
