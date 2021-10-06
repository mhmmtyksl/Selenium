package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {
        //1. Bir class oluşturun: LocatorsIntro
        // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

        // 2a) http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");


        // 2b) Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.id("sign-in")); // id ile elemente ulastik
        signInLinki.sendKeys(Keys.ENTER);
        // veya signInLinki.click();
        Thread.sleep(2000); // sure koyduk cunku net hizi yetisemedi

        //2c email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email")); // mailadres kutusunu bulduk

        WebElement passwordBox= driver.findElement(By.id("session_password")); // sifre kutusunu bulduk

        WebElement signInButon=driver.findElement(By.name("commit")); // sign in butonunu bulduk

        //2d) Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //                i. Username : testtechproed@gmail.com
        //                ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com"); // mail adresini yazdik

        passwordBox.sendKeys("Test1234!"); // sifreyi yazdik

        signInButon.click(); // giris icin onayladik

        //2e)  Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement dogruKullanici=driver.findElement(By.className("navbar-text")); // kullanici adinin yerini belirledik

        String userName="testtechproed@gmail.com"; // karsilastirdigimiz kullanici adini yazdik

        if (dogruKullanici.getText().equals(userName)) { // ikisini karsilastiriyoruz aradaki get.Text() in amaci elemntte yazani Stringe cevirmek yoksa hata verir
            System.out.println("Dogru kullanici testi PASSED");
        } else {
            System.out.println("Dogru kullanici testi FAILED");
        }

        //2f) “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinki=driver.findElement(By.linkText("Addresses")); // Addresses in yerine belirledik

        WebElement signOutLinki= driver.findElement(By.linkText("Sign out")); // Sign out un yerine belirledik

        if (adressesLinki.isDisplayed()) { //true yada false doner. true ise gorunuyor false gorunmuyor demektir
            System.out.println("adresses Linki gorunuyor, PASS");
        } else {
            System.out.println("adresses Linki gorunmuyor, FAILED");
        }

        if (signOutLinki.isDisplayed()) { //true yada false doner. true ise gorunuyor false gorunmuyor demektir
            System.out.println("sign out Linki gorunuyor, PASS");
        } else {
            System.out.println("sign out Linki gorunmuyor, FAILED");
        }

        // 3) Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkler=driver.findElements(By.tagName("a"));
        System.out.println("Sitenin giris sayfasinda olan link sayisi : "+ linkler.size());

        // Linklerin yazilarini yazdiralim
        // elimizdeki listedeki tum WebElementler in yazilarini forloop veya foreachloop ile yazdirabiliriz
        // tum elementler yazdirilacaksa foreachloop daha mantiklidir.

        for (WebElement each : linkler) {
            System.out.println(each.getText());
        }




    }
}

