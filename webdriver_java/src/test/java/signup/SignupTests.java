package signup;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
public class SignupTests extends BaseTests {

    @Test
    public void testSuccessfulSignup(){
        homePage.clickSignupButton();
        homePage.setFirstName("ahmed");
        homePage.setLastName("mohsen");
        homePage.setEmail("mohsen@xyz.com");
        homePage.setPhone("0112468101");
        homePage.setPassword("Mohsen0112468101!");
        homePage.clickAgreeToPolicy();
        homePage.clickCreateAccountButton();
        System.out.println(homePage.getOTPMessageText());

        assertTrue(homePage.getOTPMessageText()
                 .contains("Please enter the OTP to verify your phone number"),
                "Failure");
    }
}
