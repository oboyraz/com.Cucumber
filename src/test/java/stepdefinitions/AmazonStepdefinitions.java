package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("amazon arama kutusuna Nutella yazip aratir")
    public void amazon_arama_kutusuna_nutella_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        String actSearchResult = amazonPage.searchResultElement.getText();
        String expResult =  "Nutella";

        Assert.assertTrue(actSearchResult.contains(expResult));

    }

    @Then("amazon arama kutusuna Java yazip aratir")
    public void amazon_arama_kutusuna_java_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {
        String actSearchResult = amazonPage.searchResultElement.getText();
        String expResult =  "Java";

        Assert.assertTrue(actSearchResult.contains(expResult));
    }
    @Then("amazon arama kutusuna Samsung yazip aratir")
    public void amazon_arama_kutusuna_samsung_yazip_aratir() {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Samsung", Keys.ENTER);
    }
    @Then("arama sonuclarinin Samsung icerdigini test eder")
    public void arama_sonuclarinin_samsung_icerdigini_test_eder() {
        String actSearchResult = amazonPage.searchResultElement.getText();
        String expResult =  "Samsung";

        Assert.assertTrue(actSearchResult.contains(expResult));
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.closeDriver();

    }

    @Then("amazon arama kutusuna {string} yazip aratir")
    public void amazon_arama_kutusuna_yazip_aratir(String searchWord) {
        amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(searchWord, Keys.ENTER);
    }
    @Then("arama sonuclarinin {string} icerdigini test eder")
    public void arama_sonuclarinin_icerdigini_test_eder(String searchedWord) {
        Assert.assertTrue(amazonPage.searchResultElement.getText().contains(searchedWord));
    }

}
