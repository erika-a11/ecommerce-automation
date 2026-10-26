package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login_page {
    WebDriver driver;

    public Login_page(WebDriver driver){
        this.driver = driver;
    }
    By Name = By.xpath("//input[@data-qa=\"signup-name\"]");
    By Email=By.xpath("//input[@data-qa=\"signup-email\"]");
    By Signup=By.xpath("//button[@data-qa=\"signup-button\"]");
    By Title=By.xpath("//input[@id=\"id_gender2\"]");
    By Password=By.xpath("//input[@id=\"password\"]");
    By Day   = By.id("days");
    By Month = By.id("months");
    By Year  = By.id("years");
    By Newsletter=By.xpath("//input[@id=\"newsletter\"]");
    By SpecialOffers = By.xpath("//input[@id=\"optin\"]");
    By First_name=By.xpath("//input[@data-qa=\"first_name\"]");
    By Last_name=By.xpath("//input[@data-qa=\"last_name\"]");
    By Company=By.xpath("//input[@data-qa=\"company\"]");
    By Address1=By.xpath("//input[@id=\"address1\"]");
    By Address2=By.xpath("//input[@id=\"address2\"]");
    By Country_name=By.xpath("//option[@value=\"United States\"]");
    By State=By.xpath("//input[@data-qa=\"state\"]");
    By City=By.xpath("//input[@data-qa=\"city\"]");
    By Zipcode=By.xpath("//input[@data-qa=\"zipcode\"]");
    By Mobile_number=By.xpath("//input[@data-qa=\"mobile_number\"]");
    By Create_account=By.xpath("//button[@data-qa=\"create-account\"]");
    By ContinueBtn = By.xpath("//a[@data-qa=\"continue-button\"]");
    By logoutBtn = By.xpath("//a[@href='/logout']");


    public void Enter_Name(String Username){
        driver.findElement(Name).sendKeys(Username);

    }

    public void Enter_Email(String email) {

        driver.findElement(Email).sendKeys(email);
    }

    public void click_Signup()
    {
        driver.findElement(Signup).click();
    }

    public void click_gender(){
        driver.findElement(Title).click();
    }

    public void Enter_password(String password){
        driver.findElement(Password).sendKeys(password);
    }

    public void Select_DateOfBirth(String day, String month, String year) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Day));

        new Select(driver.findElement(Day)).selectByValue(day);
        new Select(driver.findElement(Month)).selectByValue(month);
        new Select(driver.findElement(Year)).selectByValue(year);
    }

    public void Tick_Checkboxes() {
        WebElement newsletter = driver.findElement(Newsletter);
        WebElement offers = driver.findElement(SpecialOffers);

        if (!newsletter.isSelected()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newsletter);
        }
        if (!offers.isSelected()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", offers);
        }

    }

    public void First_name(String first_name){
        driver.findElement(First_name).sendKeys(first_name);
    }

    public void Last_name(String last_name){
        driver.findElement(Last_name).sendKeys(last_name);
    }

    public void Company(String company){
        driver.findElement(Company).sendKeys(company);
    }

    public void Address1(String address1){
        driver.findElement(Address1).sendKeys(address1);
    }

    public void Address2(String address2){
        driver.findElement(Address2).sendKeys(address2);
    }


    public void Country_name(){
        driver.findElement(Country_name).click();
    }

    public void State(String state){
        driver.findElement(State).sendKeys(state);
    }



    public void City(String city){
        driver.findElement(City).sendKeys(city);
    }

    public void Zipcode(String zipcode){
        driver.findElement(Zipcode).sendKeys(zipcode);
    }

    public void Mobile_number(String mobile_number){
        driver.findElement(Mobile_number).sendKeys(mobile_number);
    }

    public void Create_account(){
        driver.findElement(Create_account).click();
    }
    public void clickContinue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn)).click();
    }
    public void clickLogout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();
    }









}
