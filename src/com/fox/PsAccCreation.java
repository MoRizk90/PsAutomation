package com.fox;
import org.openqa.selenium.WebDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


public class PsAccCreation {
    private RandomEmailCreation theMail;



    public PsAccCreation(RandomEmailCreation theMail, WebDriver theDriver) throws AWTException {
        this.theMail = theMail;
        theDriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        System.setProperty("Webdriver.gecko.driver"," /usr/local/bin/geckodriver");
//
//
//        Robot bot = new Robot();
//        bot.keyPress(KeyEvent.VK_CONTROL);
//        bot.keyPress(KeyEvent.VK_T);
//        bot.keyRelease(KeyEvent.VK_CONTROL);
//        bot.keyRelease(KeyEvent.VK_T);


    }

    public void psCreateProcess(WebDriver theDrive){
        theDrive.get("https://id.sonyentertainmentnetwork.com/create_account/?entry=%2Fcreate_account&tp_psn=true&state=returning&disableLinks=SENLink&ui=pr&client_id=f6c7057b-f688-4744-91c0-8179592371d2&hidePageElements=SENLogo&prompt=login&redirect_uri=https%3A%2F%2Fstore.playstation.com%2Fen-us%2Fproduct%2FIP9101-NPIA90005_01-PSPLUS14DAYTRIAL%3Fsmcid%3Dps%253Aplus-marquee-jointoday-frame-version-c%253Astore-msf77008-psplusmember%253APS%252FUSPLAYSTATION%252FPLAYSTATION-PLUS&request_locale=en_US&response_type=code&scope=kamaji%3Acommerce_native%2Ckamaji%3Acommerce_container%2Ckamaji%3Alists&service_entity=urn%3Aservice-entity%3Apsn#/create_account?entry=%2Fcreate_account");

    }
}
