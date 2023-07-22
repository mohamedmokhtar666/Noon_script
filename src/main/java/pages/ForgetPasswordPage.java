package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By emailField=By.id("emailInput");
    private By submitEmail=By.xpath("//button[@class='sc-376d6e3f-9 gLYmuy confirm']");
    private By resetPasswordText=By.xpath("//div[text()='Password Reset Email Sent']");
    private By backToLogin=By.xpath("//button[@class='sc-376d6e3f-9 gLYmuy confirm']");



    public ForgetPasswordPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void clickSubmitEmail()
    {
        driver.findElement(submitEmail).click();
    }

    public String getText()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(resetPasswordText).getText();

    }

    public SignInPage clickBacToLogin()
    {
        driver.findElement(backToLogin).click();
        return new SignInPage(driver);
    }

}
