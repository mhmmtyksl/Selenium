package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        // Yeni bir class olusturalim : (VerifyURLTest)

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver=new ChromeDriver();

        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com");

        // Sayfa URL’inin www.techproeducation.com oldugunu dogrulayin
        String expectedUrl="www.techproeducation.com";
        String actualUrl= driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Gecerli URL : " + actualUrl);
        }
        driver.close();
    }
}
