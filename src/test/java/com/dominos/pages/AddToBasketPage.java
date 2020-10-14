package com.dominos.pages;

import com.dominos.utilities.BrowserUtils;
import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddToBasketPage {
    public AddToBasketPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "div[id$=\"PRODUCTLIST0\"]")
    public WebElement firstProduct;

    @FindBy(css = "div[id$=\"PRODUCTLIST0_ITEM1\"]")
    public WebElement chooseProduct;

    @FindBy(css = "div[id$=\"PRODUCTLIST1\"]")
    public WebElement secondProduct;

    @FindBy(xpath = "//div[text()=\"Bol Malzemeli Ekmek Arası\"]")
    public WebElement chooseProduct2;

    @FindBy(css = "a[id$=\"ADDTOBASKET\"]")
    public List<WebElement> addToBasketButtons;




    public void chooseInProduct(){
        BrowserUtils.clickWithJS(firstProduct);
        BrowserUtils.clickWithJS(chooseProduct);
        BrowserUtils.clickWithJS(secondProduct);
        BrowserUtils.clickWithJS(chooseProduct2);
}
    public void addToBasket(){
        addToBasketButtons.get(1).click();
    }


}