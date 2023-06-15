package com.cydeo.tests;

import com.cydeo.pages.AlertPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;

public class AlertPracticeTest {
AlertPracticePage alertPracticePage = new AlertPracticePage();
 @Test
    public void alertPracticeTest() {
     Driver.getDriver().get("https://practice.cydeo.com/javascript_alerts");
     alertPracticePage.jsAlertBtn.click();
     Alert alert = Driver.getDriver().switchTo().alert();
     alert.sendKeys("hello");
     alert.accept();
     String actualResultText = alertPracticePage.resultText.getText();
     String expectedResultText = "You entered: hello";
     Assert.assertEquals(actualResultText,expectedResultText);
     Driver.closeDriver();

 }


}
