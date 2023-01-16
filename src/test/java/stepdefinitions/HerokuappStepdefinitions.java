package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.HerokuappPage;

import java.util.List;

public class HerokuappStepdefinitions {
    HerokuappPage herokuappPage = new HerokuappPage();
    @And("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
        herokuappPage.addElementButton.click();
    }

    @And("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
        herokuappPage.deleteButton.click();
    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {
        List<WebElement> contentList = herokuappPage.content;
        int flag=0;
        for (WebElement each: contentList) {
            if (each.getText()=="Delete"){
                flag++;
            }
        }
        Assert.assertEquals(0,flag);
    }
}
