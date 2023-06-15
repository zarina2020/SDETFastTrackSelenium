package com.cydeo.tests;

import com.cydeo.pages.ActionsPracticePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPracticeTest {

  ActionsPracticePage actionsPracticePage= new ActionsPracticePage();
@Test
    public void hoverOverTest(){
    Driver.getDriver().get("https://practice.cydeo.com/hovers");
    Actions actions = new Actions(Driver.getDriver());
      actions.moveToElement(actionsPracticePage.firstHoverImg).perform();
    Assert.assertTrue(actionsPracticePage.name1.isDisplayed(),"Name 1 did not appear");

  actions.moveToElement(actionsPracticePage.secondHoverImg).perform();
  Assert.assertTrue(actionsPracticePage.name2.isDisplayed(),"Name 2 did not appear");

  actions.moveToElement(actionsPracticePage.thirdHoverImg).perform();
  Assert.assertTrue(actionsPracticePage.name3.isDisplayed(),"Name 3 did not appear");

}

@Test
    public void rightClickTest(){
    Driver.getDriver().get("https://practice.cydeo.com/");
     Actions actions = new Actions(Driver.getDriver());
     actions.contextClick(actionsPracticePage.abTestLink).
             sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.RETURN).perform();
     Assert.assertEquals(Driver.getDriver().getTitle(),"No A/B Test");

}
  @Test
    public void jsExecutorScrollingTest(){
    Driver.getDriver().get("https://practice.cydeo.com/");

      JavascriptExecutor js =((JavascriptExecutor)Driver.getDriver());
        js.executeScript("arguments[0]scrollIntoView(true)",actionsPracticePage.cydeoLink,actionsPracticePage.homeLink);
      BrowserUtils.sleep(5);
        js.executeScript("arguments[1]scrollIntoView(true)",actionsPracticePage.cydeoLink,actionsPracticePage.homeLink);


}

}
