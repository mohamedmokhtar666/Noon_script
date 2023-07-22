package register;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegisterTest extends BaseTest {
    @Test (dataProviderClass = SignUpData.class,dataProvider = "signup-provider")
    public void testSignUpValid(String email,String password,boolean success)
    {
        System.out.println("Sign Up");
        System.out.println("Enter Data");
        var signPage=homePage.clickSignIn();

        var signUpPage=signPage.clickSignUp();

        signUpPage.enterEmail(email);
        signUpPage.enterPassword(password);
        signUpPage.enterFirstName("mohamed");
        signUpPage.enterLastName("ali");
        signUpPage.clickCreateAccount();
        assertEquals(homePage.getText(),"Ahlan mohamed!","Welcome Account  Incorrect");
        System.out.println("Sign Up Credentials: " + "\n" +
                "  Username = " + email + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Sign In = " + success + "\n" );


    }
}
