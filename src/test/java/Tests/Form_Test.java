package Tests;

import Page_object.Login_page;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;


public class Form_Test {

    ChromeDriver driver = new ChromeDriver();

    @BeforeTest
    public void Set_up() {
        driver.get("https://automationexercise.com/login");
        driver.manage().window().maximize();


    }

//    public String Generate_Random_Email() {
//        Random random = new Random();
//
//        String email = "test" + random.nextInt(10000) + "@gmail.com";
//
//        return email;
//    }

    //String Random_Email = Generate_Random_Email();

    @Test(priority = 1)
    public void Fill_Form() throws InterruptedException {
        Login_page form = new Login_page(driver);
        form.Enter_Name("Erika Guragain");
        form.Enter_Email("erikaguragain3300@gmail.com");
        form.click_Signup();
        form.click_gender();
        form.Enter_password("test@123");
        form.Select_DateOfBirth("15", "8", "1998");
        form.Tick_Checkboxes();
        form.First_name("Erika");
        form.Last_name("Guragain");
        form.Company("ABC");
        form.Address1("Tarkeshwor");
        form.Address2("Kathmandu");
        form.Country_name();
        form.State("Bagmati");
        form.City("Kathmandu");
        form.Zipcode("44600");
        form.Mobile_number("9777777777");
        form.Create_account();
        form.clickContinue();
        form.clickLogout();
        Thread.sleep(5000);


    }

    //@Test
    //public void Login() throws InterruptedException {
      //  Login_page form = new Login_page(driver);


    }

    //@AfterTest
    //public void tear_up(){
      //  driver.quit();
    //}

//}




