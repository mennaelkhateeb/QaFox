import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {


    public WebElement getFirstname(WebDriver driver){
        WebElement fname= driver.findElement(By.id("input-firstname"));
        return fname ;
    }

    public WebElement getLastname(WebDriver driver){
        WebElement lname= driver.findElement(By.id("input-lastname"));
        return lname ;
    }
    public WebElement getEmail(WebDriver driver){
        WebElement email= driver.findElement(By.id("input-email"));
        return email ;
    }
    public WebElement getTelephone(WebDriver driver){
        WebElement telephone= driver.findElement(By.id("input-telephone"));
        return telephone ;
    }
    public WebElement getPassword(WebDriver driver){
        WebElement password= driver.findElement(By.id("input-password"));
        return password ;
    }

    public WebElement getPasswordComfirm(WebDriver driver){
        WebElement passwordComfirm= driver.findElement(By.id("input-confirm"));
        return passwordComfirm ;
    }
    public WebElement checkbox(WebDriver driver){
       WebElement check= driver.findElement(By.cssSelector("input[type=\"checkbox\""));
        return check ;
    }

    public WebElement Continue(WebDriver driver){
        WebElement button= driver.findElement(By.cssSelector("input[value=\"Continue\""));
        return button ;
    }

    public WebElement emptyFName(WebDriver driver){
        WebElement emptyFname=driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div[@class='text-danger']"));
        return emptyFname;
    }
    public WebElement emptyLName(WebDriver driver){
        WebElement emptyLname=driver.findElement(By.xpath("//input[@id='input-lastname']/following-sibling::div[@class='text-danger']"));
        return emptyLname;
    }
    public WebElement emptyemail(WebDriver driver){
        WebElement emptyemail=driver.findElement(By.xpath("//input[@id='input-email']/following-sibling::div[@class='text-danger']"));
        return emptyemail;
    }
    public WebElement emptytel(WebDriver driver){
        WebElement emptytelephone=driver.findElement(By.xpath("//input[@id='input-telephone']/following-sibling::div[@class='text-danger']"));
        return emptytelephone;
    }

    public WebElement emptypassword(WebDriver driver){
        WebElement emptypass=driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div[@class='text-danger']"));
        return emptypass;
    }

    public WebElement emptycomfirm(WebDriver driver){
        WebElement emptycomfirmation=driver.findElement(By.xpath("//input[@id='input-confirm']/following-sibling::div[@class='text-danger']"));
        return emptycomfirmation;
    }

    public WebElement emailExist(WebDriver driver){
        WebElement emailexist=driver.findElement(By.xpath("//div[contains(text(), 'Warning: E-Mail Address is already registered!')]"));
        return emailexist;
    }




    public void registersteps(WebDriver driver,String fname,String lname,String email,String tel,String pass,String comfirm ){
        RegisterPage register=new RegisterPage();
        driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/register");
        register.getFirstname(driver).sendKeys(fname);
        register.getLastname(driver).sendKeys(lname);
        register.getEmail(driver).sendKeys(email);
        register.getTelephone(driver).sendKeys(tel);
        register.getPassword(driver).sendKeys(pass);
        register.getPasswordComfirm(driver).sendKeys(comfirm);
        register.checkbox(driver).click();
        register.Continue(driver).click();


    }

}
