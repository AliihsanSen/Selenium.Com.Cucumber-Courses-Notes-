package stepDefinitions;

import io.cucumber.java.en.And;
import pages.GuruPage;

public class GuruStepDefinition {

    GuruPage guruPage = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String baslik) {

        for (int i = 0; i < guruPage.basliklar.size(); i++) {

            int index = 0;
            if (guruPage.basliklar.get(i).getText().equals(baslik)) {
                System.out.println(guruPage.basliklar.get(i).getText());
                index = i + 1;
            }
        }

    }

}
