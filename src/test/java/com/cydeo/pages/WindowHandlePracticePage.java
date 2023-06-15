package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePracticePage {

public WindowHandlePracticePage(){
    PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(linkText = "Click Here")
    public WebElement clockHereLink;


    @FindBy(linkText = "CYDEO")
    public WebElement cydeoLink;
}
