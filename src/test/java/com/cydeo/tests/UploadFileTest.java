package com.cydeo.tests;

import com.cydeo.pages.UploadFilePage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest {
UploadFilePage uploadFilePage = new UploadFilePage();
@Test
    public void uploadFileTest(){
    Driver.getDriver().get("https://practice.cydeo.com/upload");
    uploadFilePage.chooseFileBtn.sendKeys("C:\\Users\\zarin\\Desktop\\points.png");

    uploadFilePage.uploadFile.click();
    Assert.assertEquals(uploadFilePage.fileUploaded.getText(),"File Uploaded!");

}

}
