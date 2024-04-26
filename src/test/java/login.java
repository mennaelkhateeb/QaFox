import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class login {
  WebDriver driver;
   loginPage login=new loginPage();


    @BeforeTest
    public void openBrowser() {
        String chromePath = "E:\\ITI\\automation_project\\src\\main\\resources\\chrome-win64";
        // String chrome=System.getProperty("chrome.user.dir");
        System.setProperty("webDriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
    }


    @Test
    public void validData(){

       driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        login.ValidEmail(driver).sendKeys("alaahammad745@gmail.com");
        login.ValidPassword(driver).sendKeys("123456");
        login.submit(driver).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://tutorialsninja.com/demo/index.php?route=account/account");

    }

    @Test
    public void invalidemail(){
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        login.ValidEmail(driver).sendKeys("45675@gmail.com");
        login.ValidPassword(driver).sendKeys("123456");
        login.submit(driver).click();
        Assert.assertEquals(login.invalidemail(driver).getText(),"Warning: No match for E-Mail Address and/or Password.");
    }

    @Test
    public void invalidPassword(){
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
        login.ValidEmail(driver).sendKeys("alaahammad745@gmail.com");
        login.ValidPassword(driver).sendKeys("1357");
        login.submit(driver).click();
        Assert.assertEquals(login.invalidpasswordd(driver).getText(),"Warning: No match for E-Mail Address and/or Password.");
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
