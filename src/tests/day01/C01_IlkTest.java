package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // istenilen sayfaya gitmrk icin kullanilir
        System.out.println("Su andaki url : "+ driver.getCurrentUrl()); // mevcut URL yi yazdirir
        System.out.println("Su andaki baslik : "+ driver.getTitle()); // mevcut Title i yazdirir
        driver.manage().window().maximize(); // sayfayi buyutur maximize yapar
        Thread.sleep(3000); // bu komut arada bekleme yapmasi icindir. internet hizi yavassa gerekir yoksa kod calismayabilir.
        // sleep yazinca altini kirmizi ciziyor exception firlatmak gerekiyor.

        driver.navigate().to("https://www.techproeducation.com"); // navigate yonlendir demek
        // get ve navigate in farki get te onceki sayfaya geri donemeyiz ama navigate te onceki sayfaya donebiliriz
        // get yazilirsa tekrardan URL yazmak gerekir

        Thread.sleep(2000);
        driver.navigate().back(); // geriye onceki sayfaya yonlendirir
        Thread.sleep(2000);

        driver.navigate().forward(); // geri gelinen ilerideki sayfaya tekrar gider
        Thread.sleep(2000);

        driver.navigate().refresh(); // sayfayi yenilemek icin kullanilir
        Thread.sleep(2000);

        // driver.quit(); // acik olan tum browserlari kapatir

        driver.close(); // sadece bir browser i kapatir.

        // Process finished with exit code 0 sonda bu yaziyorsa terminalde kod sorunsuz calismistir
    }
}
