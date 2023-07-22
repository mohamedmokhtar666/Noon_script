package forgetpassword;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTests extends BaseTest {
    @Test
    public void testForgetPassword()
    {
        String email="mohamedmok2411994@gmail.com";
        String password="1123654099";
        String newPassword="123456789";
        System.out.println("Sign In");

        var loginPage=homePage.clickSignIn();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        System.out.println("Invalid Password");
      var forgetPasswordPage = loginPage.clickForgetPassword();
      forgetPasswordPage.enterEmail(email);
      forgetPasswordPage.clickSubmitEmail();
      assertEquals(forgetPasswordPage.getText(),"Password Reset Email Sent","Incorrect Confirmation");
        System.out.println(forgetPasswordPage.getText());
      var signInPage=  forgetPasswordPage.clickBacToLogin();
        System.out.println("Sign In With New Password");
        signInPage.enterEmail(email);
        signInPage.enterPassword(newPassword);
        signInPage.clickLoginIn();
        assertEquals(homePage.getText(),"Ahlan mohamed!","Welcome Account  Incorrect");
        System.out.println(homePage.getText());




    }




}
