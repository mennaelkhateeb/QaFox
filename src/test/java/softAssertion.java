//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
//public class softAssertion {
//    /*
//    public static  void main(String[] args) throws InterruptedException {
//
//
//    }
//*/
//    WebDriver driver=null;
//
//    @BeforeTest
//    public void openBrowser(){
//
//        String chromePath="E:\\ITI\\automation_project\\src\\main\\resources\\chrome-win64";
//        // String chrome=System.getProperty("chrome.user.dir");
//        System.setProperty("webDriver.chrome.driver",chromePath);
//
//       driver=new ChromeDriver();
//
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//        driver.manage().window().maximize();
//
//    }
//
//    @Test
//    public void validData(){
//        //enter username | password (positive)
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        //run all then find bug
//        SoftAssert soft =new SoftAssert();
//
//        //first assertion after login
//        String expected ="You logged into a secure area!";
//        String actual=driver.findElement(By.id("flash")).getText();
//        soft.assertTrue(actual.contains(expected),"first assertion");
//
//        //secound assertion for URL
//        soft.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure","secound assert");
//
//        //third assert for button login
//        soft.assertTrue(driver.findElement(By.cssSelector("a[href=\"/logout\"]")).isDisplayed(),"third assert");
//
//        soft.assertAll();
//    }
//
//    @Test
//    public void invalidData(){
//
//        //enter username | password (negative)
//        driver.findElement(By.id("username")).clear();
//        driver.findElement(By.id("username")).sendKeys("tomsmh");
//        driver.findElement(By.name("password")).sendKeys("SuperSecretPass");
//        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
//
//        //first assertion for the message display after login
//        String expected ="Your username is invalid!";
//        String actual=driver.findElement(By.id("flash")).getText();
//       Assert.assertTrue(actual.contains(expected));
//    }
//
//    @AfterTest
//    public void closeDriver(){
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.quit();
//    }
//}
//
