package retrievePassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.retrievePage;

import static org.testng.Assert.assertTrue;

public class retrievePasswordTests extends BaseTests {
    @Test
    public void testRetrievePassword() {
        ForgotPasswordPage forgetPassword = homePage.clickForgotPassword();
        forgetPassword.sendEmail("tau.example.com");
        retrievePage retrievePage = forgetPassword.clickRetrieveButton();
        assertTrue(retrievePage.getMessage().contains("Internal Server Error"),"text is incorrect");    }
}
