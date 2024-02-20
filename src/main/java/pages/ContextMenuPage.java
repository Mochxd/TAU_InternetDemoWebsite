package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By square = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickSquare(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(square)).perform();
    }
    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();

    }
}
