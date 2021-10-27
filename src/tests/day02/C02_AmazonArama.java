package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {

        // amazon sayfasina gidip java icin arama yapin ve bulunan sonuc sayisini yazdirin

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/"); // amazon sayfasina gittik

        WebElement arama=driver.findElement(By.id("twotabsearchtextbox")); // arama kutusunu id ile belirledik

        arama.sendKeys("java" + Keys.ENTER); // arama kutusuna java yazdirdik ve ENTER a bastirdik

        WebElement sonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        // sonuclarin oldugu yeri id vs ile belirleyemedik bu yuzden x.path kullanarak yerini tayin ettik

        System.out.println(sonuc.getText()); // web elementler obje oldugu icin direkt yazdirilamazlar
        // bunun sahip oldugu yaziyi yazdirmak icin getText() metodu kullanilir.


    }
}
