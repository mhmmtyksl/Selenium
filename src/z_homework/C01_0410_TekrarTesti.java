package z_homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_0410_TekrarTesti {
    // 1. Yeni bir class olusturun (TekrarTesti)

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        // 2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        // (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.navigate().to("https://www.youtube.com");
        String expectedTitle="youtube";
        String actuelTitle= driver.getTitle();

        if (expectedTitle.equals(actuelTitle)) {
            System.out.println("title beklenen title ile ayni, VERIFY");
        } else {
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : "+ driver.getTitle());
        }
        // 3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        // URL'yi yazdırın.
        String expectedUrl="youtube";
        String actuelUrl= driver.getCurrentUrl();

        if (actuelUrl.contains(expectedUrl)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Gecerli URL : " + actuelUrl);
        }
        // 4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com");

        // 5. Youtube sayfasina geri donun
        driver.navigate().back();

        // 6. RefrSayfayi yenileyin
        driver.navigate().refresh();

        // 7. Amazon sayfasina donun
        driver.navigate().forward();

        // 8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();

        // 9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        // doğru başlığı(Actual Title) yazdırın.
        String expectedTitle1="Amazon";
        String actuelTitle1= driver.getTitle();

        if (actuelTitle1.contains(expectedTitle1)) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
            System.out.println("Gecerli URL : " + driver.getTitle());
        }

        // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        // URL'yi yazdırın
        String expectedUrl1="https://www.amazon.com/";
        String actuelUrl1= driver.getCurrentUrl();

        if (expectedUrl1.equals(actuelUrl1)) {
            System.out.println("URL beklenen URL ile ayni, VERIFY");
        } else {
            System.out.println("URL beklenenden farkli, test FAILED");
            System.out.println("aktuel URL : "+ actuelUrl);
        }

        // 11.Sayfayi kapatin
        driver.close();






    }
}
