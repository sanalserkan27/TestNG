package tests.day14_testNgFramework_xmlFiles;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class deneme11  {


    @Test
    public void cokluNegatifLoginTesti(){

        // amazon anasayfaya gıdın
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // lıste olarak verilen kullanıcı adı ve sıfrelerı ıle
        //gırıs yapılamadıgını test edın

        // ilk logın lınkıne tıklayın
        QdPage qdPage= new QdPage();
        qdPage.ilkLoginLinki.click();

        // kullanıcı adı ve sıfersını yazıp gırıs yapmayı deneyın
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("kullaniciAdiAhmet"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("password"));
        qdPage.loginButonu.click();

        // gırıs yapılamadıgını test edın
        Assert.assertTrue(qdPage.basariliGirisKontrolElementi.isDisplayed());

        // sayfayı kapatın
        Driver.closeDriver();
    }
}
