package Life360;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyTextFeelFreeTogetherKrushival {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\krush\\Downloads\\Automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.qa.life360.com/intl/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        String actuvalText = driver.findElement(By.xpath("/html/body/main/section[1]/div[1]/h1")).getText();
        String originalText = "Feel free, together.";

        if(actuvalText.equals(originalText)) {
            System.out.println("Test Passes and same text displayed");
        }else {
            System.out.println("Test case failed same text not displayed");
        }


    }


}
