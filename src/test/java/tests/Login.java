package tests;

import org.testng.annotations.Test;
import pages.TeamProcure;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {

    TeamProcure teamProcure=new TeamProcure();

    @Test
    public void test02(){

        Driver.getDriver().get(ConfigReader.getProperty("teamProcureUrl"));

        teamProcure.signUp.click();

        teamProcure.loginWithGoogle.click();

        teamProcure.loginEmail.sendKeys("kdrokumus35@gmail.com");

        teamProcure.ileri.click();



    }
}
