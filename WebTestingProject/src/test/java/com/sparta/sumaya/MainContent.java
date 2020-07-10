package com.sparta.sumaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MainContent {
    WebDriver webDriver;
    By signIn = new By.ByClassName("btn btn-primary");

    public MainContent(WebDriver webDriver) {
        webDriver.manage().window();
        webDriver.get("http:\\localhost:9292");
        this.webDriver = webDriver;

    }

    public MainContent openWelcomePage() {
        return this;
    }

    public void typeFirstName() {
        webDriver.findElement(By.id("firstName")).sendKeys("sumaya");
//        //webDriver.findElement(firstName).click();
//        String actualName = webDriver.findElement(By.id("firstName")).getText();
//        String name =
//        return new FirstNameBar(webDriver);
    }

    public void typeLastName() {
        webDriver.findElement(By.id("lastName")).sendKeys("Mahamed");
    }

    public boolean typeAge() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[3]/div/div")).isEnabled();
    }
    public void typeDegree(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[7]/div/input")).sendKeys("engineering");
    }
    public void typeFirstAddress(){
        webDriver.findElement(By.id("inputAddress")).sendKeys("1234 main street");
    }
    public void typeSecondAddress(){
        webDriver.findElement(By.id("inputAddress2")).sendKeys("4321 major street");
    }

    public void typeCity(){
        webDriver.findElement(By.id("inputCity")).sendKeys("London");
    }
    public void typePostcode(){
        webDriver.findElement(By.id("inputPostcode")).sendKeys("E8");
    }
    public void typeEmailAddress(){
        webDriver.findElement(By.id("inputemailaddress")).sendKeys("selenium@cucumber.gherkin");
    }
    public void typeSkills(){
        webDriver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("i can ice skate");
    }
    public void typePhoneNumber(){
        webDriver.findElement(By.id("exampleFormControlInput1")).sendKeys("432112345");
    }
    public void clickAgreeToTerms(){
       webDriver.findElement(By.id("terms")).click();
    }
    public void enterGender(){
        Actions actions = new Actions(webDriver);
        //WebElement male =  webDriver.findElement(By.id("customRadioInline1"));
        WebElement female = webDriver.findElement(By.id("customRadioInline2"));
        //actions.moveToElement(male).click().perform();
        actions.moveToElement(female).click().perform();

    }
    public void enterStream(){
        Actions actions = new Actions(webDriver);
        //WebElement SDET =  webDriver.findElement(By.id("streamRadioInline1"));
        WebElement DevOps = webDriver.findElement(By.id("streamRadioInline2"));
        //webDriver.manage().timeouts().implicitlyWait(15 ,TimeUnit.SECONDS);
        //actions.moveToElement(SDET).click().perform();
        actions.moveToElement(DevOps).click().perform();
    }
    public void chooseUni(){
        Select university = new Select(webDriver.findElement(By.id("inputUni")));
        //university.selectByVisibleText("University of Roehampton");
        university.selectByIndex(4);
    }
    public void chooseCounty(){
        Select county = new Select(webDriver.findElement(By.id("inputCounty")));
        county.selectByVisibleText("Bristol");
        //county.selectByIndex(4);
    }
    public void typeLinkedInURL(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[17]/div/input")).sendKeys("www.linkedin.com/in/sumaya-abdalle-mahamed");
    }
    public void selectDateOfBirth(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[4]/div/input")).sendKeys("12/01/1990");
    }

}
