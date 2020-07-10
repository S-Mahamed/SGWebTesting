package com.sparta.sumaya.mystepdefs;

import com.sparta.sumaya.MainContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs {
    WebDriver webDriver = new ChromeDriver();
    MainContent mainContent = new MainContent(webDriver);
    //FirstNameBar firstNameBar;

    @Given("I am on the main contents page")
    public void iAmOnTheMainContentsPage() {
        mainContent.openWelcomePage();
    }

    @When("I type the on first name bar")
    public void iClickTheOnFirstNameBar() {
        mainContent.typeFirstName();
    }

    @And("I type the on last name bar")
    public void iTypeTheOnLastNameBar() {
        mainContent.typeLastName();
    }

    @And("I input my age")
    public void iInputMyAge() {
        Assertions.assertTrue(mainContent.typeAge());
    }

    @And("I enter my degree")
    public void iEnterMyDegree() {
        mainContent.typeDegree();
    }

    @And("I enter my first Address")
    public void iEnterMyFirstAddress() {
        mainContent.typeFirstAddress();
    }

    @And("I enter my second Address")
    public void iEnterMySecondAdress() {
        mainContent.typeSecondAddress();
    }

    @And("I enter my City")
    public void iEnterMyCity() {
        mainContent.typeCity();
    }

    @And("I enter my Postcode")
    public void iEnterMyPostcode() {
        mainContent.typePostcode();
    }

    @And("I enter my email address")
    public void iEnterMyEmailAddress() {
        mainContent.typeEmailAddress();
    }

    @And("I enter my Skills")
    public void iEnterMySkills() {
        mainContent.typeSkills();
    }

    @And("I enter my phone number")
    public void iEnterMyPhoneNumber() {
        mainContent.typePhoneNumber();
    }

    @And("I agree to the T&C")
    public void iAgreeToTheTC() {
        mainContent.clickAgreeToTerms();
    }

    @And("I enter my gender")
    public void iEnterMyGender() {
        mainContent.enterGender();
    }

    @And("I choose a Stream")
    public void iChooseAStream() {
        mainContent.enterStream();
    }

    @And("I choose a University")
    public void iChooseAUniversity() {
        mainContent.chooseUni();
    }

    @And("I choose a County")
    public void iChooseACounty() {
        mainContent.chooseCounty();
    }

    @And("I provide a LinkedIn URL")
    public void iProvideALinkedInURL() {
        mainContent.typeLinkedInURL();
    }

    @And("I enter my date of Birth")
    public void iEnterMyDateOfBirth() {
        mainContent.selectDateOfBirth();
    }

    @And("I upload a CV")
    public void iUploadACV() {
        mainContent.uploadCV();
    }

    @And("I rate my experience")
    public void iRateMyExperience() {
//        mainContent.sliderExists();
//        Assertions.assertTrue(mainContent.sliderExists());
        mainContent.selectRating();
    }
}
