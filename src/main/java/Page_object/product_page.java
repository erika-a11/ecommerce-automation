package Page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class product_page {
    WebDriver driver;

    public product_page(WebDriver driver) {
        this.driver = driver;
    }
    By product= By.xpath("//a[@href=\"/products\"]");
    By add_product1=By.xpath("//a[@data-product-id=\"1\"]");
    By continue_shopping=By.xpath("//button[text()=\"Continue Shopping\"]");
    By add_product2=By.xpath("//a[@data-product-id=\"4\"]");
    By view_cart=By.xpath("//u[normalize-space()=\"View Cart\"]");
    By proceed_to_cart=By.xpath("//a[@class=\"btn btn-default check_out\"]");
    By add_comment=By.xpath("// textarea[@class=\"form-control\"]");
    By place_order=By.xpath("//a[@href=\"/payment\"]");
    By name_on_card = By.xpath("//input[@data-qa='name-on-card']");
    By card_number=By.xpath("//input[@name=\"card_number\"]");
    By CVC=By.xpath("//input[@data-qa=\"cvc\"]");
    By expire_date=By.xpath("//input[@class=\"form-control card-expiry-month\"]");
    By expire_year=By.xpath("//input[@data-qa=\"expiry-year\"]");
    By submit=By.xpath("//button[@class=\"form-control btn btn-primary submit-button\"]");
    By download=By.xpath("//a[@class=\"btn btn-default check_out\"]");
    By click_continue=By.xpath("//a[@class=\"btn btn-primary\"]");

    public void click_product()
    {
        driver.findElement(product).click();
    }

    public void click_add_product(){
        driver.findElement(add_product1).click();
    }

    public void click_continue() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(continue_shopping).click();
    }

    public void click_add_product2(){
        driver.findElement(add_product2).click();
    }

    public void click_view_cart(){
        driver.findElement(view_cart).click();
    }

    public void click_proceed_to_cart(){
        driver.findElement(proceed_to_cart).click();
    }

    public void click_add_comment(String Add_comment){
        driver.findElement(add_comment).sendKeys(Add_comment);
    }

    public void click_place_order(){
        driver.findElement(place_order).click();
    }

    public void click_name_on_card(String click_name_on_card) {
        driver.findElement(name_on_card).sendKeys(click_name_on_card);
    }

    public void card(String card){
        driver.findElement(card_number).sendKeys(card);
    }

    public void CVC_N(String CVC_N){
        driver.findElement(CVC).sendKeys(CVC_N);
    }

    public void set_expire_date(String set_expire_date){
        driver.findElement(expire_date).sendKeys(set_expire_date);
    }

    public void set_expire_month(String Set_expire_month){
        driver.findElement(expire_year).sendKeys(Set_expire_month);
    }

    public void click_submit_button(){
        driver.findElement(submit).click();
    }

    public void click_download(){
        driver.findElement(download).click();
    }

    public void  Continue(){
        driver.findElement(click_continue).click();
    }



}





