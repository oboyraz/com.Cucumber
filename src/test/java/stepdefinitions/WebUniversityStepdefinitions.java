package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();
    String firstPageHandleValue;
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

    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {

    }
    @Then("login butonuna tiklar")
    public void login_butonuna_tiklar() {

    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {

    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

    }
    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {

    }
}
