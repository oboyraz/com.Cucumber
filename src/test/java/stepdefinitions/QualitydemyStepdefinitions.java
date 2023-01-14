package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Then("ilk sayfa login linkine click yapar")
    public void ilk_sayfa_login_linkine_click_yapar() {

        qualitydemyPage.loginButton.click();
    }
    @Then("kullanici kutusuna {string} yazar")
    public void kullanici_kutusuna_yazar(String username) {

        qualitydemyPage.emailArea.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("password kutusuna {string} yazar")
    public void password_kutusuna_yazar(String password) {

        qualitydemyPage.passwordArea.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qualitydemyPage.submitLoginButton.click();
    }
    @Then("basarili giris yapildigini test eder")
    public void basarili_giris_yapildigini_test_eder() {
        Assert.assertTrue(qualitydemyPage.myCoursesText.isDisplayed());
    }

    @And("cookie click yapilir")
    public void cookieClickYapilir() {
        qualitydemyPage.cookie.click();
    }
}
