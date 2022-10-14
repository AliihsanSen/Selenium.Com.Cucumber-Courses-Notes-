package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class WebDriverStepDefinition {
    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String arg0) {
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String arg0) {
    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
    }

    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {
    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
    }
}