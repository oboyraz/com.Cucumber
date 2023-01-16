package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;

public class EditorStepdefinitions {
    EditorPage editorPage = new EditorPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    editorPage.newButton.click();
    }
    @Then("firstname kutusuna {string} yazar")
    public void firstname_kutusuna_yazar(String firstName) {
    editorPage.firstName.sendKeys(firstName);
    }
    @Then("lastname kutusuna {string} yazar")
    public void lastname_kutusuna_yazar(String lastName) {
    editorPage.lastName.sendKeys(lastName);
    }
    @Then("position kutusuna {string} yazar")
    public void position_kutusuna_yazar(String position) {
    editorPage.position.sendKeys(position);
    }
    @Then("office kutusuna {string} yazar")
    public void office_kutusuna_yazar(String office) {
    editorPage.office.sendKeys(office);
    }
    @Then("extension kutusuna {string} yazar")
    public void extension_kutusuna_yazar(String extension) {
    editorPage.extension.sendKeys(extension);
    }
    @Then("start date kutusuna {string} yazar")
    public void start_date_kutusuna_yazar(String startDate) {
    editorPage.startDate.sendKeys(startDate);
    }
    @Then("salary kutusuna {string} yazar")
    public void salary_kutusuna_yazar(String salary) {
    editorPage.salary.sendKeys(salary);
    }
    @Then("create tusuna basar")
    public void create_tusuna_basar() {
    editorPage.createButton.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstName) {
    editorPage.searchText.sendKeys(firstName);
    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstName) {
    String[] result = editorPage.searchResult.getText().split(" ");
    Assert.assertEquals(result[0],firstName);
    }

}
