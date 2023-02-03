package tests;

import org.testng.annotations.Test;
import pages.TeamProcure;
import utilities.ConfigReader;
import utilities.Driver;

public class Sign_Up_ {

   TeamProcure teamProcure=new TeamProcure();


   @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("teamProcureUrl"));

      teamProcure.signUp.click();

    }



}
