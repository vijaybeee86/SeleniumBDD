package pages;

import DriverFactory.DriverInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    protected WebDriverWait wait;
    public LoginPage()
    {
        PageFactory.initElements(DriverInstance.getInstance(), this);
        wait = new WebDriverWait(DriverInstance.getInstance(), Duration.ofSeconds(10));

    }

    @FindBy(id = "user-name")
    private WebElement uname;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void enterUName(String name)
    {
        wait.until(ExpectedConditions.visibilityOf(uname));
        uname.clear();
        uname.sendKeys(name);
    }

    public void enterPwd(String pwd)
    {
        wait.until(ExpectedConditions.visibilityOf(password));
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLoginBtn()
    {
        wait.until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }
}
