package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidateGooglePlayStoreButtonIsDisplayedKrushival {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\krush\\Downloads\\Automation\\chromedriver\\chromedriver.exe");

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        boolean GoogleplayStroreIsDisplayed=driver.findElement(By.xpath("/html/body/main/section[1]/div[1]/div/a[2]//img[@class=\"op-download-img googleplay-download\"]")).isDisplayed();

        if(GoogleplayStroreIsDisplayed==true) {
            System.out.println("Google play store button is Displayed");
        }else {
            System.out.println("Google play store Button is not Displayed");
        }
    }
}
