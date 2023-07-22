package login;

import base.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class LoginInTest extends BaseTest {
    @Test (priority = 1,dataProviderClass=SignInData.class,dataProvider = "signin-provider")
    public void testLoginIn(String email,String password,boolean success)
    {
        System.out.println("Sign In");
        System.out.println("Enter Data");
        var loginPage=homePage.clickSignIn();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginIn();
        assertEquals(homePage.getText(),"Ahlan mohamed!","Welcome Account  Incorrect");
        System.out.println("Sign In Credentials: " + "\n" +
                "  Username = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Sign In = " + success + "\n" );

    }
    @Test (priority = 2)
    public void testLogOut()
    {
        System.out.println("Log Out");
        homePage.clickLogOut();
    }
}
