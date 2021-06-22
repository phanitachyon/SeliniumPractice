package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class VerifyGooglePlayStoreButtonIsDisplayed {

    public void test1() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\MohanSai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS) ;
        boolean googleplayStroreIsDisplayed=driver.findElement(By.xpath("//html/body/main/section[1]/div[1]/div/a[2]/img[@class=\"op-download-img googleplay-download\"]")).isDisplayed();

        if(googleplayStroreIsDisplayed==true) {
            System.out.println("google play store button is Displayed");
        }else {
            System.out.println("google play store Button is not Displayed");
            driver.close();

        }
    }
}

