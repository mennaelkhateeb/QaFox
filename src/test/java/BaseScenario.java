//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.*;
//
//public class BaseScenario {
//   public WebDriver driver;
//
//
//    @BeforeClass
//    public void openBrowser() {
//        String chromePath = "E:\\ITI\\automation_project\\src\\main\\resources\\chrome-win64";
//        // String chrome=System.getProperty("chrome.user.dir");
//        System.setProperty("webDriver.chrome.driver", chromePath);
//        driver = new ChromeDriver();
////        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
////        driver.manage().window().maximize();
//
//    }
//
//    @AfterClass
//    public void closeDriver(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//    }
//}
