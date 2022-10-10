package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("Kullanici {string} sayfasina gittiğini test eder.")
    public void kullaniciSayfasinaGittiğiniTestEder(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
}
