package com.sparta.sumaya;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTestPOM {
     static WebDriver webDriver = new ChromeDriver();
     MainContent mainContent = new MainContent(webDriver);

    @Test
    public void linkWorks() {
        mainContent.openWelcomePage();
    }
    @Test
    public void signInLinkWorks(){
        Assertions.assertEquals("http://localhost:9292/registration_complete?dob=1990-01-12&customRadioInline1=on&cv=SampleProfile.docx&streamRadioInline1=on",mainContent.openWelcomePage().goToSignIn().getSignInUrl());
    }
}
