package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String frameID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentbutton = By.xpath("//button[@title='Increase indent']");
    public WYSIWYGEditorPage(WebDriver driver){
        this.driver = driver;
    }
    public void switchToTextArea(){
        driver.switchTo().frame(frameID);
    }
    public void clearTextArea(){
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainFrame();
    }
    public void setTextArea(String text){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainFrame();
    }

    public void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
    public void clickIncreaseIndent(){
        driver.findElement(indentbutton).click();
    }
    public String getTextArea(){
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainFrame();
        return text;
    }
}
