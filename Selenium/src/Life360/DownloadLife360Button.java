package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.ArrayList;
/*
Title:DownloadLife360Button
1.Navigate to life360 website
2.click on download button
3.validate download life360 text
 */
public class DownloadLife360Button {
    @Test
    public void downloadLife360ForFree() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MohanSai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]")).click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String actuvalText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h1")).getText();
        String originalText = "Download Life360 for free";

        if(actuvalText.equals(originalText)) {
            System.out.println("Test Passes and same text displayed");
        }else {
            System.out.println("Test case failed same text not displayed");

            driver.close();
        }
    }
}

