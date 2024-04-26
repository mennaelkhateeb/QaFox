//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class login {
//    WebDriver driver;
//    public  login(WebDriver driver){
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }
//
//    //way 1
//    @FindBy(id="username")
//    WebElement usernamef;
//
//    //way2
//    public WebElement usernameElement(){
//        By username =By.id("username");
//        WebElement usernameWeb =driver.findElement(username);
//        return usernameWeb;
//    }
//
//    public WebElement passwordElement(){
//        By password =By.name("password");
//        WebElement passwordWeb =driver.findElement(password);
//        return passwordWeb;
//    }
//
//    public By flashElement(){
//        return By.id("flash");
//    }
//
//    public void loginSteps(String username,String password){
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//        usernamef.clear();
//        usernamef.sendKeys(username);
//        usernamef.sendKeys(password);
//        passwordElement().sendKeys(Keys.ENTER);
//    }
//}
