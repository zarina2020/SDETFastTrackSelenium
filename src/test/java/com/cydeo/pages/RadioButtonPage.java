package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RadioButtonPage {
   public RadioButtonPage(){
       PageFactory.initElements(Driver.getDriver(),this);

   }
  @FindBy(id="blue")
    public WebElement blueButton;

    @FindBy(id="football")
    public WebElement footballButton;

    @FindBy(id="red")
    public WebElement redButton;

    @FindBy(id="green")
    public WebElement greenButton;



}



