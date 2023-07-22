package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
    private WebDriver driver;
    private By emailField=By.id("emailInput");
    private By passwordField=By.id("passwordInput");
    private By loginInButton=By.id("login-submit");
    private By loading=By.xpath("//button[@class='sc-376d6e3f-9 gLYmuy confirm']");

    private By signUp=By.xpath("//h3[@class='sc-376d6e3f-7 jDQCAY']");
    private By forgetPassword=By.xpath("//a[@class='sc-376d6e3f-11 bYBZH']");

    public SignInPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public SignUpPage  clickSignUp()
    {
        driver.findElement(signUp).click();
        return new SignUpPage(driver);
    }
    public void enterEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public HomePage clickLoginIn()
    {
        driver.findElement(loginInButton).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        return new HomePage(driver);
    }

    public ForgetPasswordPage clickForgetPassword()
    {
        driver.findElement(loginInButton).click();
       // WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        driver.findElement(forgetPassword).click();
        return new ForgetPasswordPage(driver);

    }


}
