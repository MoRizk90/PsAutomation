package com.fox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;


public class RandomEmailCreation {
    private String theCreatedEmail;

    public RandomEmailCreation(WebDriver theDriver) {
        System.setProperty("Webdriver.gecko.driver"," /usr/local/bin/geckodriver"); // setting the path of the driver


    }

    public String createFakeEmail(WebDriver theDriver) throws AWTException {
        theDriver.get("http://www.yopmail.com/en/");
        theDriver.findElement(By.xpath(" //a[@href='email-generator.php']")).click();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException e)
        {
            System.out.println("error");
        }
        System.out.println(theDriver.findElement(By.xpath("//input[@id='login']")).isDisplayed());
        this.theCreatedEmail = theDriver.findElement(By.xpath("//input[@id='login']")).getAttribute("value");

        Robot bot = new Robot();
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_T);
        bot.keyRelease(KeyEvent.VK_CONTROL);
        bot.keyRelease(KeyEvent.VK_T);

        return  theCreatedEmail;



    }
}
