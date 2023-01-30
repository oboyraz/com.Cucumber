package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Guru99StepDefinitions {

    Guru99Page guru99Page = new Guru99Page();
    List<String> companyListStr;
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {

        /*
        for (WebElement webElement : companyList) {
            System.out.println(webElement.getText());
        }
        */
        List<WebElement> companyList = guru99Page.companyColumn;
        companyListStr = ReusableMethods.getElementsText(companyList);
        System.out.println(companyListStr);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @And("{string} listede oldugunu test eder")
    public void listedeOldugunuTestEder(String arananSirket) {
        Assert.assertTrue(companyListStr.contains(arananSirket));
    }
}
