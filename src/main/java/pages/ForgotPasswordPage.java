package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePassword = By.className("radius");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void sendEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    public retrievePage clickRetrieveButton(){
        driver.findElement(retrievePassword).click();
        return new retrievePage(driver);
    }
}
