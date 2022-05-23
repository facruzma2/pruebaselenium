package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.LoginPage;


public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    //private WebDriver driver = Hooks.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,30);
    //Se instacian los objetos de las paginas
    protected LoginPage loginPage = new LoginPage(driver);
    //protected InboundPage inboundPage = new InboundPage(driver);
    ////protected ScanAndDispathPage scanAndDispathPage = new ScanAndDispathPage(driver);
}
