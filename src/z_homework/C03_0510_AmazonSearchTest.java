package z_homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_0510_AmazonSearchTest {

    //1. Bir class oluşturun : AmazonSearchTest
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();

        //a.amazon web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        //b. Search(ara) “city bike”
        WebElement such=driver.findElement(By.id("twotabsearchtextbox"));
        such.sendKeys("city bike" + Keys.ENTER);

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement ergebnis=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(ergebnis.getText());

        //d. “Cityräder” e tıklayın.(Soruda Shopping var ama sayfada yok o yuzden farkli seye tiklattik)
        WebElement wahl=driver.findElement(By.xpath("//*[@id=\"n/3403981\"]/span/a/span"));
        wahl.click();

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ersteErgebnis=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img"));
        ersteErgebnis.click();
    }
}
