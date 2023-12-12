package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

    private static WebDriver driver;


    public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.edge.driver", "C:\\Program Files\\EdgeDriver\\edgedriver_win64\\msedgedriver.exe");

            driver = new EdgeDriver();
        }

        return driver;

    }

    public static void  closeDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }



    }
}
