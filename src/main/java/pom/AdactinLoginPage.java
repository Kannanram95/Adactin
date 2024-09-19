package pom;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaseClass {
    public AdactinLoginPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="username")
    private WebElement txtUserName;

    @FindBy(id="password")
    private WebElement txtPassword;

    @FindBy(id="login")
    private WebElement btnLogin;

    @FindBy(className="login_forgot")
    private WebElement btnForget;

    public WebElement getTxtUserName(){
        return this.txtUserName;
    }

    public WebElement getTxtPassword(){
        return this.txtPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getBtnForget() {
        return btnForget;
    }
}
