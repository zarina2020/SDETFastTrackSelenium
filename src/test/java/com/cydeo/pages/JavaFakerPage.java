package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavaFakerPage {
 public JavaFakerPage(){
  PageFactory.initElements(Driver.getDriver(),this);

 }
 @FindBy(id ="ctl00_MainContent_username")
 public WebElement userName;

 @FindBy(id ="ctl00_MainContent_password")
 public WebElement password;

 @FindBy(id ="ctl00_MainContent_login_button")
 public WebElement loginBtn;

 @FindBy(linkText ="Order")
 public WebElement orderBtn;

 @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
 public WebElement dropdown;
 @FindBy(id ="ctl00_MainContent_fmwOrder_txtQuantity")
 public WebElement quantity;
 @FindBy(xpath ="//input[@value='Calculate']")
 public WebElement CalculateBtn;

 @FindBy(id ="ctl00_MainContent_fmwOrder_txtName")
 public WebElement CustomerNumber;
 @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox2")
 public WebElement street;
 @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox3")
 public WebElement city;
 @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox4")
 public WebElement state;

 @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox5")
 public WebElement zip;
 @FindBy(id ="ctl00_MainContent_fmwOrder_cardList_0")
 public WebElement visa;

 @FindBy(id ="ctl00_MainContent_fmwOrder_TextBox6")
 public WebElement cardNumber;
 @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
 public WebElement expireDate;
 @FindBy(linkText ="Process")
 public WebElement process;
@FindBy(xpath = "//strong[normalize-space(text()='New order has been successfully added. ')]")
 public WebElement resultText;

}
