package com.fox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WebDriver mfDriver = new FirefoxDriver();
        RandomEmailCreation newMail = new RandomEmailCreation(mfDriver);

        try {
            newMail.createFakeEmail(mfDriver);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            PsAccCreation ps = new PsAccCreation(newMail , mfDriver);
            ps.psCreateProcess(mfDriver);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
