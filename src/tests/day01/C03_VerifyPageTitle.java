package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {
    public static void main(String[] args) {
        // 1) Yeni bir Class olusturalim. (VerifyTitle)
        // 2) Amazon ana sayfasina gidelim . https://www.amazon.com/
        // 3) Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        // 2. adim
        driver.get("https://www.amazon.com");

        // 3. adim
        String expectedTitle="amazon";
        String actuelTitle= driver.getTitle();

        if (expectedTitle.equals(actuelTitle)) {
            System.out.println("title beklenen title ile ayni");
        } else {
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : "+ driver.getTitle());
        }

        driver.close();



    }
}
