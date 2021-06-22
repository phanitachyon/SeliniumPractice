package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class NavigateToGooglePlayStore {

    //public static void main(String[] args) {
    @Test
    public void navigateToGooglePlatStore() {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\MohanSai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait = new WebDriverWait(driver,50);
        driver.findElement(By.xpath("/html/body/main/section[1]/div[1]/div/a[2]//img[@class=\"op-download-img googleplay-download\"]")).click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        boolean GooglePlayTextIsDisplayed=driver.findElement(By.xpath("//*[@id=\"gbq1\"]/div/a//img[@class=\"gb_uc\"]")).isDisplayed();
        if(GooglePlayTextIsDisplayed==true) {
            System.out.println("System is navigated to google play store page");
        }else {
            System.out.println("System is not navigated to google play store page");
            driver.close();
        }

    }}


