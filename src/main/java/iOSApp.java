import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.ScreenOrientation;

import java.net.URL;
import java.util.HashMap;

import org.testng.annotations.Test;

public class iOSApp {

    String userName = System.getenv("LT_USERNAME") == null ? "sunilr" : System.getenv("LT_USERNAME"); //Add username here
    String accessKey = System.getenv("LT_ACCESS_KEY") == null ? "LtQPqIWXiN4kHjRSQ9juzDmQZV7tpbssbvyEJ13JPS4QfhGduU" : System.getenv("LT_ACCESS_KEY"); //Add accessKey here
    String app_id = System.getenv("LT_APP_ID") == null ? "lt://proverbial-ios" : System.getenv("LT_APP_ID");      //Enter your LambdaTest App ID at the place of lt://proverbial-android
    String grid_url = System.getenv("LT_GRID_URL") == null ? "mobile-hub.lambdatest.com" : System.getenv("LT_GRID_URL");

    AppiumDriver driver;

    @Test
    @org.testng.annotations.Parameters(value = {"device", "version", "platform"})
    public void iOSApp1(String device, String version, String platform) {

        try {
String file=System.getenv("LT_BUILD_NAME");
            // DesiredCapabilities capabilities = new DesiredCapabilities();
            // capabilities.setCapability("build", "testbuild");
            
            // capabilities.setCapability("name", "Testname");
            // capabilities.setCapability("deviceName", "*");
            // capabilities.setCapability("platformVersion", "*");
            // capabilities.setCapability("platformName", "ios");
            // capabilities.setCapability("isRealMobile", true);
            // capabilities.setCapability("app", "lt://APP1016025931715945351094180"); //Enter your app url
            // capabilities.setCapability("network", false);
            // capabilities.setCapability("visual", true);
            // capabilities.setCapability("devicelog", true);
            //capabilities.setCapability("geoLocation", "HK");

            DesiredCapabilities capabilities = new DesiredCapabilities();
// HashMap<String, Object> ltOptions = new HashMap<String, Object>();
// ltOptions.put("w3c", true);
// ltOptions.put("build", file);
// ltOptions.put("platformName", "ios");
// ltOptions.put("deviceName", "iPhone 15");
// ltOptions.put("platformVersion", "17");
// ltOptions.put("app", "lt://APP1016053601716969413336816");
// ltOptions.put("isRealMobile", true);
// capabilities.setCapability("lt:options", ltOptions);


capabilities.setCapability("app", "lt://APP1016053601716969413336816");
capabilities.setCapability("appiumVersion", "latest");
capabilities.setCapability("build", "Azure-lambdatest-Greystar-DevOps-66057");
capabilities.setCapability("console", false);
capabilities.setCapability("deviceName", "iPhone 13 Mini");
capabilities.setCapability("device_viewport", "390 x 844");
capabilities.setCapability("devicelog", true);
capabilities.setCapability("enableNetworkThrottling", false);
capabilities.setCapability("extendedDebuging", true);
capabilities.setCapability("headless", false);
capabilities.setCapability("idleTimeout", 240);
capabilities.setCapability("isAppAutomate", true);
capabilities.setCapability("isRealMobile", true);
capabilities.setCapability("name", "SignUp-Sanity-7775026232-d1b3b0b5a80256fc626e80d313c2e09cc06d3e3d");
capabilities.setCapability("nativeWebScreenshot", true);
capabilities.setCapability("network", true);
capabilities.setCapability("newCommandTimeout", "0");
capabilities.setCapability("performance", false);
capabilities.setCapability("platformName", "ios");
capabilities.setCapability("platformVersion", "15");
capabilities.setCapability("printPageSourceOnFindFailure", true);
capabilities.setCapability("project", "Resident.AcptTest");
capabilities.setCapability("region", "us");
capabilities.setCapability("resolution", "1080 x 2340 px");
capabilities.setCapability("tunnel", false);
capabilities.setCapability("tunnelIdentifier", "");
capabilities.setCapability("userAgent", "selenium/3.141.0 (.net windows)");
capabilities.setCapability("version", "");
capabilities.setCapability("video", true);
capabilities.setCapability("visual", true);
capabilities.setCapability("w3c", false);
capabilities.setCapability("queueTimeout", 600);

            String hub = "http://" + "sunilr" + ":" + "LtQPqIWXiN4kHjRSQ9juzDmQZV7tpbssbvyEJ13JPS4QfhGduU" + "@" + "mobile-hub.lambdatest.com" + "/wd/hub";
            
            driver = new AppiumDriver(new URL(hub), capabilities);

driver.queryAppState("com.greystar.living");
driver.launchApp();
driver.rotate(ScreenOrientation.PORTRAIT);

Thread.sleep(7000);
  // driver.activateApp("com.greystar.living");
            // WebDriverWait Wait = new WebDriverWait(driver, 30);

            //Changes the color of the text
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("color"))).click();
            // Thread.sleep(1000);

            //Changes the text to "Proverbial"
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Text"))).click();
            // Thread.sleep(1000);

            // //Toast will be visible
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("toast"))).click();
            // Thread.sleep(1000);

            // //Notification will be visible
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("notification"))).click();
            // Thread.sleep(4000);

            // //Opens the geolocation page
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("geoLocation"))).click();
            // Thread.sleep(4000);

            // //Takes back
            // driver.navigate().back();

            // //Takes to speedtest page
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("speedTest"))).click();
            // Thread.sleep(4000);
            // driver.navigate().back();

            // //Opens the browser
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("Browser"))).click();
            // Thread.sleep(1000);
            // MobileElement url = (MobileElement) driver.findElementByAccessibilityId("url");
            // url.click();
            // url.sendKeys("https://www.lambdatest.com");
            // Wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.AccessibilityId("find"))).click();
            Thread.sleep(1000);
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
