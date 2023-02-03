package tests;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TeamProcure;
import utilities.ConfigReader;
import utilities.Driver;

public class Sign_Up_ {

   TeamProcure teamProcure=new TeamProcure();



   @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("teamProcureUrl"));

      teamProcure.signUp.click();

      //teamProcure.eMail.sendKeys(ConfigReader.getProperty("eMail"));

       Faker faker=new Faker();
     String fakeMail=faker.internet().emailAddress();
     teamProcure.eMail.sendKeys(fakeMail);

      teamProcure.password.sendKeys(ConfigReader.getProperty("password"));

      teamProcure.passwordConfirmation.sendKeys(ConfigReader.getProperty("password"));

      teamProcure.checkbox.click();
      Thread.sleep(2000);

      teamProcure.register.click();
      Thread.sleep(2000);


      teamProcure.name.sendKeys(ConfigReader.getProperty("name"));

      teamProcure.companyName.sendKeys(ConfigReader.getProperty("company"));

      //teamProcure.phoneNumber.sendKeys(ConfigReader.getProperty("phone"));
       teamProcure.phoneNumber.sendKeys(faker.phoneNumber().cellPhone());

       WebElement ddm=Driver.getDriver().findElement(By.xpath("//*[@id='companySize']"));
       Select select=new Select(ddm);
       select.selectByValue("6-25");


       teamProcure.title.sendKeys(ConfigReader.getProperty("title"));

       teamProcure.next.click();

       teamProcure.requestManagement.click();

       teamProcure.rfq.click();
       Thread.sleep(2000);

       teamProcure.next2.click();
       Thread.sleep(2000);



       teamProcure.europanStandarts.click();

       teamProcure.next2.click();
       Thread.sleep(2000);



       teamProcure.complete.click();
       Thread.sleep(2000);

       String expectedTitle="Dashboard - TeamProcure";
       String actualTitle=Driver.getDriver().getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));


    }



}
