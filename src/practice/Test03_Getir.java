package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test03_Getir {
    public static void main(String[] args) {

    //1) driver olusturun
    System.setProperty("webdriver.chrome.driver", "/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver");
    WebDriver driver=new ChromeDriver();


        //2) Tam ekran yapin
        driver.manage().window().maximize();

        //3) Driver'in sayfanin yüklenmesi için 10.000 milisaniye beklemesini ayarlayin
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        //4) getir.com adresine gidin
        driver.get("https://www.getir.com/");

        //5) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
        String actualTitle=driver.getTitle();
        System.out.println("Sayfanin Title'i : "+actualTitle);

        //6) web sayfasinin url'ini alin ve ekrana yazdirin
        String actualUrl=driver.getCurrentUrl();
        System.out.println("Sayfanin URL'si : "+actualUrl);

        //7) web sayfasinin title'inin "getir" icerdigini kontrol edin
        if (actualTitle.contains("getir")) {
            System.out.println("Sayfanin Title'i 'getir' iceriyor");
        } else {
            System.out.println("Sayfanin Title'i 'getir' icermiyor");
        }

        //8) "https://www.gittigidiyor.com" adresine gidin
        driver.navigate().to("https://www.gittigidiyor.com");

        //9) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
        String actualTitle2=driver.getTitle();
        System.out.println("Yeni sayfanin Title'i : "+actualTitle2);

        //10) web sayfasinin url'ini alin ve ekrana yazdirin
        String actualUrl2=driver.getCurrentUrl();
        System.out.println("Yeni sayfanin URL'si : "+actualUrl2);

        //11) Title'in Gittigidiyor icerdigini kontrol edin.
        if (actualTitle2.contains("Gittigidiyor")) {
            System.out.println("Yeni sayfanin Title'i 'Gittigidiyor' iceriyor");
        } else {
            System.out.println("Yeni sayfanin Title'i 'Gittigidiyor' icermiyor");
        }

        //12) "https://www.getir.com/" sayfasina geri don.
        driver.navigate().back();

        //13) sayfayi yenileyin
        driver.navigate().refresh();

        //14) onceki sayfaya don
        driver.navigate().forward();

        driver.close();
}
}