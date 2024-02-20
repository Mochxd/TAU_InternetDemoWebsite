package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By fileUploaded =By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void getFileUpload(String absolutePath){
        driver.findElement(chooseFileButton).sendKeys(absolutePath);
        driver.findElement(uploadButton).click();
    }
    public String getUploadText(){
        return driver.findElement(fileUploaded).getText();
    }
}