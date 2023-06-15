package com.cydeo.tests;

import com.cydeo.pages.JavaFakerPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaFakerTest {
 JavaFakerPage javaFakerPage = new JavaFakerPage();
 @Test
    public void javaFakerTest(){
     Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/Process.aspx");
     javaFakerPage.userName.sendKeys("Tester");
     javaFakerPage.password.sendKeys("test");
      javaFakerPage.loginBtn.click();
     javaFakerPage.orderBtn.click();
      Select select = new Select(javaFakerPage.dropdown);
     select.selectByVisibleText("FamilyAlbum");

     javaFakerPage.quantity.sendKeys("5");
     javaFakerPage.CalculateBtn.click();
     Faker faker = new Faker();
    javaFakerPage.CustomerNumber.sendKeys(faker.name().firstName());
    javaFakerPage.street.sendKeys(faker.address().streetName());
    javaFakerPage.city.sendKeys(faker.address().city());
    javaFakerPage.zip.sendKeys(faker.address().zipCode().replace("-",""));
    javaFakerPage.visa.click();

        javaFakerPage.cardNumber.sendKeys(faker.business().creditCardNumber());
        javaFakerPage.expireDate.sendKeys(faker.business().creditCardExpiry().substring(0,2)+"/"+faker.business().creditCardExpiry().substring(2));
        javaFakerPage.process.click();
         Assert.assertTrue(javaFakerPage.resultText.isDisplayed());
 }

}
