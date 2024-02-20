package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSliderPage ClickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public JavaScriptAlertsPage ClickJavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage ClickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public ContextMenuPage ClickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public WYSIWYGEditorPage ClickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public DynamicLoadingPage ClickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public InfiniteScrollPage ClickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPage ClickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
}