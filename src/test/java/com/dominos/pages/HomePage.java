package com.dominos.pages;

import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{
    public HomePage(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(css = "a[id*=\"BUTTON_CAMPAIGNS\"]")
    public WebElement allCampaigns;

    @FindBy(css = "a[id*=\"BUTTON_PIZZAS\"]")
    public WebElement allPizzas;

    @FindBy(css = "a[id*=\"BUTTON_EXTRAFLAVORS\"]")
    public WebElement extras;

    @FindBy(css = "i[class*='icon-times-bold']")
    public WebElement notCookie;

}
