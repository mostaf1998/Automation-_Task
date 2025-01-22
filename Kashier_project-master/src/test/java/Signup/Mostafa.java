package Signup;

import Pages.Page_signup;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mostafa {
    WebDriver driver = null;
    Page_signup page = new Page_signup();

    @Test
    public void signup1() {
        page.name(driver).sendKeys("Eng Mostafa Mostafa");
        page.store(driver).sendKeys("Amazone");
        page.register(driver).click();
        page.phone(driver).sendKeys("01229902545");
        page.email(driver).sendKeys("mostafaelsayed3030@outlook.com");
        page.password1(driver).sendKeys("Mostafa1998199888@");
        page.password2(driver).sendKeys("Mostafa1998199888@");
        page.signup(driver).click();
        page.signup(driver).click();
        page.signup(driver).click();



        //Assertion1
        Assert.assertEquals(driver.getCurrentUrl(), "https://merchant.kashier.io/signup", "True");


    }

}
