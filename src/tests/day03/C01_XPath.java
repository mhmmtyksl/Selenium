package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/muhammetyuksel/Documents/selenium libraries/drivers/chromedriver/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        // 2- Add Element butonuna basin
         WebElement addButonu= driver.findElement(By.tagName("button"));
        // WebElement addButonu= driver.findElement(By.xpath("//button"));
        // WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        // WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        // WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        // ustte yazilanlarin hepsi aynidir, farketmez ama en sadesini kullanmak daha guzeldir.
        // hoca ikinci siradakini tavsiye etti.
        addButonu.click();

        // 3- Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        if (deleteButonu.isDisplayed()) {
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

        /*
        if (!deleteButonu.isDisplayed()) {
            System.out.println("Delete butonu gorunmuyor testi PASS");
        } else {
            System.out.println("Delete butonu gorunmuyor testi FAILED");
        }
        */

    }
}
