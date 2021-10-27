package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigationMethod {
    //  1. Yeni bir Class olusturalim.(NavigationMethods)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

    //  2. Techproed ana sayfasina gidelim . https://www.techproeducation.com/
        driver.navigate().to("https://www.techproeducation.com");

    //  3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

    //  4. Tekrar techpro’sayfasina donelim
        driver.navigate().back();

    //  5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

    //  6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

    //  7. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();

    //  8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();



}
}