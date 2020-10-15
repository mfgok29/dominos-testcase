package com.dominos.step_definitions;

import com.dominos.utilities.Driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;
    public WebDriverWait wait;
    public Actions action;

    @Before
    public void setUp(){
        driver =Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        action = new Actions(driver);
        wait = new WebDriverWait(driver,10);

    }

    @After
    public void tearDown(Scenario scenario){

        //if the scenario fails take the screenshot
       if (scenario.isFailed()){
         final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
          scenario.embed(screenshot,"image/png");
       }
        Driver.closeDriver();
    }

}
