package tests.day15_TestNGReports_dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import javax.naming.spi.NamingManager;

public class C02_RaporluNutellaTesti extends TestBaseRapor {


    @Test
    public void raporluTest(){

        //https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //Click Here butonuna basın.
        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        //Acilan yeni pencerenin sayfa başlığının (title) "New Window" oldugunu dogrulayin.
        ReusableMethods.switchToWindow("New Window");
        String expectedTittle="New Window";
        String actualTittle=Driver.getDriver().getTitle();
        Assert.assertEquals(actualTittle,expectedTittle);
        // sayfalari kapatin
        Driver.quitDriver();


    }

}
