package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
    }
}
