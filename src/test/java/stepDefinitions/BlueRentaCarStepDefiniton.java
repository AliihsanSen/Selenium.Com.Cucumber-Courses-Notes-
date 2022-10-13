package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCarStepDefiniton {

    BrcPage brcPage = new BrcPage();

    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {

        Driver.getDriver().get(ConfigReader.getProperties("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.login.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.email.sendKeys("username");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        brcPage.password.sendKeys("password");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.passwordlogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.basarisizGiris.isDisplayed());
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Given("kullanici {string} ana sayfasinda")
    public void kullaniciAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperties(istenenUrl));
    }

}
