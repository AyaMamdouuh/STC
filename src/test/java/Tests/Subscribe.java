package Tests;

import Pages.stc.Home;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class Subscribe extends Base.base{

    SoftAssert softAssert=new SoftAssert();

    @Test(priority = 1)
    public void allPackagesAppeareForKuwait()
    {
        stcWebSite.home=new Home(driver);
        stcWebSite.home.clickOnCountry();
        stcWebSite.home.clickOnKwait();
        softAssert.assertTrue(stcWebSite.home.getLitePackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getClassicPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPremiumPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPricePremium().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyPremium().isDisplayed());

    }
    @Test(priority = 1)
    public void allPackagesAppeareForKSA()
    {
        stcWebSite.home=new Home(driver);
        stcWebSite.home.clickOnCountry();
        stcWebSite.home.clickOnKSA();
        softAssert.assertTrue(stcWebSite.home.getLitePackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getClassicPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPremiumPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPricePremium().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyPremium().isDisplayed());

    }
    @Test(priority = 1)
    public void allPackagesAppeareForBahrain()
    {
        stcWebSite.home=new Home(driver);
        stcWebSite.home.clickOnCountry();
        stcWebSite.home.clickOnBahrain();
        softAssert.assertTrue(stcWebSite.home.getLitePackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getClassicPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPremiumPackage().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPriceClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getPricePremium().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyLite().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyClassic().isDisplayed());
        softAssert.assertTrue(stcWebSite.home.getCurrencyPremium().isDisplayed());

    }
}
