package com.sparta.sumaya;

import org.openqa.selenium.WebDriver;

public class SignInPage {
    WebDriver webDriver;

    public SignInPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }
    public String getSignInUrl(){
        return webDriver.getCurrentUrl();
    }
}
