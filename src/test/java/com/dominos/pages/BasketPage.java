package com.dominos.pages;

import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasketPage extends BasePage{
    public BasketPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[text()=\"Sipariş Ver\"]")
    public WebElement orderButton;

    @FindBy(xpath = "//span[text()=\"Üye Olmadan Devam Et\"]")
    public WebElement continueBasket;
}
