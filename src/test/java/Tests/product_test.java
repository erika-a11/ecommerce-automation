package Tests;

import Page_object.Login_page;
import Page_object.account_page;
import Page_object.product_page;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Random;

public class product_test extends account_test{
//   ChromeDriver driver = new ChromeDriver();
     product_page form;
//    @BeforeTest
//    public void Set_up() {
//        driver.get("https://automationexercise.com/");
//       driver.manage().window().maximize();
//       form = new product_page(driver);
//
//
//    }

    @Test
    public void Fill_Form() throws InterruptedException {
       product_page form = new product_page(driver);
        form.click_product();
        form.click_add_product();
        form.click_continue();
        form.click_add_product2();
        Thread.sleep(1000);
        form.click_view_cart();
        Thread.sleep(1000);
        form.click_proceed_to_cart();
        form.click_add_comment("Wowww ! Love the dress and attracted by new patterns.... ");
        form.click_place_order();
        form.click_name_on_card("Erika Guragain");
        form.card("A123");
        form.CVC_N("322");
        form.set_expire_date("01/05");
        form.set_expire_month("2027");
        form.click_submit_button();
        Thread.sleep(1000);
        form.click_download();
        form.Continue();
    }
}
