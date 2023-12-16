package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SauceDemoPage;

public class SauceDemoStepdefinition {

    SauceDemoPage sauceDemoPage = new SauceDemoPage();

    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String username) {
        sauceDemoPage.usernameKutusu.sendKeys(username);
    }

    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String password) {
        sauceDemoPage.passWordKutusu.sendKeys(password);
    }

    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
        sauceDemoPage.loginButonu.click();
    }

    String ilkUrunAdi;

    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
        ilkUrunAdi = sauceDemoPage.ilkUrunElementi.getText();
    }

    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
        sauceDemoPage.addToCartElementi.click();
    }

    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        sauceDemoPage.sepetElementi.click();
    }

    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {
        String sepeteEkliUrunAdi = sauceDemoPage.sepeteEklenmisUrunElementi.getText();
        Assert.assertEquals(ilkUrunAdi,sepeteEkliUrunAdi );
    }
}
