package com.dominos.pages;

import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "h1[class*=\"pageHeader__Title\"]")
    public WebElement pageSubTitle;

    public String getPageSubTitle() {

        return pageSubTitle.getText();
    }
}
