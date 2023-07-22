package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    private By signInBox=By.id("dd_header_signInOrUp");
    private By welcomeText=By.xpath("//span[@class='userName']");
    private By button=By.xpath("//img[@id='dd_header_accountMenuCaret']");
    private By logOut=By.xpath("//button[@class='logOut']");

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    public SignInPage clickSignIn()
    {
        hold1();
    driver.findElement(signInBox).click();
    return new SignInPage(driver);
    }

    public String getText()
    {
        hold2WelcomeText();
        return driver.findElement(welcomeText).getText();
    }
    public void clickLogOut()
    {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        hold();
        driver.findElement(button).click();
        driver.findElement(logOut).click();
    }
public void hold()
{
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    wait.until(ExpectedConditions.visibilityOf(driver.findElement(button)));
}
public void hold1()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signInBox)));
    }
    public void hold2WelcomeText()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='userName']")));
    /*
    FluentWait wait=new FluentWait(driver).withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(button)));*/

    }
}
