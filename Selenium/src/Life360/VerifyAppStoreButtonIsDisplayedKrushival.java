package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyAppStoreButtonIsDisplayedKrushival {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\krush\\Downloads\\Automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        boolean AppStroreIsDisplayed=driver.findElement(By.xpath("//html/body/main/section[1]/div[1]/div/a[1]//img[@src=\"/wp-content/themes/L360-custom/images/badge-appstore.svg\"]")).isDisplayed();

        if(AppStroreIsDisplayed==true) {
            System.out.println("App store button is Displayed");
        }else {
            System.out.println("App store Button is not Displayed");
        }
    }

}


