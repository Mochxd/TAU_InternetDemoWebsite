package JavaScriptAlerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;

public class JavaScriptAlertsTests extends BaseTests {
    @Test
    public void testAlert(){
    JavaScriptAlertsPage javaAlerts = homePage.ClickJavaScriptAlerts();
    javaAlerts.clickJsAlert();
    javaAlerts.acceptAlert();
    assertEquals(javaAlerts.alertResultText(),"You successfully clicked an alert","Error text error");
    }
    @Test
    public void testConfirm(){
        JavaScriptAlertsPage javaAlerts = homePage.ClickJavaScriptAlerts();
        javaAlerts.clickJsConfirm();
        javaAlerts.acceptAlert();
        assertEquals(javaAlerts.alertResultText(),"You clicked: Ok","Error confirm text");
    }
    @Test
    public void testConfirmDismiss(){
        JavaScriptAlertsPage javaAlerts = homePage.ClickJavaScriptAlerts();
        javaAlerts.clickJsConfirm();
        javaAlerts.dismissAlert();
        assertEquals(javaAlerts.alertResultText(),"You clicked: Cancel","Error Cancel text");
    }
    @Test
    public void testPromote(){
        JavaScriptAlertsPage javaAlerts = homePage.ClickJavaScriptAlerts();
        javaAlerts.clickJsPrompt();
        javaAlerts.fillPrompt("Mohamed Mostafa");
        javaAlerts.acceptAlert();
        assertEquals(javaAlerts.alertResultText(),"You entered: Mohamed Mostafa","Error Entering Message");
    }

}
