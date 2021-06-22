package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.ArrayList;

/*
Title:Validate Download Life360 for free Text on Download screen
1.Navigate to life360 website
2.click on download button
3.validate download life360 text
@ author mohan sai
 */
public class DownloadLife360Button {
    private String actualText;
    private String originalText="Download Life360 for free";
    @Test
    public void validateDownloadLife360ForFreeText() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MohanSai\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        // Navigate to life 360 website
        driver.get("https://www.qa.life360.com/intl/");
        // applying wait
        WebDriverWait wait=new WebDriverWait(driver,10);
        // Click on download
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]")).click();
        // Navigate to next tab
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        // Xpath for the required text
         actualText = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/h1")).getText();
         originalText = "Download Life360 for free";
         // Print output
        if(actualText.equals(originalText)) {
            System.out.println("Test Passes and same text displayed");
        }else {
            System.out.println("Test case failed same text not displayed");
        }
        // Close window
        driver.close();
        }
        }

