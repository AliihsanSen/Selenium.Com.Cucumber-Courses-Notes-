package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();

    @Given("Kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() {

        Driver.getDriver().get(ConfigReader.getProperties("amazonUrl"));

    }

    @Then("Kullanici nutella icin arama aratir")
    public void kullaniciNutellaIcinAramaAratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }

    @And("Sonuclarin nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String arananKelime = "Nutella";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @And("Sayfayi kapatir.")
    public void sayfayiKapatir() {
        Driver.closeDriver();

    }

    @Then("Kullanici Selenium icin arama aratir")
    public void kullaniciSeleniumIcinAramaAratir() {
        amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);

    }

    @And("Sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String arananKelime = "Selenium";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("Kullanici iphone icin arama aratir")
    public void kullaniciIphoneIcinAramaAratir() {
        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);

    }

    @And("Sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Then("Kullanici {string} icin arama aratir")
    public void kullaniciIcinAramaAratir(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime, Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperties(arananUrl));
    }

    @When("Url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String istenenUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }
}
