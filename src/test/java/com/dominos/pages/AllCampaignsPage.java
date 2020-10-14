package com.dominos.pages;

import com.dominos.utilities.BrowserUtils;
import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllCampaignsPage {
    public AllCampaignsPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[text()=\"Sepete Git\"]")
    public WebElement goToBasketButton;

    @FindBy(css = "div[class*=ins-close-button]")
    public WebElement extrasClose;

    @FindBy(css = "div[id*=\"HOME_BUTTON_BASKET\"]")
    public WebElement goingToBasketButton;


    @FindBy(css = "div[id*=\"TAB4\"]")
    public WebElement selectedCampaignPart;

    @FindBy(css = "div[id*=\"TAB4_CARD7\"]")
    public WebElement selectedCampaign;

    public void selectCampaign(){
        BrowserUtils.clickWithJS(selectedCampaignPart);
        BrowserUtils.clickWithJS(selectedCampaign);

    }
}
