package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class ValidateMobileNumberErrorKrushival {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\krush\\Downloads\\Automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]")).click();
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        driver.findElement(By.xpath("//input[@class=\"button h-captcha\"]")).click();
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        String actuvalText =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@id='mobile-number-error']"))).getText();
        String originalText = "Please enter a valid mobile number";

        if(actuvalText.equals(originalText)) {
            System.out.println("Test Passes and same text displayed");
        }else {
            System.out.println("Test case failed same text not displayed");
        }
    }
}
