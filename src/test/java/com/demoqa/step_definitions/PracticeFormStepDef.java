package com.demoqa.step_definitions;

import com.demoqa.pages.PracticeFormPage;
import com.demoqa.utilities.BrowserUtils;
import com.demoqa.utilities.ConfigurationReader;
import com.demoqa.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class PracticeFormStepDef {
    WebDriver driver;

    @Given("the student is on the practice form page")
    public void the_student_is_on_the_practice_form_page() {

        String url1 = ConfigurationReader.get("url1");

        Driver.get().get(url1);

        String actualTitle = Driver.get().getCurrentUrl();

        Assert.assertTrue(actualTitle.contains("practice-form"));
  }

    @Given("the student should be able to enter all details into inboxes using following information")
    public void the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(Map<String, String> table) {

        new PracticeFormPage().firstName.sendKeys(table.get("First Name"));
        new PracticeFormPage().lastName.sendKeys(table.get("Last Name"));
        new PracticeFormPage().userEmail.sendKeys(table.get("Email"));
        new PracticeFormPage().userNumber.sendKeys(table.get("Mobile"));

        new PracticeFormPage().dateOfBirthInput.click();
        Driver.get().findElement(By.xpath("//select/option[.='March']")).click();
        Driver.get().findElement(By.xpath("//select/option[.='1982']")).click();
        Driver.get().findElement(By.xpath("//div/div[@aria-label='Choose Wednesday, March 17th, 1982']")).click();

        new PracticeFormPage().subjectsInput.sendKeys(table.get("Subjects"));
        new PracticeFormPage().currentAddress.sendKeys(table.get("Current Address"));
    }
    @Then("the student should be able to select gender {string} and hobbies {string}")
    public void the_student_should_be_able_to_select_gender_and_hobbies(String string, String string2) {

        if(string.equals("Male")) {
            new PracticeFormPage().genderRadio1.click();
        }else  if(string.equals("Female")) {
            new PracticeFormPage().genderRadio2.click();
        }else
            new PracticeFormPage().genderRadio3.click();

        if(string2.equals("Sports")) {
            new PracticeFormPage().hobbiesCheckbox1.click();
        }else  if(string2.equals("Reading")) {
            new PracticeFormPage().hobbiesCheckbox2.click();
        }else
            new PracticeFormPage().hobbiesCheckbox3.click();
    }

    @Then("The student should able to upload a picture")
    public void the_student_should_able_to_upload_a_picture() {

        String projectPath = System.getProperty("user.dir");

        String filePath = "src/test/resources/picture.png";

        String fullPath = projectPath + "/" + filePath;

        new PracticeFormPage().uploadPicture.sendKeys(fullPath);
        BrowserUtils.waitFor(2);
    }
    @Then("select state {string} and city {string}")
    public void select_state_and_city(String stateName, String cityName) {
        WebElement element1;
        String locator1 = "//div[starts-with(@id,'react-select-3-option-')][text()='" + stateName + "']";
        BrowserUtils.scrollToElement(new PracticeFormPage().state);
        new PracticeFormPage().state.click();
        System.out.println(new PracticeFormPage().stateMenu.getAttribute("outerHTML"));
        element1 = Driver.get().findElement(By.xpath(locator1));
        System.out.println(element1.getText());
        BrowserUtils.waitFor(2);
        element1.click();

        WebElement element2;
        String locator2 = "//div[starts-with(@id,'react-select-4-option-')][text()='" + cityName + "']";
        BrowserUtils.scrollToElement(new PracticeFormPage().city);
        new PracticeFormPage().city.click();
        System.out.println(new PracticeFormPage().stateMenu.getAttribute("outerHTML"));
        element2 = Driver.get().findElement(By.xpath(locator2));
        System.out.println(element2.getText());
        BrowserUtils.waitFor(2);
        element2.click();
    }
    @Then("The student should be able to submit")
    public void the_student_should_be_able_to_submit() {
        new PracticeFormPage().submit.click();
        BrowserUtils.waitFor(3);
    }
    @Then("message Thanks for submitting the form should be displayed on new popup")
    public void message_Thanks_for_submitting_the_form_should_be_displayed_on_new_popup() {

        Assert.assertEquals("Thanks for submitting the form", new PracticeFormPage().alert.getText());
        new PracticeFormPage().closeLargeModal.click();
    }
    @Then("The student should be able to submit after cleaning one mandatory info")
    public void the_student_should_be_able_to_submit_after_cleaning_one_mandatory_info() {

        BrowserUtils.waitFor(3);
        new PracticeFormPage().userEmail.clear();
        new PracticeFormPage().submit.click();
        BrowserUtils.waitFor(3);
    }
    @Then("Message will not be displayed if mandatory fields have not been entered correctly")
    public void message_will_not_be_displayed_if_mandatory_fields_have_not_been_entered_correctly() {

        Assert.assertFalse(new PracticeFormPage().alert.isEnabled());
    }
}