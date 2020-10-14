package com.dominos.pages;


import com.dominos.utilities.BrowserUtils;
import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    public PaymentPage() {
        PageFactory.initElements(Driver.get(), this);
    }

        @FindBy(css = "div[id*=\"PAYMENT_1\"]")
        public WebElement onlinePay;

        @FindBy(css = "div[id*=\"PAYMENT_2\"]")
        public WebElement creditCardPay;

        @FindBy(css = "div[id*=\"PAYMENT_3\"]")
        public WebElement cashPay;

        @FindBy(css = "div[id*=\"PAYMENT_4\"]")
        public WebElement foodCartsPay;

         @FindBy(css = "button[id*=\"BUTTON_CONTINUE\"]")
         public WebElement continueButton;

         public void choosingPaymentType(){
             BrowserUtils.clickWithJS(creditCardPay);
             BrowserUtils.clickWithJS(continueButton);
         }


}
