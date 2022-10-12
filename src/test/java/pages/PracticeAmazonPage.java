package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PracticeAmazonPage {

    public PracticeAmazonPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
