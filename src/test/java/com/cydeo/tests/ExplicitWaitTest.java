package com.cydeo.tests;

import com.cydeo.pages.ExplicitWaitPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTest {

  ExplicitWaitPracticePage explicitWaitPracticePage =new ExplicitWaitPracticePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
  @Test
    public void dynamicLoad1(){
      Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        explicitWaitPracticePage.start.click();


      wait.until(ExpectedConditions.visibilityOf(explicitWaitPracticePage.username));

      Assert.assertTrue(explicitWaitPracticePage.username.isDisplayed());
      explicitWaitPracticePage.username.sendKeys("tomsmith");
        explicitWaitPracticePage.password.sendKeys("incorrectpassword");
        explicitWaitPracticePage.submit.click();
        Assert.assertTrue(explicitWaitPracticePage.resultText.isDisplayed());
  }

@Test
    public void dynamicLoad7(){
      Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

      wait.until(ExpectedConditions.titleIs("Dynamic title"));
      Assert.assertTrue(explicitWaitPracticePage.messageDone.isDisplayed());
      Assert.assertTrue(explicitWaitPracticePage.image.isDisplayed());
}

}

