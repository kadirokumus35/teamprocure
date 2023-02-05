package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TeamProcure;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class HappyTest extends TestBaseRapor {

   TeamProcure teamProcure=new TeamProcure();
    Faker faker=new Faker();


   @Test
   public void Sign_Up() throws IOException, InterruptedException {
       hedefUrlAdreseGidildi();
       extentTest.info("cloud.teamprocure url adresine gidildi");
       hesapOlusturmaEkraniAcildi();
       extentTest.info("Hesap olusturma ekrani acildi");
       birinciAdimdakiAlanlarDolduruldu();
       extentTest.info("Register sayfasindaki gerekli alanlar dolduruldu");
       ikinciAdimdaIstenilenModullerSecildi();
       extentTest.info("Istenilen secenekler belirlenerek isaretlendi");
       ucuncuAdimdaOlcuVeParaBirimleriSecildi();
       extentTest.info("Istenilen olcu ve para birimi standartlari secildi");
       dorduncuAdimdaIstenilenlerDavetEdildi();
       extentTest.info("Sign-up tamamlandi");

       signUpYapilipDashboardEkraniDogrulandi();
       extentTest.info("Basarili bir sekilde Sign-up saglanip dashboard ekraninin acildigi dogrulandi");
    }






    private void hedefUrlAdreseGidildi() throws IOException {
        extentTest=extentReports.createTest("happyTest","pozitif login test");
        Driver.getDriver().get(ConfigReader.getProperty("teamProcureUrl"));
        ReusableMethods.waitForVisibility(teamProcure.signUp,5);
        ReusableMethods.getScreenshot("hedef sayfaya gidildi");

    }

    private void hesapOlusturmaEkraniAcildi() throws IOException {
        teamProcure.signUp.click();
        ReusableMethods.getScreenshot("Sign-up sayfasi acildi");
        extentTest.info("Sign-up butonuna tiklandi");


        //teamProcure.eMail.sendKeys(ConfigReader.getProperty("eMail"));

        String fakeMail=faker.internet().emailAddress();
        teamProcure.eMail.sendKeys(fakeMail);
        extentTest.info("E-Mail adresi olusturuldu ve yazildi");

        teamProcure.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Kriterlere uygun password girisi yapildi");

        teamProcure.passwordConfirmation.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Password onayi icin ayni karakterlerle giris yapildi");

        teamProcure.checkbox.click();
        extentTest.info("Hizmet sartlari ve gizlilik politikasi kabul edildi");
        ReusableMethods.waitForVisibility(teamProcure.register,5);

        teamProcure.register.click();
        extentTest.info("Register butonuna tiklandi");
        ReusableMethods.waitFor(3);

    }
    private void birinciAdimdakiAlanlarDolduruldu() throws IOException {
        ReusableMethods.getScreenshot("Register sayfasi acildi");
        ReusableMethods.waitFor(3);
        teamProcure.name.sendKeys(ConfigReader.getProperty("name"));


        teamProcure.companyName.sendKeys(ConfigReader.getProperty("company"));

        //teamProcure.phoneNumber.sendKeys(ConfigReader.getProperty("phone"));
        teamProcure.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

        WebElement ddm=Driver.getDriver().findElement(By.xpath("//*[@id='companySize']"));
        Select select=new Select(ddm);
        select.selectByValue("6-25");


        teamProcure.title.sendKeys(ConfigReader.getProperty("title"));

        ReusableMethods.getScreenshot("Register sayfasindaki gerekli alanlar dolduruldu");
        teamProcure.next.click();

    }
    private void ikinciAdimdaIstenilenModullerSecildi() throws  IOException {
        teamProcure.requestManagement.click();

        teamProcure.rfq.click();

        teamProcure.warehouse.click();

        ReusableMethods.getScreenshot("Secimler yapildi");
        ReusableMethods.waitFor(2);
        teamProcure.next2.click();

    }
    private void ucuncuAdimdaOlcuVeParaBirimleriSecildi() throws IOException {

        teamProcure.europanStandarts.click();

        ReusableMethods.getScreenshot("İstenilen standartlar secildi");
        teamProcure.next2.click();
        ReusableMethods.waitFor(2);
    }
    private void dorduncuAdimdaIstenilenlerDavetEdildi() throws IOException {
        teamProcure.complete.click();

        ReusableMethods.getScreenshot("Sign-up tamamlandi");
        ReusableMethods.waitFor(2);
    }
    private void signUpYapilipDashboardEkraniDogrulandi() throws IOException, InterruptedException {
        String expectedTitle="Dashboard - TeamProcure";
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        ReusableMethods.getScreenshot("Dashboard ekrani acildi");


        Thread.sleep(5000);
        Driver.closeDriver();
    }

}
