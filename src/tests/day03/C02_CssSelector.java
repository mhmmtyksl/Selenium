package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

    // 1. Bir class oluşturun : Locators_css
    // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    public static void main(String[] args) {

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        WebElement emailTextBox=driver.findElement(By.cssSelector(".form-control"));

        // c. Locate password textbox ve
        WebElement passwordTextBox =driver.findElement(By.cssSelector("input#session_password"));

        // d. Locate signin button
        WebElement SignInButton = driver.findElement(By.cssSelector("input[name='commit']"));


        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");

        // ii. Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");

        SignInButton.submit();
    }
}
