package FileUpload;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.HomePage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void FileUploadTests(){
        FileUploadPage fileUploadPage = homePage.ClickFileUpload();
        fileUploadPage.getFileUpload("C:\\Users\\zas\\Selenium_Angie\\src\\main\\java\\pages\\FileUploadPage.java");
        assertEquals(fileUploadPage.getUploadText(),"FileUploadPage.java","Uploaded file is invalid");
    }
}
