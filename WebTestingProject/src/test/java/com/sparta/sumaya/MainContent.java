package com.sparta.sumaya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class MainContent {
    WebDriver webDriver;

    public MainContent(WebDriver webDriver) {
        webDriver.manage().window();
        webDriver.get("http:\\localhost:9292");
        this.webDriver = webDriver;

    }

    public MainContent openWelcomePage() {
        return this;
    }

    public void typeFirstName() {
        webDriver.findElement(By.id("firstName")).sendKeys("mohamed");
    }

    public void typeLastName() {
        webDriver.findElement(By.id("lastName")).sendKeys("mohamud");
    }

    public boolean typeAge() {
        return webDriver.findElement(By.xpath("/html/body/div/form/div[3]/div/div")).isEnabled();
    }
    public void selectDateOfBirth(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[4]/div/input")).sendKeys("10-10-1999");
    }
    public void enterGender(){
        Actions actions = new Actions(webDriver);
        //WebElement male =  webDriver.findElement(By.id("customRadioInline1"));
        WebElement female = webDriver.findElement(By.id("customRadioInline2"));
        //actions.moveToElement(male).click().perform();
        actions.moveToElement(female).click().perform();
    }
    public void typeDegree(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[7]/div/input")).sendKeys("engineering");
    }
    public void chooseUni(){
        Select university = new Select(webDriver.findElement(By.id("inputUni")));
        university.selectByVisibleText("University of Roehampton");
        //university.selectByIndex(4);
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
    public void chooseCounty(){
        Select county = new Select(webDriver.findElement(By.id("inputCounty")));
       // county.selectByVisibleText("");
        county.selectByIndex(4);
    }
    public void typePostcode(){
        webDriver.findElement(By.id("inputPostcode")).sendKeys("34567");
    }
    public void typeEmailAddress(){
        webDriver.findElement(By.id("inputemailaddress")).sendKeys("selenium@cucumber.gherkin");
    }
    public void typeSkills(){
        webDriver.findElement(By.id("exampleFormControlTextarea1")).sendKeys("i can skate");
    }
    public void typePhoneNumber(){
        webDriver.findElement(By.id("exampleFormControlInput1")).sendKeys("23456789");
    }

    public void typeLinkedInURL(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[17]/div/input")).sendKeys("sumaya-mahamed");
    }
    public void clickAgreeToTerms(){
       webDriver.findElement(By.id("terms")).click();
    }
    public void uploadCV(){
        webDriver.findElement(By.xpath("/html/body/div/form/div[18]/div/input")).sendKeys("C:\\Users\\Lenovo\\Downloads\\SampleProfile.docx");
    }
    public void enterStream(){
        Actions actions = new Actions(webDriver);
        WebElement SDET =  webDriver.findElement(By.id("streamRadioInline1"));
        //WebElement DevOps = webDriver.findElement(By.id("streamRadioInline2"));
        //webDriver.manage().timeouts().implicitlyWait(15 ,TimeUnit.SECONDS);
        actions.moveToElement(SDET).click().perform();
        //actions.moveToElement(DevOps).click().perform();
    }
    public boolean sliderExists(){
//        webDriver.switchTo().frame(0); //need to switch to this frame before clicking the slider
//        WebElement slider = webDriver.findElement(By.id("experienceSlider"));
//        Actions move = new Actions(webDriver);
//        Action action = move.dragAndDropBy(slider,30,0).build();
//        action.perform();
        return webDriver.findElement(By.id("experienceSlider")).isDisplayed();
    }
//    public void selectRating(){
//
//        WebElement moveSlider = webDriver.findElement(By.id("value_for_slider"));
//        Actions actions= new Actions(webDriver);
////        webDriver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
//        actions.dragAndDropBy(moveSlider,137,1879).build().perform();
//        moveSlider.click();
//    }
//    public SignInPage goToSignIn(){
//        webDriver.manage().timeouts().implicitlyWait(15 , TimeUnit.SECONDS);
//        webDriver.findElement(signIn).click();
//        return new SignInPage(webDriver);
//    }
}
