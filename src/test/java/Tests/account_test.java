package Tests;

import Page_object.Login_page;
import Page_object.account_page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class account_test {
    ChromeDriver driver = new ChromeDriver();

    @BeforeTest
    public void Set_up() {
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();
//    }
//    public String Generate_Random_Email() {
//        Random random = new Random();
//
//        String email = "test" + random.nextInt(10000) + "@gmail.com";
//
//        return email;
//    }
//    String Random_Email = Generate_Random_Email();
//    @Test
//    public void Fill_Form() throws InterruptedException {
        account_page form = new account_page(driver);
        form.Enter_Email_address("erikaguragain3300@gmail.com");
        form.Enter_login_password("test@123");
        form.click_Submit_Login();


    }
}
