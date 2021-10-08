package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        // parent>child>sibling = ebeveyn>cocuk>kardes

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // maximize etemizin sebebi bazi yazilar kucuk ekranda gozukmez
        // tam ekran yapinca ortaya cikar bunun icin kodlarin saglikli calisabilmesi icin once buyutmemiz gerekir

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // x.path i direkt almamiz ilerde kodun degistirilmesi halinde bize problem cikarabilir
        // bunun onune gecmek icin obsolute xpath yerine relative xpath kullaniriz.
        // bunun icin tagname+attribute ismi+attribute degeri bizim icin onemlidir. bu ucunu kullanarak cogu elementi
        // unique olarak bulabiliriz bunu bulmak icin inceleme de arama yerinden //input[@type='text'] yazariz
        // burada tagName=input, attribute ismi=type ve attribute degeri=text tir. //...[@...='...'] kalip bu sekilde kullanilir
        // aynisindan birden fazla cikarsa tamamini parantez icine alarak index kullanarak yazabiliriz.
        // mesela bundan iki tane varsa (//input[@type='text'])[2] seklinde yazarak ikincisine ulasmis oluruz.
        // //tagName[@attributeName='attributeValue'] bu yapi bizler icin cok onemlidir.

        // 2- Add Element butonuna basin
         WebElement addButonu= driver.findElement(By.tagName("button")); // tagName tek oldugu icin direkt By.tagName ile locate edebiliriz
        // WebElement addButonu= driver.findElement(By.xpath("//button")); // button tek oldugu icin sadece onu kulanabiliriz
        // WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        // WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']")); //
        // WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        // ustte yazilanlarin hepsi aynidir, farketmez ama en sadesini kullanmak daha guzeldir.
        // hoca ikinci siradakini tavsiye etti.
        addButonu.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()) { // isDisplayed== gorunuyorsa anlamindadir.
            System.out.println("Delete butonu testi PASS");
        } else {
            System.out.println("Delete butonu testi FAILED");
        }

        // 4- Delete tusuna basin
        deleteButonu.click();

        // 5- Delete butonunun gorunur olmadigini test edin
        // eger butona bastigimizda HTML kodundaki satir da siliniyorsa
        // driver in o elemente ulasmasi mumkun olmayacagindan
        // varligini ya da yoklugunu test etmemiz mumkun olmaz.
        // varolan bir element bu sekilde silindikten sonra locate etmeye calisirsak
        // StaleElementReferanceException exceptionu aliriz.
        // boyle bir eleman vardi ama su anda yok anlaminda bir hatadir.

        /*
        if (!deleteButonu.isDisplayed()) {
            System.out.println("Delete butonu gorunmuyor testi PASS");
        } else {
            System.out.println("Delete butonu gorunmuyor testi FAILED");
        }
        */

    }
}
