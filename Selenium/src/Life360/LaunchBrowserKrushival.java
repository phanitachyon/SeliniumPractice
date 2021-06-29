package Life360;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserKrushival {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\krush\\Downloads\\Automation\\chromedriver\\chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.co.in");
        driver.close();
    }

}


