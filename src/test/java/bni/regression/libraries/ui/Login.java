package bni.regression.libraries.ui;

import bni.regression.libraries.common.CaptureScreenShot;
import bni.regression.libraries.common.LaunchBrowser;

import java.util.concurrent.TimeUnit;

public class Login {
    private bni.regression.pageFactory.Login login;
    private CaptureScreenShot captureScreenShot = new CaptureScreenShot(LaunchBrowser.driver);
    public void loginToBni() throws Exception{
        LaunchBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        login = new bni.regression.pageFactory.Login(LaunchBrowser.driver);
        login.enterBniUserName();
        login.enterBniPassword();
        login.clickBniSignInButton();
        captureScreenShot.takeSnapShot(LaunchBrowser.driver);
        TimeUnit.SECONDS.sleep(6);
    }
}