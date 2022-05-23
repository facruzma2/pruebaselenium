package pom;

import org.openqa.selenium.WebDriver;;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wait;

    //localizadores

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);

    }


}
