package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    String firstPageHandleValue;

    Faker faker = new Faker();
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        firstPageHandleValue = Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButton.click();
    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        String secondpageHandleValue = "";
        for (String each:windowHandles) {
            if (!each.equals(firstPageHandleValue)){
                secondpageHandleValue = each;
            }
        }
        Driver.getDriver().switchTo().window(secondpageHandleValue);
    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {
        webUniversityPage.userNameBox.sendKeys(faker.name().username());
    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.passwordBox.sendKeys(faker.internet().password());
    }
    @Then("login butonuna tiklar")
    public void login_butonuna_tiklar() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webUniversityPage.loginButton.click();
    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String actualPopUpText = Driver.getDriver().switchTo().alert().getText();
        String expectedPopUpText = "validation failed";
        Assert.assertEquals(expectedPopUpText,actualPopUpText);
    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {
        Driver.getDriver().switchTo().window(firstPageHandleValue);
    }
    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {
        Assert.assertTrue(webUniversityPage.contactUsLink.isDisplayed());
    }

    @Then("acilan tum sayfalari kapatir")
    public void acilanTumSayfalariKapatir() {
        Driver.quitDriver();
    }
}
