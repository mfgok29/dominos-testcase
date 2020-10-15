package com.dominos.pages;

import com.dominos.utilities.BrowserUtils;
import com.dominos.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class AddressPage {

    public AddressPage(){
        PageFactory.initElements(Driver.get(),this);

    }

    @FindBy(css = "div[id$=\"BUTTON_DELIVERY\"]")
    public WebElement adreseTeslimButton;

    @FindBy(css = "div[id$=\"BUTTON_CARRYOUT\"]")
    public WebElement gelAlButton;

    @FindBy(css = "div[id*=\"DROPDOWN_CITY\"]")
    public WebElement dropdownElementCity;

    @FindBy(xpath = "//div[text()=\"İstanbul\"]")
    public WebElement selectedCity;

    @FindBy(css = "div[id*=\"DROPDOWN_COUNTY\"]")
    public WebElement dropdownElementCounty;

    @FindBy(xpath = "//div[text()=\"Kağıthane\"]")
    public WebElement selectedCounty;

    @FindBy(css = "div[id*=\"DROPDOWN_DISTRICT\"]")
    public WebElement dropdownElementDistrict;

    @FindBy(xpath = "//div[text()=\"Çeliktepe Mh.\"]")
    public WebElement selectedDistrict;

    @FindBy(css = "a[id*=\"BUTTON_ADDRESSSELECT\"]")
    public WebElement selectedAddress;

    @FindBy(css = "div[id*=\"DROPDOWN_STREET\"]")
    public WebElement dropdownElementStreet;

    @FindBy(xpath = "//div[text()=\"Aldemir Sk.\"]")
    public WebElement selectedStreet;

    @FindBy(css = "input[id*=\"APARTMENTNUMBER\"]")
    public WebElement inputAptNum;

    @FindBy(css = "input[id*=\"DOORNUMBER\"]")
    public WebElement inputDoorNum;

    @FindBy(css = "input[id*=\"INPUT_PHONE\"]")
    public WebElement inputPhoneNum;

    @FindBy(css = "a[id*=\"BUTTON_SAVE\"]")
    public WebElement saveButton;

    @FindBy(css = "a[id*=\"BUTTON_SELECTADDRESS\"]")
    public WebElement selectThisAddress;




    public void chooseAllAddress(){
        BrowserUtils.clickWithJS(dropdownElementCity);
        BrowserUtils.clickWithJS(selectedCity);
        BrowserUtils.clickWithJS(dropdownElementCounty);
        BrowserUtils.clickWithJS(selectedCounty);
        BrowserUtils.clickWithJS(dropdownElementDistrict);
        BrowserUtils.clickWithJS(selectedDistrict);
    }

    public void completeAddress(String aptNum, String doorNum, String phoneNum){
        BrowserUtils.clickWithJS(dropdownElementStreet);
        BrowserUtils.clickWithJS(selectedStreet);
        inputAptNum.sendKeys(aptNum);
        inputDoorNum.sendKeys(doorNum);
        inputPhoneNum.click();
        inputPhoneNum.sendKeys(phoneNum);
        BrowserUtils.clickWithJS(saveButton);
        BrowserUtils.clickWithJS(selectThisAddress);
    }




}
