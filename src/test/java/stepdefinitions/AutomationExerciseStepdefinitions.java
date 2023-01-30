package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();
    String userEmail;
    String userName;
    Faker faker = new Faker();
    String password;


    @And("user sign up linkine tiklar")
    public void userSignUpLinkineTiklar() {
        automationExercisePage.signUpLink.click();
    }
    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        userEmail = faker.internet().emailAddress();
        userName = faker.name().firstName();

        automationExercisePage.nameBox.sendKeys(userName);
        automationExercisePage.emailBox.sendKeys(userEmail);
        ReusableMethods.delay(2);

    }
    @Given("Create an account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationExercisePage.signUpButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        password = faker.internet().password();
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationExercisePage.mrRadioButton)
                .sendKeys(Keys.TAB)
                .sendKeys(userName)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(userName)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("06123")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automationExercisePage.createAccount.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationExercisePage.accountCreatedText.isDisplayed());
    }

}
