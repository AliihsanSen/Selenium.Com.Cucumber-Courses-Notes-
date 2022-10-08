package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.Driver;

import javax.swing.*;

public class AmazonStepdefinition {

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {
        Driver.getDriver().get("https://www.amazon.com");
    }

    @Then("Kullanici nutella icin arama aratir")
    public void kullaniciNutellaIcinAramaAratir() {

    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
    }

    @And("Sayfayi kapatir.")
    public void sayfayiKapatir() {
    }
}
