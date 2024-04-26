import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Register {
    /*
    public static  void main(String[] args) throws InterruptedException {
    }
*/
   WebDriver driver ;
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
    public void valid() {
        RegisterPage register = new RegisterPage();

        //test1
        register.registersteps(driver, "alaaa", "haammad", "w760@gmail.com", "12345667", "123456", "123456");

        //test2
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/success");

        //test3
        Assert.assertTrue(driver.findElement(By.id("content")).getText().contains("Your Account Has Been Created!"), "error in success test!!");

        driver.findElement(By.cssSelector("a[class=\"btn btn-primary\"]")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://tutorialsninja.com/demo/index.php?route=account/account");


    }
    RegisterPage register = new RegisterPage();
    @Test
    public void invalidName() {

        //test firstname empty
        register.registersteps(driver, "", "hammad", "27q3@gmail.com", "12345667", "123456", "123456");
        Assert.assertEquals(register.emptyFName(driver).getText(), "First Name must be between 1 and 32 characters!");


        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test lastname empty
        register.registersteps(driver, "mena", "", "af677@gmail.com", "12345667", "123456", "123456");
        Assert.assertEquals(register.emptyLName(driver).getText(), "Last Name must be between 1 and 32 characters!");

    }

    @Test
    public void invalidEmail() {

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test email not valid
        register.registersteps(driver, "mena", "mohsen", "", "12345667", "123456", "123456");
        Assert.assertEquals(register.emptyemail(driver).getText(), "E-Mail Address does not appear to be valid!");

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test email already exist
        register.registersteps(driver, "mena", "mohsen", "hammadalaa989@gmail.com", "12345667", "123456", "123456");
        Assert.assertEquals(register.emailExist(driver).getText(), "Warning: E-Mail Address is already registered!");

    }

    @Test
    public void invalidTel() {

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test telephone empty
        register.registersteps(driver, "mena", "mohsen", "dz5797@gmail.com", "", "123456", "123456");
        Assert.assertEquals(register.emptytel(driver).getText(), "Telephone must be between 3 and 32 characters!");


    }

    @Test
    public void invalidPassword() {

        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test password empty
        register.registersteps(driver, "mena", "mohsen", "f477@gmail.com", "123456", "", "123456");
        Assert.assertEquals(register.emptypassword(driver).getText(), "Password must be between 4 and 20 characters!");


        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");

        //test password comfirm empty
        register.registersteps(driver, "mena", "mohsen", "az179@gmail.com", "123456", "1234567", "");
        Assert.assertEquals(register.emptycomfirm(driver).getText(), "Password confirmation does not match password!");
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
