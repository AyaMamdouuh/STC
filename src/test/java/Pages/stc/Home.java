package Pages.stc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base.base {
    @FindBy(id="country-btn")
    WebElement country;
    @FindBy(id="bh")
    WebElement bahrain;
    @FindBy(id="sa")
    WebElement KSA;
    @FindBy(id="kw")
    WebElement kuwait;
    @FindBy(id = "name-lite")
    WebElement litePackage;

    @FindBy(id = "name-classic")
    WebElement classicPackage;

    @FindBy(id = "name-premium")

    WebElement premiumPackage;

    @FindBy(id="currency-lite")
    WebElement priceLite;
    @FindBy(id="currency-classic")
    WebElement priceClassic;
    @FindBy(id="currency-premium")
    WebElement pricePremium;
    @FindBy(xpath="//*[@id=\"currency-lite\"]/i")
    WebElement currencyLite;
    @FindBy(xpath="//*[@id=\"currency-classic\"]/i")
    WebElement currencyClassic;
    @FindBy(xpath="//*[@id=\"currency-premium\"]/i")
    WebElement currencyPremium;
    @FindBy(id="country-poppup-close")
    WebElement countryPopupClose;

    public Home(WebDriver driver) {
    }

    public void clickOnCountryPopupClose()
    {
        countryPopupClose.click();
    }
    public void clickOnCountry()
    {
        country.click();
    }
    public void clickOnKwait(){
        kuwait.click();
    }
    public void clickOnKSA(){
        KSA.click();
    }
    public void clickOnBahrain(){
        bahrain.click();
    }
    public WebElement getLitePackage()
    {
        return litePackage;
    }
    public WebElement getClassicPackage()
    {
        return classicPackage;
    }
    public WebElement getPremiumPackage()
    {
        return premiumPackage;
    }
    public WebElement getPriceLite()
    {
        return priceLite;
    }
    public WebElement getPricePremium()
    {
        return pricePremium;
    }
    public WebElement getPriceClassic()
    {
        return priceClassic;
    }
    public WebElement getCurrencyLite()
    {
        return currencyLite;
    }
    public WebElement getCurrencyClassic()
    {
        return currencyClassic;
    }
    public WebElement getCurrencyPremium()
    {
        return currencyPremium;
    }
}
