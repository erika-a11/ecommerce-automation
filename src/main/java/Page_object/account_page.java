package Page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class account_page {
    WebDriver driver;

    public account_page(WebDriver driver) {
        this.driver = driver;
    }

    By Email_address=By.xpath("//input[@data-qa=\"login-email\"]");
    By login_password=By.xpath("//input[@data-qa=\"login-password\"]");
    By login=By.xpath("//button[@data-qa=\"login-button\"]");

    public void Enter_Email_address(String email_address ){
        driver.findElement(Email_address).sendKeys(email_address);
    }

    public void Enter_login_password(String Login_password){
        driver.findElement(login_password).sendKeys(Login_password);
    }

    public void click_Submit_Login() {
        driver.findElement(login).click();
    }

}
