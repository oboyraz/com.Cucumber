package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;

import java.util.List;

public class Guru99StepDefinitions {

    Guru99Page guru99Page = new Guru99Page();
    List<WebElement> companyList = guru99Page.companyColumn;
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {


        for (WebElement webElement : companyList) {
            System.out.println(webElement.getText());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Then("DBC Bankin listede oldugunu test eder")
    public void dbc_bankin_listede_oldugunu_test_eder() {
        boolean flag = false;

        for (WebElement webElement : companyList) {
            if (webElement.getText().equals("DCB Bank")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }
}
