package com.dominos.step_definitions;


import com.dominos.pages.*;

import com.dominos.utilities.BrowserUtils;
import com.dominos.utilities.ConfigurationReader;
import com.dominos.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class dominosStepDef {
    public WebDriverWait wait;



    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        System.out.println("I opened the browser and navigate to dominos.com.tr");
        String actualTitle = Driver.get().getCurrentUrl();
        Assert.assertEquals("Verify this website","https://www.dominos.com.tr/",actualTitle);


    }

    @Given("choosing the type of service")
    public void choosing_the_type_of_service() {
        AddressPage addressPage = new AddressPage();
        addressPage.adreseTeslimButton.click();


    }

    @Given("choosing the district and navigate to BasePage")
    public void choosing_the_district_and_navigate_to_BasePage() {
        AddressPage addressPage = new AddressPage();
        addressPage.chooseAllAddress();
        addressPage.selectedAddress.click();
        System.out.println("Order District is Selected");


    }

    @When("navigates to Campaigns Page")
    public void navigates_to_Campaigns_Page() {
        HomePage homePage = new HomePage();
        homePage.notCookie.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(),10);
        wait.until(ExpectedConditions.elementToBeClickable(homePage.allCampaigns));
        homePage.allCampaigns.click();
        Assert.assertEquals("Verify pageSubTitle","TÜM Kampanyalar",homePage.getPageSubTitle());


    }

    @When("choose to campaign")
    public void choose_to_campaign() {
        AllCampaignsPage allCampaignsPage = new AllCampaignsPage();
        allCampaignsPage.selectCampaign();

    }

    @When("add to Basket")
    public void add_to_Basket() {
        AddToBasketPage addToBasket = new AddToBasketPage();
        AllCampaignsPage allCampaignsPage = new AllCampaignsPage();
        addToBasket.chooseInProduct();
        addToBasket.addToBasket();
        System.out.println("This product added the basket");
        BrowserUtils.waitFor(3);
        allCampaignsPage.extrasClose.click();




    }

    @When("go to Basket")
    public void go_to_Basket() {

        AllCampaignsPage allCampaignsPage = new AllCampaignsPage();
        allCampaignsPage.goingToBasketButton.click();
        allCampaignsPage.goToBasketButton.click();


    }

    @When("approve the Basket")
    public void approve_the_Basket() {
        BasketPage basketPage = new BasketPage();
        Assert.assertEquals("Verify pageSubTitle","Sepetim",basketPage.getPageSubTitle());
        basketPage.orderButton.click();
        basketPage.continueBasket.click();




    }

    @When("complete Address")
    public void complete_Address() {
        AddressPage addressPage = new AddressPage();
        addressPage.completeAddress("4", "4", "071502229");


    }

    @Then("choosing the payment")
    public void choosing_the_payment() {
        PaymentPage paymentPage = new PaymentPage();
        paymentPage.creditCardPay.click();
        paymentPage.continueButton.click();
        System.out.println("Test Complete");

    }


}
