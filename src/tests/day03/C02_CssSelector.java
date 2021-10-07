package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

    // 1. Bir class oluşturun : Locators_css
    // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    public static void main(String[] args) throws InterruptedException {

        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //	a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //	b. Locate email textbox
        Thread.sleep(2000);
        WebElement emailtextBox=driver.findElement(By.cssSelector(".form-control"));
        emailtextBox.sendKeys("testtechproed@gmail.com");

        //	c. Locate password textbox ve
        //WebElement passwordTexBox1=driver.findElement(By.cssSelector("input[id='session_password']"));
        // css selector ile uzun sekilde yazilis
        WebElement passwordTexBox1=driver.findElement(By.cssSelector("#session_password"));
        // css selector ile kisa yazilis
        //WebElement passwordTexBox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        // xpath ile yazilis

        passwordTexBox1.sendKeys("Test1234!");  // css selector ile deger yazdirma
        //passwordTexBox.sendKeys("Test1234!"); // xpath ile deger yazdirma

        //	d. Locate signin button
        WebElement submitButonu=driver.findElement(By.cssSelector("input[type='submit']"));
        //WebElement submitButonu=driver.findElement(By.xpath("//input[@type='submit']"));
        submitButonu.click();

        //	e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //
        //		i. Username : testtechproed@gmail.com
        //		ii. Password : Test1234!
    }

}