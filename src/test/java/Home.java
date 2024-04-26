import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Home {
    WebDriver driver;
    HomePage home =new HomePage();

    @BeforeTest
    public void openBrowser() {
        String chromePath = "E:\\ITI\\automation_project\\src\\main\\resources\\chrome-win64";
        // String chrome=System.getProperty("chrome.user.dir");
        System.setProperty("webDriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//@Test
//public void searchBar(){
//        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
//        home.search(driver).sendKeys("laptops");
//        home.iconSearch(driver).click();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=product/search&search=laptops");
//}

    @Test
    public void Card(){
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
        home.addtocard(driver).click();
        Assert.assertTrue(home.successADD(driver).getText().contains("ADD TO CART"));
    }



    @AfterTest
    public void closeDriver(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
