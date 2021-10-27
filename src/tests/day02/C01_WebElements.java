package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // email textbox a ali yazdiralim
        WebElement mailTextBox = driver.findElement(By.id("email")); // facebook da email yazilacak kutuyu sectik
        mailTextBox.sendKeys("mhmmt.yksl1@gmail.com"); // kutuya mail adresini yazdirdik

        Thread.sleep(2000); // beklettik internet yavas kaldi cunku
        mailTextBox.clear(); // yazilanlari geri temizledik
        WebElement mailKutusuTagNameIle = driver.findElement(By.tagName("input")); // mail kutusunu tagname ile sectik
        // mailKutusuTagNameIle.sendKeys("veliGocer@gmail.com");
        // input tagname ile 6 tane web element oldugundan hangisine yazacagina karar veremiyor
        // yazdigimiz element uniq yani tek olmali
        // kactaneo element oldugunu anlamak icin HTML kodlarinin oldugu yerde ctrl+f yapip // yazip yanina elementi yazinca kactane oldunu gosterir
        // web elementi buldugu icin No such element exception vermez


        // WebElement yanlisElement=driver.findElement(By.id("emailyanlis")); // hata verdikleri icin bunlari yorum haline getirdik
        // yanlisElement.sendKeys("yanlis eleman");

        // ****ONEMLI***
        // eger yanlis id locate edilirse NoSuchElementException: hatasi verir. varsa eger locator de hata vardir

        // giris yap butonuna tiklayalim
        WebElement girisButonu=driver.findElement(By.tagName("button")); //tiklamak istedigimiz yeri belirledik

        System.out.println(girisButonu.isEnabled()); // belirttigimiz butonu kullanip kullanamayacagimizi belirtiyor. true yada false dondurur

        girisButonu.click(); // bu komutla oraya tikladik



    }
}
