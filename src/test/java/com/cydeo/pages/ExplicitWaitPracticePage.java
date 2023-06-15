package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {
  public ExplicitWaitPracticePage(){
      PageFactory.initElements(Driver.getDriver(),this);


  }

   @FindBy(xpath = "//button[.='Start']")
   public WebElement start;

    @FindBy(id = "username")
    public WebElement  username;

    @FindBy(id = "pwd")
    public WebElement  password;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//div[normalize-space(text())='Your password is invalid!']")
    public WebElement resultText;

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement messageDone;

    @FindBy(xpath ="//img[@class='rounded mx-auto d-block']")
    public WebElement image;


}
