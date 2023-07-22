package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private WebDriver driver;
    private By emailField =By.id("emailInput");
    private By passwordField=By.id("passwordInput");
    private By firstNameField=By.id("firstNameInput");
    private By lastNameField=By.id("lastNameInput");
    private By createButton=By.id("login-submit");
    public SignUpPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void enterEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void enterFirstName(String firstName)
    {
     driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void enterLastName(String lastName)
    {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public HomePage clickCreateAccount(){
        driver.findElement(createButton).click();
        return new HomePage(driver);

    }

}
