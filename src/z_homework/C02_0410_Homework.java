package z_homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

        // 1.Yeni bir class olusturalim (Homework)
public class C02_0410_Homework {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

        // 2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        // oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.navigate().to("https://facebook.com");
        String expectedTitle="facebook";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("title beklenen title ile ayni, test PASSED");
        } else {
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : "+ driver.getTitle());
        }
        // 3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        // yazdirin.
        String expectedUrl="facebook";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Gecerli URL : " + actualUrl);
        }

        // 4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com");

        // 5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedTitle1="Walmart.com";
        String actualTitle1= driver.getTitle();

        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("title Walmart.com iceriyor, PASSED");
        } else {
            System.out.println("title Walmart.com icermiyor, test FAILED");
            System.out.println("aktuel title : "+ driver.getTitle());
        }
        // 6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        // 7. Sayfayi yenileyin
        driver.navigate().refresh();

        // 8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        // 9.Browser’i kapatin
        driver.close();
    }
}
