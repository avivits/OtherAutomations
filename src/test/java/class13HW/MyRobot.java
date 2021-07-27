package class13HW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class MyRobot {

    private static WebDriver driver;

    public static void main(String[] args) throws AWTException {
        Robot robot = new Robot(); // creating Robot instance
        // Creates the delay of 5 sec
        robot.delay(5000);


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\IMOE001\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ynet.co.il/home/0,7340,L-8,00.html");
        //how to get to the X closing window??

        //didn't find the log to press stet menu of the com[uter
        robot.keyPress(KeyEvent.VK_BEGIN);

    }
}
