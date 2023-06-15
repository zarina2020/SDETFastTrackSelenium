package com.cydeo.tests;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownTest {
    DropDownPage dropDownPage= new DropDownPage();

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
   @Test
    public void stateDropDownTest(){




       Select stateSelect = new Select(dropDownPage.stateDropdown);
       stateSelect.selectByVisibleText("Illinois");
       String actualOption = stateSelect.getFirstSelectedOption().getText();
       String expectedOption = "Illinois";

       Assert.assertEquals(actualOption,expectedOption);

       stateSelect.selectByValue("VA");
       actualOption = stateSelect.getFirstSelectedOption().getText();
       expectedOption= "Virginia";
       Assert.assertEquals(actualOption,expectedOption);

       stateSelect.selectByIndex(5);
       actualOption=stateSelect.getFirstSelectedOption().getText();
       expectedOption="California";
       Assert.assertEquals(actualOption,expectedOption);
       Driver.getDriver().close();

   }
 @Test
    public void dateOfBirthDropdownTest(){
        Select yearSelect = new Select(dropDownPage.yearDropdown);
        yearSelect.selectByVisibleText("1950");
        String actualYearOption = yearSelect.getFirstSelectedOption().getText();
        String expectedYearOption = "1950";
        Assert.assertEquals(actualYearOption,expectedYearOption,"Year selection did not pass ");


        Select monthSelect = new Select(dropDownPage.monthDropdown);
        monthSelect.selectByValue("11");

        String actualMonthOption = monthSelect.getFirstSelectedOption().getText();
        String expectedMonthOption ="December";
       Assert.assertEquals(actualMonthOption,expectedMonthOption,"Month selection did not pass");

        Select daySelect = new Select(dropDownPage.dayDropdown);
        daySelect.selectByIndex(0);

        String actualDayOption = daySelect.getFirstSelectedOption().getText();
        String expectedDayOption = "1";
        Assert.assertEquals(actualDayOption,expectedDayOption,"Day selection did not pass");



 }

@Test
    public void languagesDropdown(){
        Select languagesSelect = new Select(dropDownPage.languagesDropdown);
    List<WebElement> languagesOptions = languagesSelect.getOptions();
    for (WebElement eachOption : languagesOptions){
        languagesSelect.selectByVisibleText(eachOption.getText());

        System.out.println(eachOption.getText());
        Assert.assertTrue(eachOption.isSelected(),"Language option did not selected");
    }

         languagesSelect.deselectAll();
    for (WebElement eachOption:languagesSelect.getOptions()){
        Assert.assertTrue(!eachOption.isSelected());
    }

    }
    @AfterMethod
    public void tearDown(){
       Driver.getDriver().close();
}
}
