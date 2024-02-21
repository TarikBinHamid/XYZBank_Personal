package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountPage {
    @FindBy(css = "[ng-click='deposit()']") private WebElement depositButton;
    @FindBy(css ="[ng-model='amount']") private WebElement inputAmount;
    @FindBy(css ="[type='submit']") private WebElement depositSubmitButton;

    private WebElement balance;

    public AccountPage clickDepositButton(){
        depositButton.click();

        return this;
    }

    public AccountPage depositMoney(){
        inputAmount.sendKeys("500");
        depositSubmitButton.click();
        return this;
    }

    public AccountPage validateBalance(){
        String actualBalance=balance.getText();
        Assert.assertEquals(actualBalance,"500");
        return this;

    }

}
